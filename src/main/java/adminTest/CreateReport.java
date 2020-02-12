package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class CreateReport extends AdminAuthorization{

    public void createReport(){
        PageNavigator pn = new PageNavigator();
        //зайти на страницу опросы
        pn.toAllReportPage();
        // нажать кнопку Добавить отчет
        SelenideElement createReportButton = $ ("[class='page-header__controls']");
        createReportButton.click();
// заполнить все необходимые поля (2 страницы?) и еще раз кнопка Добавить отчет
        ElementsCollection inputReport = $$("[class^='page-body__form']");
        SelenideElement inputReportName = inputReport.get(0).find(By.cssSelector("[placeholder='Введите название отчета']"));
        inputReportName.setValue("AutoTestReport");
//выбираем ассоциированную компанию(ту самую, которую создали, название l)
//1.кликнули по плейсхолдеру
        SelenideElement chooseCompany = $("[class='ant-select ant-select-enabled']");
        chooseCompany.click();
//2.ищем список компаний
        ElementsCollection listCollection = $$("[class^='ant-select-dropdown-menu-item']");
        listCollection.findBy(Condition.text(companyPoolString)).click();
//нажимаем кнопку Создать отчет еще раз
        ElementsCollection createReport = $$("[class^='form-controls__item']");
        SelenideElement createReportCklick = createReport.get(0).find(By.cssSelector("[type='button']"));
        createReportCklick.click();
        sleep(2000);
//проверяем, что мы на странице отчета(есть таблица)
        ElementsCollection tableReport =$$("[class^='data-table']");
        Assert.assertEquals(tableReport.size(), 1, "Нет шаблона таблицы отчета");
//проверяем, что на странице со всеми отчетами появился отчет с таким названием
        pn.toAllReportPage();
        ElementsCollection listCollection1 = $$("[class^='item-title']");
        listCollection1.size();
        if(listCollection1.findBy(Condition.text("AutoTestReport")).exists()) {
            listCollection1.findBy(Condition.text("AutoTestReport")).click();
        }
        else {
            Assert.assertTrue(false, "Отчет с заданным названием не создан!");
        }
        System.out.println("createReport - пройден");
    }
}
