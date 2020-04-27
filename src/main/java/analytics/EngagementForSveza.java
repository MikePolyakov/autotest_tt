package analytics;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static org.testng.Assert.assertEquals;

public class EngagementForSveza {

    @Test(description="Ингейджмент генерация данных. Свеза")
    public void generationProfilePuls() {
        for (int i = 0; i < 10; i++) {

            Selenide.open("https://survey-stage.talenttechlab.org/survey/4430fba203/welcome");
            sleep(1000);
            clickButtonNext();
            sleep(1000);
            //страница 2

            clickButtonNextToProfile();
            sleep(5000);

            //страница 3 структура
            clickLink();
            sleep(500);
            chooseSubdivision();
            sleep(500);
            clickButtonNext();
            sleep(1000);

            //страница 4 3 + список
            choseNumberForQuestion2();
            sleep(500);
            choseNumberForQuestion3();
            sleep(500);
            choseNumberForQuestion4();
            sleep(500);
            choseAnswerForQuestion5();
            sleep(500);
            clickButtonNext();
            sleep(3000);

            //страница 5
            choseNumberForQuestion6();
            sleep(500);
            inputAnswerForFirstQuestionOnPage(generatorText());
            sleep(500);
            choseNumberForQuestion8();
            sleep(500);
            inputAnswerForLastQuestionOnPage(generatorText());
            sleep(500);
            clickButtonNext();
            sleep(1000);


            //страница 6 3 вопроса по 6
            choseNumberForQuestion10();
            sleep(500);
            choseNumberForQuestion11();
            sleep(500);
            choseNumberForQuestion12();
            sleep(500);
            clickButtonNext();
            sleep(2000);


            //страница 7  1 вопрос+ответ
            choseNumberForQuestion13();
            sleep(500);
            inputAnswerForFirstQuestionOnPage(generatorText());
            sleep(500);
            clickButtonNext();
            sleep(2000);

            //страница 8  2 вопроса по 6
            choseNumberForQuestion15();
            sleep(500);
            choseNumberForQuestion16();
            sleep(500);
            clickButtonNext();
            sleep(2000);

            //страница 9
            choseNumberForQuestion17();
            sleep(500);
            choseOption1fromQuestion18();
            sleep(500);
            choseNumberForQuestion19();
            sleep(500);
            choseNumberForQuestion20();
            sleep(500);
            choseNumberForQuestion21();
            sleep(500);
            choseNumberForQuestion22();
            sleep(500);
            clickButtonNext();
            sleep(2000);

            //страница 10
            choseNumberForQuestion23();
            sleep(500);
            choseNumberForQuestion24();
            sleep(500);
            choseNumberForQuestion25();
            sleep(500);
            choseNumberForQuestion26();
            sleep(500);
            choseNumberForQuestion27();
            sleep(500);
            inputAnswerForFirstQuestionOnPage(generatorText());
            sleep(500);
            clickButtonNext();
            sleep(2000);

            //страница 11
            choseNumberForQuestion29();
            sleep(500);
            choseNumberForQuestion30();
            sleep(500);
            choseNumberForQuestion31();
            sleep(500);
            choseNumberForQuestion32();
            sleep(500);
            choseNumberForQuestion33();
            sleep(500);
            choseNumberForQuestion34();
            sleep(500);
            choseNumberForQuestion35();
            sleep(500);
            choseNumberForQuestion36();
            sleep(500);
            choseNumberForQuestion37();
            sleep(500);
            choseNumberForQuestion38();
            sleep(500);
            choseNumberForQuestion39();
            sleep(500);
            choseNumberForQuestion40();
            sleep(500);
            choseNumberForQuestion41();
            sleep(500);
            choseNumberForQuestion42();
            sleep(500);
            choseNumberForQuestion43();
            sleep(500);
            choseNumberForQuestion44();
            sleep(500);
            choseNumberForQuestion45();
            sleep(500);
            choseNumberForQuestion46();
            sleep(500);
            choseNumberForQuestion47();
            sleep(500);
            choseNumberForQuestion48();
            sleep(500);
            choseNumberForQuestion49();
            sleep(500);
            choseNumberForQuestion50();
            sleep(500);
            choseNumberForQuestion51();
            sleep(500);
            choseNumberForQuestion52();
            sleep(500);
            clickButtonNext();
            sleep(2000);

            //страница 12
            choseNumberForQuestion53();
            sleep(500);
            choseOption1fromQuestion54();
            sleep(500);
            inputAnswerForFirstQuestionOnPage(generatorText());
            sleep(500);
            inputAnswerForQuestion56(generatorText());
            sleep(500);
            inputAnswerForLastQuestionOnPage(generatorText());
            sleep(500);
            clickButtonNext();
            sleep(2000);

            //страница 12
            inputAnswerForFirstQuestionOnPage(generatorText());
            sleep(500);
            inputAnswerForQuestion59(generatorText());
            sleep(500);
            inputAnswerForLastQuestionOnPage(generatorText());
            sleep(500);
            clickButtonNext();
            sleep(2000);

//страница 13
            chooseSubdivision61();
            sleep(500);
            chooseSubdivision62();
            sleep(500);
            chooseSubdivision63();
            sleep(500);
            choseOptionfromQuestion64();
            clickButtonNext();
            sleep(2000);

//страница 14
            chooseSubdivision65();
            sleep(500);
            chooseSubdivision66();
            sleep(500);
            chooseSubdivision67();
            sleep(500);
            chooseSubdivision68();
            sleep(500);
            chooseSubdivision69();
            sleep(500);
            chooseSubdivision70();
            sleep(500);
            chooseSubdivision71();
            sleep(500);
            inputAnswerForLastQuestionOnPage(generatorText());
            sleep(700);
            complete();

            sleep(2000);
            assertEquals(massageComplete(),
                    1,
                    "Опрос не завершен");
            System.out.println("Опрос пройден успешно!");
        }

    }


