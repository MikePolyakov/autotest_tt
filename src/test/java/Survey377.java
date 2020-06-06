import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import root.TextGenerator;
import surveyTest.SurveyPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;


public class Survey377 extends Start {

    String baseUrl = "https://survey.talenttechlab.com/28b4a8de59";

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
    SurveyPage page14 = new SurveyPage();
    SurveyPage page15 = new SurveyPage();
    SurveyPage page16 = new SurveyPage();
    SurveyPage page17 = new SurveyPage();
    SurveyPage last_page = new SurveyPage();


    @Test
    public void survey377() {
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
                        .clickButtonNext();
                page_3
                        .chooseAnswerForQuestionLikert(5)
                        .chooseAnswerForQuestionLikert(6)
                        .chooseAnswerForQuestionLikert(7)
                        .chooseAnswerForQuestionLikert(8)
                        .chooseAnswerForQuestionLikert(9)
                        .chooseAnswerForQuestionLikert(10)
                        .clickButtonNext();
                page_4
                        .chooseAnswerForQuestionLikert(11)
                        .chooseAnswerForQuestionLikert(12)
                        .chooseAnswerForQuestionLikert(13)
                        .chooseAnswerForQuestionLikert(14)
                        .chooseOptionForMonoPolyQuestion(15,1,6)
                        .inputAnswerForOtherQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page_5
                        .chooseAnswerForQuestionLikert(16)
                        .chooseAnswerForQuestionLikert(17)
                        .chooseAnswerForQuestionLikert(18)
                        .chooseAnswerForQuestionLikert(19)
                        .chooseAnswerForQuestionLikert(20)
                        .clickButtonNext();
                page_6
                        .chooseAnswerForQuestionLikert(21)
                        .chooseAnswerForQuestionLikert(22)
                        .clickButtonNext();
                page_7
                        .chooseAnswerForQuestionLikert(23)
                        .chooseAnswerForQuestionLikert(24)
                        .chooseAnswerForQuestionLikert(25)
                        .chooseAnswerForQuestionLikert(26)
                        .chooseAnswerForQuestionLikert(27)
                        .clickButtonNext();
                page_8
                        .chooseAnswerForQuestionLikert(28)
                        .chooseAnswerForQuestionLikert(29)
                        .chooseAnswerForQuestionLikert(30)
                        .chooseAnswerForQuestionLikert(31)
                        .chooseAnswerForQuestionLikert(32)
                        .clickButtonNext();
                page_9
                        .chooseAnswerForQuestionLikert(33)
                        .chooseAnswerForQuestionLikert(34)
                        .chooseAnswerForQuestionLikert(35)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikert(37)
                        .chooseAnswerForQuestionLikert(38)
                        .clickButtonNext();
                page10
                        .chooseOptionForMonoQuestion(39, 1, 5)
                        .chooseOptionForMonoQuestion(40, 1, 5)
                        .chooseOptionForMonoQuestion(41, 1, 5)
                        .chooseOptionForMonoQuestion(42, 1, 5)
                        .chooseOptionForMonoQuestion(43, 1, 5)
                        .chooseOptionForMonoQuestion(44, 1, 5)
                        .chooseOptionForMonoQuestion(45, 1, 5)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page11
                        .chooseAnswerForQuestionLikert(47)
                        .chooseAnswerForQuestionLikert(48)
                        .chooseAnswerForQuestionLikert(49)
                        .chooseAnswerForQuestionLikert(50)
                        .clickButtonNext();
                page12
                        .chooseAnswerForQuestionLikert(51)
                        .chooseAnswerForQuestionLikert(52)
                        .chooseAnswerForQuestionLikert(53)
                        .clickButtonNext();
                page13
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page14
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page15
                        .chooseOptionForMonoQuestion(57, 1, 5)
                        .chooseOptionForMonoQuestion(58, 1, 4)
                        .chooseOptionForMonoQuestion(59, 1, 6)
                        .chooseOptionForMonoQuestion(60, 1, 6)
                        .clickButtonNext();
                page16
                        .chooseAnswerForQuestionLikertNPS(61)
                        .inputAnswerForFirstQuestionOnPage(TextGenerator.some_text())
                        .chooseAnswerForQuestionLikertNPS(63)
                        .inputAnswerForLastQuestionOnPage(TextGenerator.some_text())
                        .clickButtonNext();
                page17
                        .chooseAnswerForQuestionLikert(65)
                        .chooseAnswerForQuestionLikert(66)
                        .chooseAnswerForQuestionLikert(67)
                        .completeSurvey();


                String message = "Благодарим за заполнение анкеты!";
                assertEquals(last_page.messageComplete(message),
                        1,
                        "Опрос не завершен");
                System.out.println("Опрос Энергопульс 2020 Силовые Машины пройден успешно! "
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
    }
}
