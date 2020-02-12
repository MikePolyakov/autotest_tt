package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class Report {
    public void clickCreateReportButton(){
        SelenideElement createReportButton = $ ("[class='page-header__controls']");
        createReportButton.click();
    }

    public void chooseReportName (String s){
        ElementsCollection inputReport = $$("[class^='page-body__form']");
        SelenideElement inputReportName = inputReport.get(0).find(By.cssSelector("[placeholder='Введите название отчета']"));
        inputReportName.setValue(s);
    }

    public void clickOpenReportButton(){
        ElementsCollection inputReport = $$("[class^='page-body__form']");
        SelenideElement openReport = inputReport.get(2).$("[class='ant-checkbox']");
        openReport.click();
    }

    public void chooseAssociatePool(String s){
        //1.кликнули по плейсхолдеру
        SelenideElement chooseCompany = $("[class='ant-select ant-select-enabled']");
        chooseCompany.click();
        //2. фильтруем список по названию
        ElementsCollection listCollection = $$("[class^='ant-select-dropdown-menu-item']");
        listCollection.findBy(Condition.text(s)).click();
    }
    public void clickToCreateReport() {
        ElementsCollection createReport = $$("[class^='form-controls__item']");
        SelenideElement createReportCklick = createReport.get(0).find(By.cssSelector("[type='button']"));
        createReportCklick.click();
        sleep(2000);
    }

    public int checkReportTableSize(){
        return $$("[class^='data-table']").size();
    }

    public SelenideElement checkReportByName(String s){
        ElementsCollection listCollection1 = $$("[class^='item-title']");
        listCollection1.size();
        SelenideElement report = listCollection1.findBy(Condition.text(s));
        return report;
    }

    public void reindexButtonIsClickable(){
        SelenideElement reindexButton = $("[class = 'analityc']").find(By.cssSelector("[class='button']"));
        ExpectedConditions.elementToBeClickable(reindexButton);
    }

    public void checkAnalyticPage(){
        SelenideElement findAnalyticPage = $("[class='page-body survey block']").find(By.cssSelector("[class='analityc']"));
        Assert.assertTrue(findAnalyticPage.getText().equals("Выгрузка ppt отчетов"), "Нет проверочного текста на странице Аналитика");
    }
}
