package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DeletePool extends AdminAuthorization {

    public void deletePool(){
        //ищем кнопку(3 точки, расположены вертикально) рядом с названием опроса и нажимаем на нее
        PageNavigator pn = new PageNavigator();
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        pn.findPoolByName(companyPoolString);
        SelenideElement poolMenu = $("[class='page-header page-header--with-steps']");
        SelenideElement changePoolButton = $(poolMenu.find(By.cssSelector("[class='fa fa-ellipsis-v']")));
        changePoolButton.click();
        //ищем кнопку удалить опрос и кликаем по ней
        SelenideElement findChangePopup = $("[class='ant-popover ant-popover-placement-bottom']");
        ElementsCollection changePopUp =$$(findChangePopup.findElements(By.cssSelector("[class^='pop-content__item']")));
        changePopUp.findBy(Condition.text("Удалить опрос")).click();
        //проверка: перешли на страницу все опросы и поискали опрос с названием
        pn.toAllPoolPage();
//        pn.findPoolByNameInAllPool(companyPoolString);
        SelenideElement visiblePage = $("[class='content__wrapper']");
        ElementsCollection listPool = visiblePage.$$("[class^='ant-row-flex ant-row-flex-middle']");
        listPool.size();
        if (listPool.findBy(Condition.text(companyPoolString)).exists()){
            Assert.assertTrue(false, "Опрос с нужным именем найден");
        }
        else{Assert.assertTrue(true, "Нет опроса с нужным именем в списке всех опросов!");}

        System.out.println("deletePool - пройден");
    }
}
