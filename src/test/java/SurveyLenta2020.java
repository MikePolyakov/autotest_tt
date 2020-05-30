import com.codeborne.selenide.*;
import surveyTest.SurveyLenta;
import root.TextGenerator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class SurveyLenta2020 extends StartSurvey{

    @Test(description="Ингейджмент. Лента Пульс 2020")
    public void SurveyLentaTest() {
        for (int i = 0; i < 5; i++) {

            open("http://survey.talenttechlab.com/59a4982c08");

            //страница 1 
            SurveyLenta.clickButtonStartSurvey();

            //страница 2 структура 
            SurveyLenta.clickLinkDidntFindYourSubdivision();
            SurveyLenta.chooseSubdivision();
            SurveyLenta.clickButtonNext();

            //страница 3 (вопросы 2-4) 
            SurveyLenta.choseNumberForQuestion2();
            SurveyLenta.choseNumberForQuestion3();
            SurveyLenta.choseNumberForQuestion4();
            SurveyLenta.clickButtonNext();

            //страница 4 (вопросы 5-7) 
            SurveyLenta.choseNumberForQuestion5();
            SurveyLenta.choseNumberForQuestion6();
            SurveyLenta.choseNumberForQuestion7();
            SurveyLenta.clickButtonNext();

            //страница 5 (вопросы 8-10) 
            SurveyLenta.choseNumberForQuestion8();
            SurveyLenta.choseNumberForQuestion9();
            SurveyLenta.choseNumberForQuestion10();
            SurveyLenta.clickButtonNext();

            //страница 6 (вопросы 11-14) 
            SurveyLenta.choseNumberForQuestion11();
            SurveyLenta.inputAnswerForFirstQuestionOnPage(TextGenerator.generatorText());
            SurveyLenta.choseNumberForQuestion13();
            SurveyLenta.inputAnswerForLastQuestionOnPage(TextGenerator.generatorText());
            SurveyLenta.clickButtonNext();

            //страница 7  (вопросы 15-16) 
            SurveyLenta.choseNumberForQuestion15();
            SurveyLenta.inputAnswerForFirstQuestionOnPage(TextGenerator.generatorText());
            SurveyLenta.clickButtonNext();

            //страница 8  (вопросы 17-26) 
            SurveyLenta.choseNumberForQuestion17();
            SurveyLenta.choseNumberForQuestion18();
            SurveyLenta.choseNumberForQuestion19();
            SurveyLenta.choseNumberForQuestion20();
            SurveyLenta.choseNumberForQuestion21();
            SurveyLenta.choseNumberForQuestion22();
            SurveyLenta.choseNumberForQuestion23();
            SurveyLenta.choseNumberForQuestion24();
            SurveyLenta.choseNumberForQuestion25();
            SurveyLenta.choseNumberForQuestion26();
            SurveyLenta.clickButtonNext();

            //страница 9  (вопросы 27-30) 
            SurveyLenta.choseNumberForQuestion27();
            SurveyLenta.choseNumberForQuestion28();
            SurveyLenta.choseNumberForQuestion29();
            SurveyLenta.choseNumberForQuestion30();
            SurveyLenta.clickButtonNext();

            //страница 10 (вопросы 31-55) 
            SurveyLenta.choseNumberForQuestion31();
            SurveyLenta.choseNumberForQuestion32();
            SurveyLenta.choseNumberForQuestion33();
            SurveyLenta.choseNumberForQuestion34();
            SurveyLenta.choseNumberForQuestion35();
            SurveyLenta.choseNumberForQuestion36();
            SurveyLenta.choseNumberForQuestion37();
            SurveyLenta.choseNumberForQuestion38();
            SurveyLenta.choseNumberForQuestion39();
            SurveyLenta.choseNumberForQuestion40();
            SurveyLenta.choseNumberForQuestion41();
            SurveyLenta.choseNumberForQuestion42();
            SurveyLenta.choseNumberForQuestion43();
            SurveyLenta.choseNumberForQuestion44();
            SurveyLenta.choseNumberForQuestion45();
            SurveyLenta.choseNumberForQuestion46();
            SurveyLenta.choseNumberForQuestion47();
            SurveyLenta.choseNumberForQuestion48();
            SurveyLenta.choseNumberForQuestion49();
            SurveyLenta.choseNumberForQuestion50();
            SurveyLenta.choseNumberForQuestion51();
            SurveyLenta.choseNumberForQuestion52();
            SurveyLenta.choseNumberForQuestion53();
            SurveyLenta.choseNumberForQuestion54();
            SurveyLenta.choseNumberForQuestion55();
            SurveyLenta.clickButtonNext();

            //страница 11 (вопросы 56-63) 
            SurveyLenta.chooseNumberForQuestion56();
            SurveyLenta.chooseNumberForQuestion57();
            SurveyLenta.chooseNumberForQuestion58();
            SurveyLenta.chooseNumberForQuestion59();
            SurveyLenta.chooseNumberForQuestion60();
            SurveyLenta.chooseNumberForQuestion61();
            SurveyLenta.chooseNumberForQuestion62();
            SurveyLenta.inputAnswerForFirstQuestionOnPage(TextGenerator.generatorText());
            SurveyLenta.clickButtonNext();

            //страница 12 (вопросы 64-67) 
            SurveyLenta.choseNumberForQuestion64();
            SurveyLenta.choseNumberForQuestion65();
            SurveyLenta.choseNumberForQuestion66();
            SurveyLenta.choseNumberForQuestion67();
            SurveyLenta.clickButtonNext();

            //страница 13 (вопросы 68-71) 
            SurveyLenta.chooseNumberForQuestion68();
            SurveyLenta.choseOptionfromQuestion69();
            SurveyLenta.chooseNumberForQuestion70();
            SurveyLenta.choseOptionfromQuestion71();
            SurveyLenta.clickButtonNext();

            //страница 14 (вопросы 72-74)
            SurveyLenta.inputAnswerForFirstQuestionOnPage(TextGenerator.generatorText());
            SurveyLenta.inputAnswerForSecondQuestionOnPage(TextGenerator.generatorText());
            SurveyLenta.inputAnswerForLastQuestionOnPage(TextGenerator.generatorText());
            SurveyLenta.complete();

            //страница 15
            assertEquals(SurveyLenta.messageComplete(),
                    1,
                    "Опрос не завершен");
            System.out.println("Опрос пройден успешно! ( " + (i + 1) + " )" );
        }
    }
    @AfterMethod
    public void closeBrowser() {
        WebDriverRunner.getWebDriver().close();
    }
}
