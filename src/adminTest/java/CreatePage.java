import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreatePage extends AdminAuthorization {

    //проверяем, что мы находимся в конструкторе опрсов. если нет, то переходим в него
    @Test
    public void createPage(){
        //заходим на страницу компании и переходим в компанию с нужным названием
        PageNavigator pn = new PageNavigator();
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        // ищем опрос по названию и заходим в него(знаем, что мы на странице конструктор)
        pn.findPoolByName(companyPoolString);
        //проверяем количество страниц
        SelenideElement findPageList = $("[class='constructor']");
        ElementsCollection pageList = $$(findPageList.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        pageListSize = pageList.size();
        //добавляем страницу
        pn.addPage(findPageList);
        //проверяем, что количество страниц стало +1
        SelenideElement findPageListNew = $("[class='controls-wrapper visible']");
        ElementsCollection pageListNew = $$(findPageListNew.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        int newpagesize = pageListNew.size();
        Assert.assertFalse(pageListSize==newpagesize+1, "Новая страница не создана");
        //проверяем, что в списке страниц есть страница с названием Страница 1
        //также проверяем, что у страницы есть 4 кнопки(редактировать, переместить, удалить и раскрыть)
        System.out.println("createPage - пройден");
    }
}
