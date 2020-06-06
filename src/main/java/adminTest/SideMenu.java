package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class SideMenu {

    public SideMenu sideMenuTest() {
        //проверяем, что на странице есть боковое меню
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']").shouldHaveSize(5);
        Assert.assertEquals(sideMenu.size(), 5, "Боковое меню содержит не 5 пунктов!");
        return this;
    }

    public SideMenu toAllCompanyPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(0).click();
        sleep(2000);
        return this;
    }
    public SideMenu toAllPoolPage(){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(1).click();
        sleep(2000);
        return this;
    }
    public SideMenu toAllReportPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(2).click();
        sleep(2000);
        return this;
    }
    public SideMenu toAllOpenReportPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(3).click();
        sleep(2000);
        return this;
    }
    public SideMenu toAllUserPage(){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(4).click();
        sleep(2000);
        return this;
    }
    public SideMenu clickProfile(){
        SelenideElement avatar = $("[class='avatar']");
        avatar.click();
        return this;
    }

}
