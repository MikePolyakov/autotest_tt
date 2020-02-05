import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class CreateCompany extends Start {

    //создание компании. Достуно только для Администратора системы!
    @Test
    public void company() {

//        open (baseUrl);
        ElementsCollection chekCount = $$("[class^='ant-col ant-col-6']");
        int x = chekCount.size();
        SelenideElement makeCompanyButton = $("[class='ant-btn ant-btn-primary']");
        makeCompanyButton.click();
        //страница создания компании
        SelenideElement companyName = $("[class='page-body__form']");
        companyName.click();
        companyName.setValue(companyNameString);
        //кнопка отменить
        SelenideElement undoButton = $("[class='form-controls__item']");
//        undoButton.click();
        //кнопка Создать компанию
        makeCompanyButton.click();
//        sleep();
        //кнопка перехода на страницу компании
        makeCompanyButton.click();//ВОЗМОЖНО кнопка называется иначе
        //переходим к списку компаний и проверяем, что среди элементов коллекции есть верное название
        open(baseUrl);
        ElementsCollection chekCount1 = $$("[class^='ant-col ant-col-6']");
        int x1 = chekCount1.size();
        Assert.assertEquals(x1, x, "Новая компания не создана!");
        //ДОБАВИТЬ проверку по элементу с нужным названием
        int y = chekCount1.filterBy(Condition.text(companyNameString)).size();
        Assert.assertEquals(y,0,"Нет совпадений в названии компании");

    }
}
