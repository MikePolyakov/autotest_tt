package analytics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import root.TextGenerator;
import root.utillities.SlackBot;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class Survey326 extends StartOld {

    String baseUrl = "http://survey.talenttechlab.com/e3861257b5";
    String projectName = "Engagement";
    String testName = " [prod] Nordgold Drive - 2020 ";
    String result = "`Result:` " + projectName + testName + "passed";

    SurveyPageOld welcome = new SurveyPageOld();
    SurveyPageOld page_1 = new SurveyPageOld();
    SurveyPageOld page_2 = new SurveyPageOld();
    SurveyPageOld page_3 = new SurveyPageOld();
    SurveyPageOld page_4 = new SurveyPageOld();
    SurveyPageOld page_5 = new SurveyPageOld();
    SurveyPageOld page_6 = new SurveyPageOld();
    SurveyPageOld page_7 = new SurveyPageOld();
    SurveyPageOld page_8 = new SurveyPageOld();
    SurveyPageOld page_9 = new SurveyPageOld();
    SurveyPageOld page10 = new SurveyPageOld();
    SurveyPageOld last_page = new SurveyPageOld();


    @Test
    public void survey326() {
        int total = 5;
        int count = 1;
        do {
            open(baseUrl);
            try {
                welcome
                        .clickButtonNext()
                        .clickButtonStartSurvey();
                page_1
                        .clickLinkDidntFindYourSubdivision()
                        .chooseSubdivision()
                        .clickButtonNext();
                page_2
                        .chooseAnswerForQuestionLikert(2)
                        .chooseAnswerForQuestionLikert(3)
                        .chooseAnswerForQuestionLikert(4)
                        .clickButtonNext();
                page_3
                        .chooseAnswerForQuestionLikertNPS(5)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikert(7)
                        .clickButtonNext();
                page_4
                        .chooseAnswerForQuestionLikert(8)
                        .chooseOptionForMonoPolyQuestion(9, 1, 8)
                        .inputAnswerForOtherQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page_5
                        .chooseAnswerForQuestionLikert(10)
                        .chooseAnswerForQuestionLikert(11)
                        .chooseAnswerForQuestionLikert(12)
                        .chooseAnswerForQuestionLikert(13)
                        .chooseAnswerForQuestionLikert(14)
                        .chooseAnswerForQuestionLikert(15)
                        .chooseAnswerForQuestionLikert(16)
                        .chooseAnswerForQuestionLikert(17)
                        .clickButtonNext();
                page_6
                        .chooseAnswerForQuestionLikert(18)
                        .chooseAnswerForQuestionLikert(19)
                        .chooseAnswerForQuestionLikert(20)
                        .chooseAnswerForQuestionLikert(21)
                        .chooseAnswerForQuestionLikert(22)
                        .chooseAnswerForQuestionLikert(23)
                        .chooseAnswerForQuestionLikert(24)
                        .chooseAnswerForQuestionLikert(25)
                        .clickButtonNext();
                page_7
                        .chooseAnswerForQuestionLikert(26)
                        .chooseAnswerForQuestionLikert(27)
                        .chooseAnswerForQuestionLikert(28)
                        .chooseAnswerForQuestionLikert(29)
                        .chooseAnswerForQuestionLikert(30)
                        .chooseAnswerForQuestionLikert(31)
                        .chooseAnswerForQuestionLikert(32)
                        .clickButtonNext();
                page_8
                        .chooseAnswerForQuestionLikert(33)
                        .chooseAnswerForQuestionLikert(34)
                        .chooseAnswerForQuestionLikert(35)
                        .chooseAnswerForQuestionLikert(36)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikert(38)
                        .chooseAnswerForQuestionLikert(39)
                        .inputAnswerForSecondQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page_9
                        .chooseAnswerForQuestionLikert(42)
                        .chooseAnswerForQuestionLikert(43)
                        .chooseAnswerForQuestionLikert(44)
                        .chooseAnswerForQuestionLikert(45)
                        .clickButtonNext();
                page10
                        .chooseOptionForVListQuestion(46, 1, 5)
                        .chooseOptionForVListQuestion(47, 6, 11)
                        .chooseOptionForVListQuestion(48, 11, 16)
                        .chooseOptionForVListQuestion(49, 16, 25)
                        .completeSurvey();

                String message = "СПАСИБО ЗА ВАШЕ ВРЕМЯ И СОТРУДНИЧЕСТВО!";
                assertEquals(last_page.messageComplete(message),
                        1,
                        "Опрос не завершен");
                System.out.println("Опрос " + testName + "пройден успешно!" + count  + "/" + total);
                count += 1;

            } catch (Exception | AssertionError e) {
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
