package surveyTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SurveyNordGold {

    public static void clickLinkDidntFindYourSubdivision() {
        $("[class='pseudo-link pb-6']").waitUntil(visible, 10000).click();
    }

    public static void chooseSubdivision() {
        Random random = new Random();
        int i = random.nextInt(6);

        if (i == 0){
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Lefa")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("HSE")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Medical Services")).
                    waitUntil(visible, 10000).click();
        }
        else if (i == 1) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Bissa")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Mining")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Mine Dispatch")).
                    waitUntil(visible, 10000).click();
        }
        else if (i == 2) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Ирокинда")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Служба снабжения")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Склад")).
                    waitUntil(visible, 10000).click();
        }
        else if (i == 3) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Березитовый")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Другие подразделения")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("БСН")).
                    waitUntil(visible, 10000).click();
        }
        else if (i == 4) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.click();
            $$("[class='list-item text-break']").find(Condition.text("Суздаль")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.click();
            $$("[class='list-item text-break']").find(Condition.text("Служба снабжения")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.click();
            $$("[class='list-item text-break']").find(Condition.text("Склад")).
                    waitUntil(visible, 10000).click();
        }
        else if (i == 5) {
            SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            a.waitUntil(visible, 10000).click();
            $$("[class='list-item text-break']").find(Condition.text("Нерюнгри-Гросс")).
                    waitUntil(visible, 10000).click();
            SelenideElement b = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            b.waitUntil(visible, 10000).click();
            $$("[class='list-item text-break']").find(Condition.text("Служба главного энергетика")).
                    waitUntil(visible, 10000).click();
            SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last().
                    waitUntil(visible, 10000);
            c.waitUntil(visible, 10000).click();
            $$("[class='list-item text-break']").find(Condition.text("Электротехническая лаборатория")).
                    waitUntil(visible, 10000).click();
        }
        sleep(300);
    }

    public static void clickButtonNext() {
        $("[class='v-btn v-btn--contained theme--light v-size--default primary']").
                waitUntil(visible, 10000).click();
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
        if ( $$("[placeholder='Введите ответ']").size() != 0) {
            SelenideElement d = $("[placeholder='Введите ответ']").
                    waitUntil(visible, 10000);
            d.setValue(generatorLorem);
            sleep(500);
        }
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
        $("[id='question2']").waitUntil(visible, 10000);
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
        d.get(i).click();
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
        d.get(i).click();
    }

    public static void choseNumberForQuestion5() {
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question5'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(11);
        d.get(i).click();
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
        d.get(i).click();
    }

    public static void choseNumberForQuestion8() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question8'] [class='btn__wrapper display-flex flex-column']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void chooseOptionfromQuestion9() {
        int min = 1;
        int max = 8;
        int diff = max - min;
        Random random = new Random();
        int j = random.nextInt(diff + 1);
        j += min - 1;
        if (j == 7) {
            SelenideElement f = $("[id='question9'] [class='display-inline-flex w-100 mono__answer cursor-pointer last']").
                    waitUntil(visible, 10000);
            f.waitUntil(visible, 10000).click();
        } else {
            ElementsCollection d = $$("[id='question9'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").
                    shouldHaveSize(7);
            d.get(j).waitUntil(visible, 10000).click();
        }
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
        d.get(i).click();
    }

    public static void choseNumberForQuestion11() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question11'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion12() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question12'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion13() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question13'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion14() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question14'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion15() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question15'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion16() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question16'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion17() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question17'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion18() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("[id='question18']").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question18'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion19() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question19'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion20() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question20'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion21() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question21'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion22() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question22'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion23() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question23'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion24() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question24'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion25() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("[id='question25']").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question25'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }


    public static void choseNumberForQuestion26() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("[id='question26']").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question26'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion27() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question27'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion28() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question28'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion29() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question29'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion30() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question30'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion31() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question31'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion32() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("[id='question32']").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question32'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion33() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("[id='question33']").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question33'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion34() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question34'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion35() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question35'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion36() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question36'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }


    public static void choseNumberForQuestion38() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question38'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion39() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question39'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion42() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question42'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion43() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question43'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion44() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[id='question44'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).click();
    }

    public static void choseNumberForQuestion45() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        $("[id='question45']").waitUntil(visible, 10000);
        ElementsCollection d = $$("[id='question45'] [class='v-btn v-btn--contained theme--light v-size--default']").
                shouldHaveSize(6);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion46() {
        SelenideElement r = $("[id='question46'] [class='v-icon notranslate fal fa-angle-down theme--light']").
                waitUntil(visible, 10000);
        r.waitUntil(visible, 10000).click();
        sleep(300);
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(5);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion47() {
        SelenideElement r = $("[id='question47'] [class='v-icon notranslate fal fa-angle-down theme--light']").
                waitUntil(visible, 10000);
        r.click();
        sleep(300);
        int min = 6;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(11);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion48() {
        SelenideElement r = $("[id='question48'] [class='v-icon notranslate fal fa-angle-down theme--light']").
                waitUntil(visible, 10000);
        r.click();
        sleep(300);
        int min = 11;
        int max = 16;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(16);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static void chooseNumberForQuestion49() {
        SelenideElement r = $("[id='question49'] [class='v-icon notranslate fal fa-angle-down theme--light']").
                waitUntil(visible, 10000);
        r.click();
        int min = 16;
        int max = 25;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        ElementsCollection d = $$("[class='v-list-item v-list-item--link theme--light']").
                shouldHaveSize(25);
        d.get(i).waitUntil(visible, 10000).click();
    }

    public static int messageComplete() {
        return $$(byText("СПАСИБО ЗА ВАШЕ ВРЕМЯ И СОТРУДНИЧЕСТВО!")).
                shouldHaveSize(1).size();
    }
}
