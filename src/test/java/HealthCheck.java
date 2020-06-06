import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import root.utillities.*;
import root.*;
import adminTest.*;

import static com.codeborne.selenide.Selenide.open;

public class HealthCheck extends Start {
    private final String projectName = "Engagement";
    private final String testName = " [stage] Health Check ";
    private String result = "`Result:` " + projectName + testName + "passed";
    public String companyName = "КОМПАНИЯ";
    private String login = "tt.test.survey@gmail.com";
    private String password = "tt123456TT";

    public String baseUrl = "https://engagement-stage.talenttechlab.org/login/";

    LoginPage loginPage = new LoginPage();
    GetMail getMail = new GetMail();
    SideMenu sideMenu = new SideMenu();
    Company company = new Company();
    Survey survey = new Survey();
    UsersPage usersPage = new UsersPage();

    @Test
    public void healthChecks() {
        open(baseUrl);
        try {
            loginPage
                    .userValidLogin(login);

            getMail
                    .getInboxFolder(login, password);
            sideMenu
                    .sideMenuTest()
                    .toAllPoolPage()
                    .toAllUserPage()
                    .clickProfile()
                    .toAllCompanyPage();
            company
                    .companiesPageTest()
                    .findAndClickCompanyByName(companyName);
            sideMenu
                    .toAllPoolPage();
            survey
                    .surveysPageTest();
            sideMenu
                    .toAllUserPage();
            usersPage
                    .usersPageTest()
                    .userPopupMenu()
                    .userProfile()
                    .userLogout();

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
        sb.sendResulttoSlack(projectName, result);
        System.out.println(result);
    }
}