    @AfterMethod
    private void closeBrowser() {
        close();
    }

    private void choseAnswerForQuestion5() {
        int min = 1;
        int max = 4;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question5'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(4);
        d.get(i).click();}


    public int massageComplete() {
        return $$(byText("Спасибо за участие!")).size();
    }

    private void clickLink() {
        //$("[class='pseudo-link pt-3']").click();
        $(byText("Не нашли свое подразделение?")).click();}

    private void chooseSubdivision() {
        SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        c.click();
        sleep(300);
        $$( "[class='list-item text-break']").find(Condition.text("СВЕЗА-Лес")).click();
        sleep(300);
        SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        a.click();
        sleep(300);
        $$( "[class='list-item text-break']").find(Condition.text("Дирекция по внутренним коммуникациям")).click();
        sleep(300);
      /*  SelenideElement v = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        v.click();
        sleep(300);
        $$( "[class='list-item text-break']").find(Condition.text(" ОСП Северсталь Череповец ")).click();
        sleep(300);
        SelenideElement s = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        s.click();
        sleep(500);
        $$( "[class='list-item text-break']").find(Condition.text("Финансы_ОСП Северсталь Череповец (Руководитель - Ю.Г. Деряга)")).click();*/
    }

    private void clickButtonNext() {
        $(byText("Далее")).click(); }

    private void clickButtonNextToProfile() {
        $(byText("Заполнить анкету")).click();
    }

    private void complete() {
        $(byText("Завершить опрос")).click();
    }

    private void clickBack() {
        $("[class='v-icon notranslate fal fa-angle-left theme--light']").click();
    }

    private void inputAnswerForFirstQuestionOnPage(String generatorProfessions) {
        SelenideElement d = $("[placeholder='Введите ответ']");
        sleep(100);
        d.setValue(generatorProfessions); }

    private void inputAnswerForLastQuestionOnPage(String generatorProfessions) {
        SelenideElement d = $$("[placeholder='Введите ответ']").last();
        d.setValue(generatorProfessions);
    }

    private void choseNumberForQuestion2() {
        // стр.2 для условия 9 или 10 жестко задаем 9 или 10;
        // стр.2 для условия от 0 до 6 выбираем int min = 1; int max = 6;
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question2'] [class='v-btn v-btn--contained theme--light v-size--default']").shouldHaveSize(6);
        d.get(i).click(); }

    private void choseNumberForQuestion3() {
        // стр.2 для условия 9 или 10 жестко задаем 9 или 10;
        // стр.2 для условия от 0 до 6 выбираем int min = 1; int max = 6;
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question3'] [class='v-btn v-btn--contained theme--light v-size--default']").shouldHaveSize(6);
        d.get(i).click(); }

     public void choseNumberForQuestion4() {
        // стр.2 для условия от 0 до 6 выбираем int min = 1; int max = 6;
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question4'] [class='v-btn v-btn--contained theme--light v-size--default']").shouldHaveSize(6);
        d.get(i).click(); }


    public void choseNumberForQuestion6() {
        // стр.3 для условия меньше 6 выбираем int min = 1; int max = 5;
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question6'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(11);
        d.get(i).click(); }

    public void choseNumberForQuestion8() {
        // стр.3 для условия меньше 6 выбираем int min = 1; int max = 5;
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question8'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(11);
        d.get(i).click(); }

