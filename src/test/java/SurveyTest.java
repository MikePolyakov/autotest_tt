import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import surveyTest.SurveyPage;

import root.utillities.SlackBot;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class SurveyTest extends Start {

    SurveyPage language = new SurveyPage();
    SurveyPage welcome = new SurveyPage();
    SurveyPage structure = new SurveyPage();
    SurveyPage new_page = new SurveyPage();

    @Test
    public void survey() {
        int total = 1;
        int count = 1;

        do {
            open(baseUrl);
            try {
                language
                        .clickButtonChooseLanguage()
                        .clickButtonNext();
            }
            catch (Exception | AssertionError e) {
                e.printStackTrace();
            }
            try {
                welcome
                        .clickButtonNext();

                if ($(byText("Заполнить анкету")).exists()){
                    welcome
                            .clickButtonStartSurvey();
                }
            }
            catch (Exception | AssertionError e) {
                e.printStackTrace();
            }
            try {
                structure
                        .clickLinkDidntFindYourSubdivision()
                        .chooseSubdivision()
                        .clickButtonNext();
            }
            catch (Exception | AssertionError e) {
                e.printStackTrace();
            }
            try {
                while ($("[data-test='next-btn']").exists()){

                    new_page
                            .answerAllQuestions()
                            .clickButtonNext();
                }

                String actualUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
                System.out.println(actualUrl);
                int position = actualUrl.lastIndexOf("/");
                String pageName = actualUrl.substring(position + 1);

                assertEquals(pageName, "complete", "Опрос не завершен:");

                System.out.println("Опрос " + surveyNumber + " пройден успешно! " + count  + "/" + total);
                count += 1;
            }
            catch (Exception | AssertionError e) {
                e.printStackTrace();
            }
        }
        while (count <= total);
    }

    @AfterTest
    public void closeBrowser() {
        getWebDriver().quit();
        SlackBot.sendResulttoSlack(projectName, result);
    }
}
