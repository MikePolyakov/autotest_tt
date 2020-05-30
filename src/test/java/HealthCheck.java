import adminTest.AdminPage;
import root.utillities.SlackBot;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.*;

public class HealthCheck extends Start {
    private final String projectName = "Engagement";
    private final String testName = " [stage] Health Check ";
    private String result = "`Result:` " + projectName + testName + "passed";


    @Test
    public void healthChecks() {
        try {
            // открывем страницу
            open("https://engagement-stage.talenttechlab.org/login/");

            // авторизация пользователя
            AdminPage.userLogin();

            // переход по ссылке из почты
            AdminPage.mailLink();

            // тест элементов бокового меню
            ElementsCollection sideMenu = AdminPage.sideMenuTest();

            //тест страницы Компаний
            AdminPage.companiesPageTest();

            //тест страницы Опросов
            AdminPage.surveysPageTest(sideMenu);

            //тест страницы Пользователи
            AdminPage.usersPageTest();

            //тест элементов поп-ап меню пользователя
            AdminPage.userPopupMenu();

            //тест профиля Пользователи
            AdminPage.userProfile();

            //выход
            AdminPage.userLogout();

        } catch (AssertionError a) {
            result = "`Problem:` " + projectName + testName + "failed because: " + a.getMessage();

        } catch (Exception e) {
            result = "`Problem:` " + projectName + testName + "failed because: " + e.getMessage();

        }
    }

    @AfterMethod
    private void closeBrowser() {
        WebDriverRunner.getWebDriver().close();
        SlackBot sb = new SlackBot();
//        sb.sendResulttoSlack(projectName, result);
        System.out.println(result);
    }
}