    public void choseNumberForQuestion10() {
        // стр.5 для условия меньше 5 выбираем int min = 1; int max = 4;
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question10'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }


    public void choseNumberForQuestion11() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question11'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion12() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question12'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion13() {
        // стр.3 для условия меньше 6 выбираем int min = 1; int max = 5;
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question13'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(11);
        d.get(i).click(); }

    public void choseNumberForQuestion15() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question15'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion16() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question16'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion17() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question17'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion19() {
        SelenideElement s= $(byText( "Я понимаю, как обратиться к коллегам из компаний за пределами \"Свеза\" для обмена опытом и знаниями"));
        s.scrollTo();
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question19'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion20() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question20'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion21() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question21'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion22() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question22'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion23() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question23'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion24() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question24'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion25() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question25'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion26() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question26'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion27() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question27'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion29() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question29'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion30() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question30'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion31() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question31'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion32() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question32'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion33() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question33'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion34() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question34'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion35() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question35'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion36() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question36'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion37() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question37'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion38() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question38'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion39() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question39'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion40() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question40'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion41() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question41'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion42() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question42'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion43() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question43'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion44() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question44'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion45() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question45'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion46() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question46'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion47() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question47'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion48() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question48'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion49() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question49'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion50() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question50'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion51() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question51'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion52() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question52'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion53() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question53'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    private void choseOption1fromQuestion54() {
        int min = 1;
        int max = 4;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question54'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(4);
        d.get(i).click();
    }

    private void inputAnswerForQuestion56(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question56'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion59(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question59'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }


    private void chooseSubdivision61() {
        SelenideElement r = $("[id='question61'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[class='v-list-item__title']").shouldHaveSize(5);
        d.get(i).click();}

    private void chooseSubdivision62() {
        SelenideElement r = $("[id='question62'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        $$( "[class='v-list-item__title']").find(Condition.text("25-29 лет")).click();
        sleep(300);
    }

    private void chooseSubdivision63() {
        SelenideElement r = $("[id='question63'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        $$( "[class='v-list-item__title']").find(Condition.text("Менее 3 месяцев")).click();
        sleep(300);
    }

    private void chooseSubdivision64() {
        SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        c.click();
        sleep(300);
        $$( "[class='v-list-item__title']").find(Condition.text("3-5 лет")).click();
        sleep(300);
    }

    private void chooseSubdivision65() {
        SelenideElement r = $("[id='question65'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[class='v-list-item__title']").shouldHaveSize(5);
        d.get(i).click();
    }

    private void chooseSubdivision66() {
        SelenideElement r = $("[id='question66'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 6;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[class='v-list-item__title']").shouldHaveSize(10);
        d.get(i).click();
    }

    private void chooseSubdivision67() {
        SelenideElement r = $("[id='question67'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 11;
        int max = 15;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[class='v-list-item__title']").shouldHaveSize(15);
        d.get(i).click();
    }

    private void chooseSubdivision68() {
        SelenideElement r = $("[id='question68'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 16;
        int max = 20;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[class='v-list-item__title']").shouldHaveSize(20);
        d.get(i).click();
    }

    private void chooseSubdivision69() {
        SelenideElement r = $("[id='question69'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 24;
        int max = 25;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[class='v-list-item__title']").shouldHaveSize(25);
        d.get(i).click();
    }

    private void chooseSubdivision70() {
        SelenideElement r = $("[id='question70'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 26;
        int max = 30;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$(" [class='v-list-item__title']").shouldHaveSize(30);
        d.get(i).click();
    }

    private void chooseSubdivision71() {
        SelenideElement r = $("[id='question71'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.click();
        sleep(300);
        int min = 34;
        int max = 35;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$(" [class='v-list-item__title']").shouldHaveSize(35);
        d.get(i).click();
    }

    private void choseOptionfromQuestion64() {
        //$(byText( "Служба по обеспечению бизнеса (СОБ)")).click();
        SelenideElement s= $(byText( "Безопасность труда и экология"));
        sleep(200);
        s.scrollTo();
        int min = 1;
        int max = 21;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        ElementsCollection d = $$("[id='question64'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(21);
        d.get(i).click();
    }

    private void choseOption1fromQuestion18() {
        int min = 1;
        int max = 8;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question18'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(8);
        d.get(i).click();
    }

    public static String generatorText(){
        String result = "";
        String text= "src/main/resources/textgenerator.txt";
        Random r = new Random();
        try {
            Object[] texts = Files.readAllLines(Paths.get(text)).toArray();
            result = texts[r.nextInt(texts.length)].toString();
        }
        catch (Exception e) {}

        return result + " " + result + " " + result; }

}
