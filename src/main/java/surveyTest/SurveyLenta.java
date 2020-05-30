package surveyTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SurveyLenta {

    public static void clickLinkDidntFindYourSubdivision() {
        $("[class='pseudo-link pb-6']").waitUntil(visible, 10000).click();
    }

    public static void chooseSubdivision() {
        Random random = new Random();
        int i = random.nextInt(6);

        if (i == 0) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Торговые Комплексы")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Центр")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Центр 5")).
                    waitUntil(visible, 10000).click();
            SelenideElement d = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            d.click();
            $$("[class='list-item text-break']").find(Condition.text(" Лента-27 (г. Балашиха) ")).
                    waitUntil(visible, 10000).click();
            SelenideElement e = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            e.click();
            $$("[class='list-item text-break']").find(Condition.text(" Грузовая зона-27 (г. Балашиха) ")).
                    waitUntil(visible, 10000).click();
        } else if (i == 1) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Торговые Комплексы")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Юг")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").
                    last().waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Юг 1")).click();
            SelenideElement d = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            d.click();
            $$("[class='list-item text-break']").find(Condition.text(" Лента-33 (г. Аксай) ")).
                    waitUntil(visible, 10000).click();
            SelenideElement e = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            e.click();
            $$("[class='list-item text-break']").find(Condition.text(" Администрация ТК-33 (г. Аксай) ")).
                    waitUntil(visible, 10000).click();
        } else if (i == 2) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Центральный Офис и Региональные дирекции")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Региональная дирекция-9052 (г. Самара)")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Региональная дирекция-9052 (г. Самара)")).
                    waitUntil(visible, 10000).click();

        } else if (i == 3) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Центральный Офис и Региональные дирекции")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Офис")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Дирекция по маркетингу и стратегии")).
                    waitUntil(visible, 10000).click();
            SelenideElement d = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            d.click();
            $$("[class='list-item text-break']").find(Condition.text("Служба цифрового маркетинга")).
                    waitUntil(visible, 10000).click();


        } else if (i == 4) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Торговые Комплексы")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Волга")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Волга 2")).
                    waitUntil(visible, 10000).click();
            SelenideElement d = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            d.click();
            $$("[class='list-item text-break']").find(Condition.text("Лента-50 (г. Йошкар-Ола)")).
                    waitUntil(visible, 10000).click();
            SelenideElement e = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            e.click();
            $$("[class='list-item text-break']").find(Condition.text(" Администрация ТК-50 (г. Йошкар-Ола) ")).
                    waitUntil(visible, 10000).click();


        } else if (i == 5) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Центральный Офис и Региональные дирекции")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Региональная дирекция-9093 (г. Екатеринбург)")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Региональная дирекция-9093 (г. Екатеринбург)")).
                    waitUntil(visible, 10000).click();
        }
        sleep(500);
    }

    public static void clickButtonNext() {
        $("[class='v-btn v-btn--contained theme--light v-size--default primary']").
                waitUntil(visible, 10000).click();
        sleep(500);
    }

    public static void clickButtonStartSurvey() {
        $(byText("Заполнить анкету")).
                waitUntil(visible, 10000).click();
    }

    public static void complete() {
        $(byText("Завершить опрос")).
                waitUntil(visible, 10000).click();
    }

    public static void clickBack() {
        $("[class='v-icon notranslate fal fa-angle-left theme--light']").
                waitUntil(visible, 10000).click();
    }

    public static void inputAnswerForFirstQuestionOnPage(String generatorLorem) {
        SelenideElement d = $("[placeholder='Введите ответ']").
                waitUntil(visible, 10000);
        d.setValue(generatorLorem);
    }

    public static void inputAnswerForSecondQuestionOnPage(String generatorLorem) {
        SelenideElement d = $$("[placeholder='Введите ответ']").get(1).
                waitUntil(visible, 10000).setValue(generatorLorem);
    }

    public static void inputAnswerForLastQuestionOnPage(String generatorLorem) {
        SelenideElement d = $$("[placeholder='Введите ответ']").last().
                waitUntil(visible, 10000);
        d.setValue(generatorLorem);
    }

    public static void choseNumberForQuestion2() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question2").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question2'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion3() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question3'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion4() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question4'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion5() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question5").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question5'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion6() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question6'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion7() {
        // стр.3 для условия меньше 6 выбираем int min = 1; int max = 5;
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question7'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion8() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question8").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question8'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion9() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question9'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion10() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("[id='question10']").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question10'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion11() {
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question11").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question11'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(11);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion13() {
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question13'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(11);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion15() {
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question15").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question15'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(11);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion17() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question17").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question17'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion18() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question18'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion19() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question19'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion20() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question20'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion21() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question21'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion22() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question22'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion23() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question23'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion24() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question24'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion25() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question25'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion26() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question26'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion27() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question27").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question27'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion28() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question28'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion29() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question29'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion30() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question30'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion31() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question31").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question31'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion32() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question32'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion33() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question33'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion34() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question34'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion35() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question35'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion36() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question36'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion37() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question37'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion38() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question38'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion39() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question39'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion40() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question40'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion41() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question41'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion42() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question42'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion43() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question43'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion44() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question44'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion45() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question45'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion46() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question46'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion47() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question47'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion48() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question48'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion49() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question49'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion50() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question50'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion51() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question51'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion52() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question52'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion53() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question53'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion54() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question54'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion55() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question55'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion56() {
        SelenideElement r = $("[id='question56'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question56").waitUntil(visible, 10000);
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(5);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion57() {
        SelenideElement r = $("[id='question57'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 5;
        int max = 9;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(9);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion58() {
        SelenideElement r = $("[id='question58'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 9;
        int max = 13;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(13);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion59() {
        SelenideElement r = $("[id='question59'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 13;
        int max = 17;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(17);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion60() {
        SelenideElement r = $("[id='question60'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 17;
        int max = 21;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(21);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void chooseNumberForQuestion61() {
        SelenideElement r = $("[id='question61'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 21;
        int max = 25;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(25);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion62() {
        SelenideElement r = $("[id='question62'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 25;
        int max = 29;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(29);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion64() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question64").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question64'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion65() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question65'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseNumberForQuestion66() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question66'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseNumberForQuestion67() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question67'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion68() {
        SelenideElement r = $("[id='question68'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("#question68").waitUntil(visible, 10000);
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(5);
        d.get(i).waitUntil(visible, 10000).click();
    }


    public static void choseOptionfromQuestion69() {
        int min = 1;
        int max = 16;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question69'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").
                shouldHaveSize(16);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion70() {
        SelenideElement r = $("[id='question70'] [class='v-icon notranslate fal fa-angle-down theme--light']");
        r.waitUntil(visible, 10000).click();
        int min = 5;
        int max = 12;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(12);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void choseOptionfromQuestion71() {
        Random random = new Random();
        int j = random.nextInt(2);
        if (j == 0) {
            SelenideElement m = $("[id='question71'] [class='display-inline-flex w-100 mono__answer cursor-pointer']");
            m.waitUntil(visible, 10000).click();
        } else if (j == 1) {
            SelenideElement f = $("[id='question71'] [class='display-inline-flex w-100 mono__answer cursor-pointer last']");
            f.waitUntil(visible, 10000).click();
        }
    }

    public static int messageComplete() {
        return $$(byText("Благодарим за участие!")).
                shouldHaveSize(1).size();
    }

}
