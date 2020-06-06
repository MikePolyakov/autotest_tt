import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import root.TextGenerator;
import surveyTest.SurveyPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class Survey352 extends Start {

    String baseUrl = "http://survey.talenttechlab.com/062a5ae28d";

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
    public void survey352() {
        int total = 2;
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
                        .clickButtonNext();
                page_4
                        .chooseAnswerForQuestionLikert(13)
                        .chooseAnswerForQuestionLikert(14)
                        .chooseAnswerForQuestionLikert(15)
                        .clickButtonNext();
                page_5
                        .chooseAnswerForQuestionLikertNPS(16)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikert(18)
                        .chooseAnswerForQuestionLikert(19)
                        .chooseAnswerForQuestionLikert(20)
                        .chooseAnswerForQuestionLikert(21)
                        .chooseAnswerForQuestionLikert(22)
                        .chooseAnswerForQuestionLikert(23)
                        .clickButtonNext();
                page_6
                        .chooseAnswerForQuestionLikert(24)
                        .chooseAnswerForQuestionLikert(25)
                        .chooseAnswerForQuestionLikert(26)
                        .chooseAnswerForQuestionLikert(27)
                        .chooseAnswerForQuestionLikert(28)
                        .clickButtonNext();
                page_7
                        .chooseAnswerForQuestionLikert(29)
                        .chooseAnswerForQuestionLikert(30)
                        .chooseAnswerForQuestionLikert(31)
                        .chooseAnswerForQuestionLikert(32)
                        .chooseAnswerForQuestionLikert(33)
                        .chooseAnswerForQuestionLikert(34)
                        .chooseAnswerForQuestionLikert(35)
                        .chooseAnswerForQuestionLikert(36)
                        .chooseAnswerForQuestionLikert(37)
                        .clickButtonNext();
                page_8
                        .chooseAnswerForQuestionLikert(38)
                        .chooseAnswerForQuestionLikert(39)
                        .chooseAnswerForQuestionLikert(40)
                        .chooseAnswerForQuestionLikert(41)
                        .chooseAnswerForQuestionLikert(42)
                        .chooseAnswerForQuestionLikert(43)
                        .chooseAnswerForQuestionLikert(44)
                        .chooseAnswerForQuestionLikert(45)
                        .clickButtonNext();
                page_9
                        .chooseAnswerForQuestionLikert(46)
                        .chooseAnswerForQuestionLikert(47)
                        .chooseAnswerForQuestionLikert(48)
                        .chooseAnswerForQuestionLikert(49)
                        .chooseAnswerForQuestionLikert(50)
                        .chooseAnswerForQuestionLikert(51)
                        .chooseAnswerForQuestionLikert(52)
                        .chooseAnswerForQuestionLikert(53)
                        .clickButtonNext();
                page10
                        .chooseOptionForVListQuestion(54, 1, 5)
                        .chooseOptionForVListQuestion(55, 5, 9)
                        .chooseOptionForVListQuestion(56, 9, 13)
                        .chooseOptionForVListQuestion(57, 13, 17)
                        .chooseOptionForVListQuestion(58, 17, 21)
                        .chooseOptionForVListQuestion(59, 21, 25)
                        .chooseOptionForVListQuestion(60, 25, 29)
                        .inputAnswerForOtherQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page11
                        .chooseAnswerForQuestionLikert(62)
                        .chooseAnswerForQuestionLikert(63)
                        .chooseAnswerForQuestionLikert(64)
                        .chooseAnswerForQuestionLikert(65)
                        .clickButtonNext();
                page12
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForSecondQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page13
                        .chooseOptionForVListQuestion(69, 1, 4)
                        .chooseOptionForVListQuestion(70, 4, 7)
                        .chooseOptionForVListQuestion(71, 7, 12)
                        .completeSurvey();

                String message = "СПАСИБО ЗА ВАШЕ ВРЕМЯ И СОТРУДНИЧЕСТВО!";
                assertEquals(last_page.messageComplete(message),
                        1,
                        "Опрос не завершен");
                System.out.println("Опрос TUInsight - 2020 пройден успешно! " + count + "/" + total);
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
