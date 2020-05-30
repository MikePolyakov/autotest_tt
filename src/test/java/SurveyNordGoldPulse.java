import root.TextGenerator;
import surveyTest.SurveyNordGold;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;


public class SurveyNordGoldPulse extends StartSurvey {

    @Test(description = "Nordgold Drive - 2020")
    public void SurveyNordGoldTest() {
        int times = 5;
        for (int i = 0; i < times; i++) {

            //страница опроса
            open("http://survey.talenttechlab.com/e3861257b5");

            //страница 1
            SurveyNordGold.clickButtonNext();

            //страница 2
            SurveyNordGold.clickButtonStartSurvey();

            //страница 3 структура
            SurveyNordGold.clickLinkDidntFindYourSubdivision();
            SurveyNordGold.chooseSubdivision();
            SurveyNordGold.clickButtonNext();

            //страница 4 (вопросы 2-4)
            SurveyNordGold.choseNumberForQuestion2();
            SurveyNordGold.choseNumberForQuestion3();
            SurveyNordGold.choseNumberForQuestion4();
            SurveyNordGold.clickButtonNext();

            //страница 5 (вопросы 5-7)
            SurveyNordGold.choseNumberForQuestion5();
            SurveyNordGold.inputAnswerForFirstQuestionOnPage(TextGenerator.generatorText());
            SurveyNordGold.choseNumberForQuestion7();
            SurveyNordGold.clickButtonNext();

            //страница 6 (вопросы 8-9)
            SurveyNordGold.choseNumberForQuestion8();
            SurveyNordGold.chooseOptionfromQuestion9();
            SurveyNordGold.inputAnswerForFirstQuestionOnPage(TextGenerator.generatorText());
            SurveyNordGold.clickButtonNext();

            //страница 7 (вопросы 10-17)
            SurveyNordGold.choseNumberForQuestion10();
            SurveyNordGold.choseNumberForQuestion11();
            SurveyNordGold.choseNumberForQuestion12();
            SurveyNordGold.choseNumberForQuestion13();
            SurveyNordGold.choseNumberForQuestion14();
            SurveyNordGold.choseNumberForQuestion15();
            SurveyNordGold.choseNumberForQuestion16();
            SurveyNordGold.choseNumberForQuestion17();
            SurveyNordGold.clickButtonNext();

            //страница 8  (вопросы 18-25)
            SurveyNordGold.choseNumberForQuestion18();
            SurveyNordGold.choseNumberForQuestion19();
            SurveyNordGold.choseNumberForQuestion20();
            SurveyNordGold.choseNumberForQuestion21();
            SurveyNordGold.choseNumberForQuestion22();
            SurveyNordGold.choseNumberForQuestion23();
            SurveyNordGold.choseNumberForQuestion24();
            SurveyNordGold.choseNumberForQuestion25();
            SurveyNordGold.clickButtonNext();

            //страница 9  (вопросы 27-32)
            SurveyNordGold.choseNumberForQuestion26();
            SurveyNordGold.choseNumberForQuestion27();
            SurveyNordGold.choseNumberForQuestion28();
            SurveyNordGold.choseNumberForQuestion29();
            SurveyNordGold.choseNumberForQuestion30();
            SurveyNordGold.choseNumberForQuestion31();
            SurveyNordGold.choseNumberForQuestion32();
            SurveyNordGold.clickButtonNext();

            //страница 10 (вопросы 33-41)
            SurveyNordGold.choseNumberForQuestion33();
            SurveyNordGold.choseNumberForQuestion34();
            SurveyNordGold.choseNumberForQuestion35();
            SurveyNordGold.choseNumberForQuestion36();
            SurveyNordGold.inputAnswerForFirstQuestionOnPage(TextGenerator.generatorText());
            SurveyNordGold.choseNumberForQuestion38();
            SurveyNordGold.choseNumberForQuestion39();
            SurveyNordGold.inputAnswerForSecondQuestionOnPage(TextGenerator.generatorText());
            SurveyNordGold.inputAnswerForLastQuestionOnPage(TextGenerator.generatorText());
            SurveyNordGold.clickButtonNext();

            //страница 11 (вопросы 42-45)
            SurveyNordGold.choseNumberForQuestion42();
            SurveyNordGold.choseNumberForQuestion43();
            SurveyNordGold.choseNumberForQuestion44();
            SurveyNordGold.choseNumberForQuestion45();
            SurveyNordGold.clickButtonNext();

            //страница 12 (вопросы 46-49)
            SurveyNordGold.chooseNumberForQuestion46();
            SurveyNordGold.chooseNumberForQuestion47();
            SurveyNordGold.chooseNumberForQuestion48();
            SurveyNordGold.chooseNumberForQuestion49();
            SurveyNordGold.complete();

            //страница 13
            assertEquals(SurveyNordGold.messageComplete(),
                    1,
                    "Опрос не завершен");
            System.out.println("Опрос пройден успешно! ( " + (i + 1) + " из " + times + " )");
        }
    }
    @AfterMethod
    private void closeBrowser() {
        WebDriverRunner.getWebDriver().close();
    }
}
