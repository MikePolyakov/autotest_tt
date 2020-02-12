package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class CreatePool extends AdminAuthorization {
//    String l = "тиорлдж";
/*@Test
public void test(){
    String result="";
    sleep(1500);
    PageNavigator pn = new PageNavigator();
    pn.toAllPoolPage();
    SelenideElement visiblePage = $("[class='content__wrapper']");
    ElementsCollection listPool = visiblePage.$$("[class^='ant-row-flex ant-row-flex-middle']");
    listPool.size();
    try{//(listPool.filter(Condition.value(poolName)).{
        listPool.findBy(Condition.text(companyPoolString)).exists();
//        if (listPool.findBy(Condition.text(poolName)).exists(); //){
//            listPool.findBy(Condition.text(poolName));
        result = "Опорос с названием " + companyPoolString + " есть в списке всех опросов!";
    }
    catch (Exception e) {
        result = "Нет опроса с именем " + companyPoolString + " в списке всех опросов!";
    }
    System.out.println(result);
}*/

    //(dependsOnMethods = "adminAutorizaciya")
    public void createPool() {
        //нашли компанию с нужным именем
        sleep(1500);
        PageNavigator pn = new PageNavigator();
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        sleep(2000);
//ищем кнопку Добавить опрос и кликаем по ней
        SelenideElement makePoolButton = $("[class='ant-btn ant-btn-primary']");
        makePoolButton.click();
        //ищем текстовое поле и вводим в него название опроса
        SelenideElement createPoolName = $("[placeholder='Введите название опроса']");
        createPoolName.setValue(companyPoolString);
        //ищем и нажимаем кнопку Далее
        makePoolButton.click();
        //редактируем (?) срок проведения опроса. или не трогаем и просто тыкаем Далее
        makePoolButton.click();
        //выбираем ассоциированную компанию(ту самую, которую создали, название l)
        //1.кликнули по плейсхолдеру
        SelenideElement chooseCompany = $("[class='ant-select ant-select-enabled']");
        chooseCompany.click();
        //2.ищем список компаний
        ElementsCollection listCollection = $$("[class^='ant-select-dropdown-menu-item']");
        listCollection.findBy(Condition.text(companyNameString)).click();
//нажимаем Создать опрос
        makePoolButton.click();
        //перекинуло на страницу конструктора опроса(можно это проверить, поискав кнопку запуска или кнопки меню)
        sleep(2000);
        ElementsCollection runTestButton = $$("[class^='ant-btn ant-btn-success']");
        Assert.assertFalse(runTestButton.size() == 0, "Опрос не создан!");
//надо проверять, что создан шаблон: есть 3 страницы и кнопка
        ElementsCollection checkTemplate = $$("[class^='ant-collapse-item ant-collapse-no-arrow']");
        Assert.assertEquals(checkTemplate.size(), 3, "В шаблоне опроса не 3 страницы!");
        //проверяем, что в списке всех опросов есть опрос с таким названинем
        pn.toAllPoolPage();
//        pn.findPoolByNameInAllPool(companyPoolString);
        SelenideElement visiblePage = $("[class='content__wrapper']");
        ElementsCollection listPool = visiblePage.$$("[class^='ant-row-flex ant-row-flex-middle']");
        listPool.size();
        if (listPool.findBy(Condition.text(companyPoolString)).exists()){
            Assert.assertTrue(true, "Опрос с нужным именем найден");
        }
        else{Assert.assertTrue(false, "Нет опроса с нужным именем в списке всех опросов!");}
        System.out.println("createPool - пройден");
    }
}
