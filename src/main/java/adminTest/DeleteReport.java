package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class DeleteReport extends AdminAuthorization{

    public void deleteReport(){
        //перешли на страницу отчетов
        PageNavigator pn = new PageNavigator();
        pn.toAllReportPage();
        //проверяем, что есть отчет с нужным названием заходим в него
        ElementsCollection listCollection1 = $$("[class^='item-title']");
        listCollection1.size();
        if(listCollection1.findBy(Condition.text("AutoTestReport")).exists()) {
            listCollection1.findBy(Condition.text("AutoTestReport")).click();
        }
        else {
            Assert.assertTrue(false, "Нет отчета с заданным именем!");
        }
        //ищем кнопку удалить и нажимаем
        SelenideElement findButtons = $("[class='ant-row-flex']");
        SelenideElement deleteReportButton = findButtons.$(By.cssSelector("[class='fa fa-trash']"));
        deleteReportButton.click();
        sleep(2000);
        SelenideElement confirmButtons = $("[class='ant-popover-inner-content']");
        SelenideElement confirmButtonsYes = confirmButtons.$(By.cssSelector("[class='ant-btn ant-btn-alert ant-btn-sm']"));
        confirmButtonsYes.click();
        sleep(2000);
        listCollection1.size();
        if(listCollection1.findBy(Condition.text("AutoTestReport")).exists()) {
            Assert.assertTrue(true, "Отчет не удален!");
        }
        else {
            Assert.assertTrue(true, "Нет отчета с заданным именем!");
        }
        System.out.println("deleteReport - пройден");
    }
}
