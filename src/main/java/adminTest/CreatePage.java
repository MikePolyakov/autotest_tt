package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class CreatePage extends AdminAuthorization {
    boolean str = false;
    //проверяем, что мы находимся в конструкторе опрсов. если нет, то переходим в него

    public void createPage(){
        //заходим на страницу компании и переходим в компанию с нужным названием
        PageNavigator pn = new PageNavigator();
        Company c = new Company();
        Survey sr = new Survey();
        pn.toAllCompanyPage();
        c.findAndClickCompanyByName(companyNameString);
 //       sr.findAndClickPoolByName(companyPoolString);
        //проверяем количество страниц
        SelenideElement findPageList = $("[class='constructor']");
        sleep(1000);
        ElementsCollection pageList = $$(findPageList.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        pageListSize = pageList.size();
        //добавляем страницу
    sleep(1000);
        pn.addPage(findPageList);
        //проверяем, что количество страниц стало +1
        SelenideElement findPageListNew = $("[class='constructor']");
        ElementsCollection pageListNew = $$(findPageListNew.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        int newpagesize = pageListNew.size();
        Assert.assertTrue(newpagesize==pageListSize+1, "Новая страница не создана");
        String s = "СТРАНИЦА "+(newpagesize-3);

        //проверяем, что в списке страниц есть страница с названием Страница 1
//        SelenideElement findPageList = $("[class='constructor']");
//        sleep(3000);
//        находим страницу по названию Страница 1
//        ElementsCollection pageList = findPageList.$$("[class^='ant-collapse-item ant-collapse-no-arrow']");
    ElementsCollection getNamePage =findPageListNew.$$("[class^='collapse-header']");
    if (getNamePage.findBy(Condition.text(s)).exists()){
        str = true;
    }

 /*       for (int i=0; i<newpagesize--; i++){
            SelenideElement xx = pageList.get(i).find("[class='collapse-header']");
            if(xx.text().equals(s)){
     //           xx.click();
                return  true;
            }
//            else{str = false;}
        }*/
        Assert.assertTrue (str, "Нет страницы с именем "+ s);
        //также проверяем, что у страницы есть 4 кнопки(редактировать, переместить, удалить и раскрыть)
        System.out.println("createPage - пройден");

}
}
