package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Authorization {
    public void inputLogin(String s){
        SelenideElement e = $ ("[placeholder='Email']");
        e.setValue(s);
    }
    public void clickAuthorizationButton(){
        SelenideElement e2 = $ ("[class='ant-btn ant-btn-primary']");
        e2.click();
    }
    public void chooseLogOffClick(){
        SelenideElement findPopup = $("[style='position: absolute; top: 0px; left: 0px; width: 100%;']");
        ElementsCollection findTextPopup= $$(findPopup.findElements(By.cssSelector("[class^='pop-content__item']")));
        for (int x1=0; x1<findTextPopup.size(); x1++) {
            String gg = findTextPopup.get(x1).text();
            if (gg.equals("Выход")) {
                findTextPopup.get(x1).click();
            }
        }
    }
    public SelenideElement inputLoginElement(){
        SelenideElement e = $ ("[placeholder='Email']");
        return e;
    }
}
