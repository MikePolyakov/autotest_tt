package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SideMenu {
    public void toAllCompanyPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(0).click();
        sleep(2000);
    }
    public void toAllPoolPage(){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(1).click();
        sleep(2000);
    }
    public void toAllReportPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(2).click();
        sleep(2000);
    }
    public void toAllOpenReportPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(3).click();
        sleep(2000);
    }
    public void toAllUserPage(){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(4).click();
        sleep(2000);
    }
    public void clickProfile(){
        SelenideElement avatar = $("[class='avatar']");
        avatar.click();
    }

}
