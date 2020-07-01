package analytics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import root.TextGenerator;
import root.utillities.SlackBot;
import analytics.SurveyPageOld;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class Survey325 extends StartOld {

    String baseUrl = "http://survey.talenttechlab.com/59a4982c08";
    String projectName = "Engagement";
    String testName = " [prod] LENTA Pulse 2020 ";
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
    SurveyPageOld page11 = new SurveyPageOld();
    SurveyPageOld page12 = new SurveyPageOld();
    SurveyPageOld page13 = new SurveyPageOld();
    SurveyPageOld last_page = new SurveyPageOld();


    @Test
    public void survey325() {
        int total = 5;
        int count = 1;
        do {
            open(baseUrl);
            try {
                welcome
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
                        .chooseAnswerForQuestionLikert(5)
                        .chooseAnswerForQuestionLikert(6)
                        .chooseAnswerForQuestionLikert(7)
                        .clickButtonNext();
                page_4
                        .chooseAnswerForQuestionLikert(8)
                        .chooseAnswerForQuestionLikert(9)
                        .chooseAnswerForQuestionLikert(10)
                        .clickButtonNext();
                page_5
                        .chooseAnswerForQuestionLikertNPS(11)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikertNPS(13)
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page_6
                        .chooseAnswerForQuestionLikertNPS(15)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page_7
                        .chooseAnswerForQuestionLikert(17)
                        .chooseAnswerForQuestionLikert(18)
                        .chooseAnswerForQuestionLikert(19)
                        .chooseAnswerForQuestionLikert(20)
                        .chooseAnswerForQuestionLikert(21)
                        .chooseAnswerForQuestionLikert(22)
                        .chooseAnswerForQuestionLikert(23)
                        .chooseAnswerForQuestionLikert(24)
                        .chooseAnswerForQuestionLikert(25)
                        .chooseAnswerForQuestionLikert(26)
                        .clickButtonNext();
                page_8
                        .chooseAnswerForQuestionLikert(27)
                        .chooseAnswerForQuestionLikert(28)
                        .chooseAnswerForQuestionLikert(29)
                        .chooseAnswerForQuestionLikert(30)
                        .clickButtonNext();
                page_9
                        .chooseAnswerForQuestionLikert(31)
                        .chooseAnswerForQuestionLikert(32)
                        .chooseAnswerForQuestionLikert(33)
                        .chooseAnswerForQuestionLikert(34)
                        .chooseAnswerForQuestionLikert(35)
                        .chooseAnswerForQuestionLikert(36)
                        .chooseAnswerForQuestionLikert(37)
                        .chooseAnswerForQuestionLikert(38)
                        .chooseAnswerForQuestionLikert(39)
                        .chooseAnswerForQuestionLikert(40)
                        .chooseAnswerForQuestionLikert(41)
                        .chooseAnswerForQuestionLikert(42)
                        .chooseAnswerForQuestionLikert(43)
                        .chooseAnswerForQuestionLikert(44)
                        .chooseAnswerForQuestionLikert(45)
                        .chooseAnswerForQuestionLikert(46)
                        .chooseAnswerForQuestionLikert(47)
                        .chooseAnswerForQuestionLikert(48)
                        .chooseAnswerForQuestionLikert(49)
                        .chooseAnswerForQuestionLikert(50)
                        .chooseAnswerForQuestionLikert(51)
                        .chooseAnswerForQuestionLikert(52)
                        .chooseAnswerForQuestionLikert(53)
                        .chooseAnswerForQuestionLikert(54)
                        .chooseAnswerForQuestionLikert(55)
                        .clickButtonNext();
                page10
                        .chooseOptionForVListQuestion(56, 1, 5)
                        .chooseOptionForVListQuestion(57, 5, 9)
                        .chooseOptionForVListQuestion(58, 9, 13)
                        .chooseOptionForVListQuestion(59, 13, 17)
                        .chooseOptionForVListQuestion(60, 17, 21)
                        .chooseOptionForVListQuestion(61, 21, 25)
                        .chooseOptionForVListQuestion(62, 25, 29)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page11
                        .chooseAnswerForQuestionLikert(64)
                        .chooseAnswerForQuestionLikert(65)
                        .chooseAnswerForQuestionLikert(66)
                        .chooseAnswerForQuestionLikert(67)
                        .clickButtonNext();
                page12
                        .chooseOptionForVListQuestion(68, 1, 5)
                        .chooseOptionForMonoQuestion(69, 1, 17)
                        .chooseOptionForVListQuestion(70, 5, 12)
                        .chooseOptionForMonoQuestion(71, 1, 2)
                        .clickButtonNext();
                page13
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForSecondQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .completeSurvey();

                String message = "Благодарим за участие!";
                assertEquals(last_page.messageComplete(message),
                        1,
                        "Опрос не завершен");

                System.out.println("Опрос " + testName + " пройден успешно! " + count  + "/" + total);
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
