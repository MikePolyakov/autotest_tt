package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class AdminLogOff{ //extends AdminAuthorization {

    public void logOff() {
        SelenideElement avatar = $("[class='avatar']");
        avatar.click();//ищем на боковой панели кнопку Профиль

        SelenideElement findPopup = $("[style='position: absolute; top: 0px; left: 0px; width: 100%;']");
        ElementsCollection findTextPopup= $$(findPopup.findElements(By.cssSelector("[class^='pop-content__item']")));
        for (int x1=0; x1<findTextPopup.size(); x1++){
            String gg = findTextPopup.get(x1).text();
            if (gg.equals("Выход")){
                findTextPopup.get(x1).click();
            }
        }
            //проверяем, что выполнен логоф (смотрим, что на странице только поле для ввода почты и кнопка получить ссылку)
            SelenideElement e = $("[placeholder='Email']");
            SelenideElement e2 = $("[class='ant-btn ant-btn-primary']");
            Assert.assertNotNull(e, "пользователь не разлогинен");
            Assert.assertNotNull(e2, "пользователь не разлогинен");
        System.out.println("adminLogOff - пройден");
        }

    }

