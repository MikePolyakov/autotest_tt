package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class LoginPage {

    public LoginPage userValidLogin(String login) {
        SelenideElement email = $("[placeholder='Email']").waitUntil(visible, 10000);
        email.setValue(login);
        SelenideElement getLinkButton = $("[class='ant-btn ant-btn-primary']")
                .waitUntil(visible, 10000);
        getLinkButton.click();
        ElementsCollection errorMessage = $$("[class^='error-message']")
                .shouldHaveSize(0);
        Assert.assertEquals(errorMessage.size(), 0, "Email адрес не найден");
        return this;
    }

}
