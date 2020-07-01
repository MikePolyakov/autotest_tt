package analytics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import root.TextGenerator;
import root.utillities.SlackBot;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class Survey358 extends StartOld {

    String baseUrl = "https://survey.talenttechlab.com/5b5faa3281";
    String projectName = "Engagement";
    String testName = " [prod] Engagement UTKONOS 2020 ";
    String result = "`Result:` " + projectName + testName + "passed";

    SurveyPageOld welcome = new SurveyPageOld();
    SurveyPageOld page_0 = new SurveyPageOld();
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
    SurveyPageOld page14 = new SurveyPageOld();
    SurveyPageOld page15 = new SurveyPageOld();
    SurveyPageOld page16 = new SurveyPageOld();
    SurveyPageOld page17 = new SurveyPageOld();
    SurveyPageOld last_page = new SurveyPageOld();




    @Test
    public void survey358() {
        int total = 5;
        int count = 1;
        do {
            open(baseUrl);
            try {
                welcome
                        .clickButtonNext()
                        .clickButtonStartSurvey();
                page_0
                        .clickLinkDidntFindYourSubdivision()
                        .chooseSubdivision()
                        .clickButtonNext();
                page_1
                        .chooseAnswerForQuestionLikert(2)
                        .chooseAnswerForQuestionLikert(3)
                        .chooseAnswerForQuestionLikert(4)
                        .clickButtonNext();
                page_2
                        .chooseAnswerForQuestionLikert(5)
                        .chooseAnswerForQuestionLikert(6)
                        .chooseAnswerForQuestionLikert(7)
                        .chooseAnswerForQuestionLikert(8)
                        .clickButtonNext();
                page_3
                        .chooseAnswerForQuestionLikertNPS(9)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikertNPS(11)
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikertNPS(13)
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page_4
                        .chooseAnswerForQuestionLikert(15)
                        .chooseAnswerForQuestionLikert(16)
                        .chooseAnswerForQuestionLikert(17)
                        .chooseAnswerForQuestionLikert(18)
                        .clickButtonNext();
                page_5
                        .chooseAnswerForQuestionLikert(19)
                        .chooseAnswerForQuestionLikert(20)
                        .chooseAnswerForQuestionLikert(21)
                        .chooseAnswerForQuestionLikert(22)
                        .clickButtonNext();
                page_6
                        .chooseAnswerForQuestionLikert(23)
                        .clickButtonNext();
                page_7
                        .chooseAnswerForQuestionLikert(24)
                        .chooseAnswerForQuestionLikert(25)
                        .chooseAnswerForQuestionLikert(26)
                        .chooseAnswerForQuestionLikert(27)
                        .chooseAnswerForQuestionLikert(28)
                        .clickButtonNext();
                page_8
                        .chooseAnswerForQuestionLikert(29)
                        .chooseAnswerForQuestionLikert(30)
                        .chooseAnswerForQuestionLikert(31)
                        .chooseAnswerForQuestionLikert(32)
                        .clickButtonNext();
                page_9
                        .chooseAnswerForQuestionLikert(33)
                        .chooseAnswerForQuestionLikert(34)
                        .chooseAnswerForQuestionLikert(35)
                        .chooseAnswerForQuestionLikert(36)
                        .clickButtonNext();
                page10
                        .chooseAnswerForQuestionLikert(37)
                        .chooseAnswerForQuestionLikert(38)
                        .chooseAnswerForQuestionLikert(39)
                        .chooseAnswerForQuestionLikert(40)
                        .clickButtonNext();
                page11
                        .chooseAnswerForQuestionLikert(41)
                        .chooseAnswerForQuestionLikert(42)
                        .chooseAnswerForQuestionLikert(43)
                        .chooseAnswerForQuestionLikert(44)
                        .chooseAnswerForQuestionLikert(45)
                        .clickButtonNext();
                page12
                        .chooseAnswerForQuestionLikert(46)
                        .chooseAnswerForQuestionLikert(47)
                        .chooseAnswerForQuestionLikert(48)
                        .chooseAnswerForQuestionLikert(49)
                        .clickButtonNext();
                page13
                        .chooseOptionForVListQuestion(50, 1, 5)
                        .chooseOptionForVListQuestion(51, 5, 9)
                        .chooseOptionForVListQuestion(52, 9, 13)
                        .chooseOptionForVListQuestion(53, 13, 17)
                        .chooseOptionForVListQuestion(54, 17, 21)
                        .chooseOptionForVListQuestion(55, 21, 25)
                        .chooseOptionForVListQuestion(56, 25, 29)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page14
                        .chooseAnswerForQuestionLikert(58)
                        .chooseAnswerForQuestionLikert(59)
                        .chooseAnswerForQuestionLikert(60)
                        .chooseAnswerForQuestionLikert(61)
                        .clickButtonNext();
                page15
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForSecondQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page16
                        .chooseOptionForVListQuestion(65, 1, 3)
                        .chooseOptionForVListQuestion(66, 3, 6)
                        .chooseOptionForVListQuestion(67, 6, 11)
                        .clickButtonNext();
                page17
                        .chooseAnswerForQuestionLikert(68)
                        .chooseAnswerForQuestionLikert(69)
                        .chooseAnswerForQuestionLikert(70)
                        .completeSurvey();

                String message = "Благодарим Вас за участие в опросе!";
                assertEquals(last_page.messageComplete(message),
                        1,
                        "Опрос не завершен");

                System.out.println("Опрос " + testName + " пройден успешно! "
                        + count + "/"  + total);
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
