package analytics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import root.TextGenerator;
import root.utillities.SlackBot;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class Survey353 extends StartOld {

    String baseUrl = "http://survey.talenttechlab.com/422d116596";
    String projectName = "Engagement";
    String testName = " [prod] Engagement SeverGroup Medicine 2020 ";
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
    public void survey353() {
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
                        .chooseAnswerForQuestionLikert(5)
                        .chooseAnswerForQuestionLikert(6)
                        .chooseAnswerForQuestionLikert(7)
                        .chooseAnswerForQuestionLikert(8)
                        .clickButtonNext();
                page_4
                        .chooseAnswerForQuestionLikertNPS(9)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikertNPS(11)
                        .inputAnswerForSecondQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikertNPS(13)
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page_5
                        .chooseAnswerForQuestionLikert(15)
                        .chooseAnswerForQuestionLikert(16)
                        .chooseAnswerForQuestionLikert(17)
                        .chooseAnswerForQuestionLikert(18)
                        .chooseAnswerForQuestionLikert(19)
                        .chooseOptionForMonoPolyQuestion(20, 1, 8)
                        .inputAnswerForOtherQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikert(21)
                        .chooseAnswerForQuestionLikert(22)
                        .chooseAnswerForQuestionLikert(23)
                        .clickButtonNext();
                page_6
                        .chooseAnswerForQuestionLikert(24)
                        .chooseAnswerForQuestionLikert(25)
                        .chooseAnswerForQuestionLikert(26)
                        .clickButtonNext();
                page_7
                        .chooseAnswerForQuestionLikert(27)
                        .chooseAnswerForQuestionLikert(28)
                        .chooseAnswerForQuestionLikert(29)
                        .chooseAnswerForQuestionLikert(30)
                        .chooseAnswerForQuestionLikert(31)
                        .clickButtonNext();
                page_8
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
                page_9
                        .chooseOptionForVListQuestion(56, 1, 5)
                        .chooseOptionForVListQuestion(57, 5, 9)
                        .chooseOptionForVListQuestion(58, 9, 13)
                        .chooseOptionForVListQuestion(59, 13, 17)
                        .chooseOptionForVListQuestion(60, 17, 21)
                        .chooseOptionForVListQuestion(61, 21, 25)
                        .chooseOptionForVListQuestion(62, 25, 29)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page10
                        .chooseAnswerForQuestionLikert(64)
                        .chooseAnswerForQuestionLikert(65)
                        .chooseAnswerForQuestionLikert(66)
                        .chooseAnswerForQuestionLikert(67)
                        .clickButtonNext();
                page11
                        .chooseAnswerForQuestionLikert(68)
                        .chooseAnswerForQuestionLikert(69)
                        .chooseAnswerForQuestionLikert(70)
                        .chooseAnswerForQuestionLikert(71)
                        .chooseAnswerForQuestionLikert(72)
                        .clickButtonNext();
                page12
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForSecondQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page13
                        .chooseOptionForMonoQuestion(76, 1, 2)
                        .chooseOptionForMonoQuestion(77, 1, 8)
                        .chooseOptionForMonoQuestion(78, 1, 6)
                        .chooseOptionForMonoQuestion(79, 1, 6)
                        .completeSurvey();

                String message = "Благодарим за участие в опросе!";
                assertEquals(last_page.messageComplete(message),
                        1,
                        "Опрос не завершен");
                System.out.println("Опрос " + testName + " пройден успешно! "
                        + count + "/" + total);
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
