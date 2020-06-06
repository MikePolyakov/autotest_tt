package surveyTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class SurveyPage {

    public SurveyPage clickButtonNext() {
        SelenideElement buttonNext = $("[class='v-btn v-btn--contained theme--light v-size--default primary']");
        buttonNext.waitUntil(visible, 10000).click();
        sleep(1000);
        return this;
    }

    public SurveyPage clickButtonStartSurvey() {
        SelenideElement buttonStartSurvey = $(byText("Заполнить анкету"));
        buttonStartSurvey.waitUntil(visible, 10000).click();
        return this;
    }

    public SurveyPage clickLinkDidntFindYourSubdivision() {
        $("[class='pseudo-link pb-6']").waitUntil(visible, 10000).click();
        return this;
    }

    public SurveyPage chooseSubdivision() {
        int v_icon_total = 1;
        boolean new_v_icon = true;
        int last_size = 1;

        do {
            ElementsCollection v_icons = $$("[class='v-input__icon v-input__icon--append']");
            if (v_icons.size() == v_icon_total)
            {
                v_icons.last().waitUntil(visible, 10000).click();
                v_icon_total += 1;
                ElementsCollection departments = $$("[class='v-list-item v-list-item--link theme--light']");
                int max = departments.size();
                int min = last_size;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);
                i += min - 1;
                last_size += diff;
                departments.get(i).waitUntil(visible, 10000).click();
            }
            else {
                new_v_icon = false;
            }
        }
        while (new_v_icon);
        sleep(1000);
        return this;
    }

    public SurveyPage chooseAnswerForQuestionLikert(int number) {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        String question = "[id='question" + number + "']";
        $(question).waitUntil(visible, 10000);
        String ss = question + " [class='v-btn v-btn--contained theme--light v-size--default']";
        ElementsCollection d = $$(ss).shouldHaveSize(max);
        d.get(i).waitUntil(visible, 10000).click();
        return this;
    }

    public SurveyPage chooseAnswerForQuestionLikertNPS(int number) {
        int min = 1;
        int max = 11;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        String question = "[id='question" + number + "']";
        $(question).waitUntil(visible, 10000);
        String ss = question + " [class='btn__wrapper display-flex flex-column']";
        ElementsCollection d = $$(ss).shouldHaveSize(max);
        d.get(i).waitUntil(visible, 10000).click();
        return this;
    }

    public SurveyPage inputAnswerForFirstQuestionOnPage(String generatorLorem) {
        SelenideElement d = $("[placeholder='Введите ответ']").
                waitUntil(visible, 10000);
        d.setValue(generatorLorem);
        sleep(300);
        return this;
    }

    public SurveyPage inputAnswerForSecondQuestionOnPage(String generatorLorem) {
        SelenideElement d = $$("[placeholder='Введите ответ']").get(1).
                waitUntil(visible, 10000).setValue(generatorLorem);
        return this;
    }

    public SurveyPage inputAnswerForLastQuestionOnPage(String generatorLorem) {
        SelenideElement d = $$("[placeholder='Введите ответ']").last().
                waitUntil(visible, 10000);
        d.setValue(generatorLorem);
        return this;
    }

    public SurveyPage inputAnswerForOtherQuestionOnPage(String generatorLorem) {
        if ( $$("[placeholder='Введите ответ']").size() != 0) {
            SelenideElement d = $("[placeholder='Введите ответ']").
                    waitUntil(visible, 10000);
            d.setValue(generatorLorem);
            sleep(500);
        }
        return this;
    }

    public SurveyPage chooseOptionForVListQuestion(int number, int min, int max) {
        String question = "[id='question" + number + "']";
        String v_icon = question + " [class='v-icon notranslate fal fa-angle-down theme--light']";
        SelenideElement r = $(v_icon).waitUntil(visible, 10000);
        r.waitUntil(visible, 10000).click();
        sleep(300);
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        String v_list = "[class='v-list-item v-list-item--link theme--light']";
        ElementsCollection d = $$(v_list).shouldHaveSize(max);
        d.get(i).waitUntil(visible, 10000).click();
        return this;
    }

    public SurveyPage chooseOptionForMonoPolyQuestion(int number, int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int j = random.nextInt(diff + 1);
        j += min - 1;
        String question = "[id='question" + number + "']";
        String last_option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer last']";
        String option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer']";
        if (j == max - 1) {
            SelenideElement f = $(last_option).waitUntil(visible, 10000);
            f.waitUntil(visible, 10000).click();
        } else {
            ElementsCollection d = $$(option).shouldHaveSize(max - 1);
            d.get(j).waitUntil(visible, 10000).click();
        }
        return this;
    }

    public SurveyPage chooseOptionForMonoQuestion(int number, int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int j = random.nextInt(diff + 1);
        j += min - 1;
        String question = "[id='question" + number + "']";
        String last_option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer last']";
        String option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer']";
        if (j == max - 1) {
            SelenideElement f = $(last_option).waitUntil(visible, 10000);
            f.waitUntil(visible, 10000).click();
        } else {
            ElementsCollection d = $$(option).shouldHaveSize(max-1);
            d.get(j).waitUntil(visible, 10000).click();
        }
        return this;

    }


    public SurveyPage completeSurvey() {
        $(byText("Завершить опрос")).waitUntil(visible, 10000).click();
        return this;
    }

    public int messageComplete(String message) {
        return $$(byText(message)).shouldHaveSize(1).size();
    }

    public SurveyPage clickBack() {
        $("[class='v-icon notranslate fal fa-angle-left theme--light']").
                waitUntil(visible, 10000).click();
        return this;
    }
}
