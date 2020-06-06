import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import root.TextGenerator;
import surveyTest.SurveyPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class Survey325 extends Start {

    String baseUrl = "http://survey.talenttechlab.com/59a4982c08";

    SurveyPage welcome = new SurveyPage();
    SurveyPage page_1 = new SurveyPage();
    SurveyPage page_2 = new SurveyPage();
    SurveyPage page_3 = new SurveyPage();
    SurveyPage page_4 = new SurveyPage();
    SurveyPage page_5 = new SurveyPage();
    SurveyPage page_6 = new SurveyPage();
    SurveyPage page_7 = new SurveyPage();
    SurveyPage page_8 = new SurveyPage();
    SurveyPage page_9 = new SurveyPage();
    SurveyPage page10 = new SurveyPage();
    SurveyPage page11 = new SurveyPage();
    SurveyPage page12 = new SurveyPage();
    SurveyPage page13 = new SurveyPage();
    SurveyPage last_page = new SurveyPage();


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

                System.out.println("Опрос ЛЕНТА Пульс 2020 пройден успешно! " + count  + "/" + total);
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
    }
}
