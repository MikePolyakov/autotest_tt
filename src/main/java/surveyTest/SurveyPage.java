package surveyTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

import root.TextGenerator;


public class SurveyPage {
    int min_v = 1;

    public SurveyPage clickButtonNext() {

        SelenideElement buttonNext = $("[data-test='next-btn']");
        buttonNext.waitUntil(visible, 5000).click();
        sleep(1000);
        return this;
    }

    public SurveyPage clickButtonStartSurvey() {
        SelenideElement buttonStartSurvey = $(byText("Заполнить анкету"));
        buttonStartSurvey.waitUntil(visible, 5000).click();
        return this;
    }

    public SurveyPage clickLinkDidntFindYourSubdivision() {
        $("[class='pseudo-link pb-6']").waitUntil(visible, 5000).click();
        return this;
    }

    public SurveyPage chooseSubdivision() {
        int v_icon_total = 1;
        boolean there_is_v_icon = true;
        int last_size = 1;

        do {
            ElementsCollection v_icons = $$("[class='v-input__icon v-input__icon--append']");
            if (v_icons.size() == v_icon_total)
            {
                v_icons.last().waitUntil(visible, 5000).click();
                v_icon_total += 1;
                ElementsCollection departments = $$("[class='v-list-item v-list-item--link theme--light']");
                int max = departments.size();
                int min = last_size;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);
                i += min - 1;
                last_size += diff;
                departments.get(i).waitUntil(visible, 5000).click();
            }
            else {
                there_is_v_icon = false;
            }
        }
        while (there_is_v_icon);
        sleep(1000);
        System.out.println("pass Structure page");
        return this;
    }

    public SurveyPage answerAllQuestions() {
        ElementsCollection questionsOnPage = $$("[data-test='question']");
        System.out.println("-----------------------");
        System.out.println("questions on page = " + questionsOnPage.size() );


        questionsOnPage.forEach(item->{
            System.out.println("-----------------------");
            String id = item.getAttribute("id");
            id = id.substring(8);
            int idNumber = Integer.parseInt(id);
            System.out.println("id = " + idNumber);
            SelenideElement nextDiv = item.lastChild();
            String questionClass = nextDiv.getAttribute("class");
            System.out.println("class = " + questionClass);


            switch (questionClass) {
                case "likert":
                    SelenideElement newDiv = nextDiv.lastChild();
                    String newClass = newDiv.getAttribute("class");
                    if (newClass.equals("likert__body")) {
                        inputAnswerForOpenQuestion(idNumber, TextGenerator.some_text());
                    } else {
                        chooseAnswerForQuestionLikert(idNumber);
                    }
                    break;
                case "likert nps":
                    chooseAnswerForQuestionLikertNPS(idNumber);
                    break;
                case "mono poly":
                    chooseOptionForMonoPolyQuestion(idNumber);
                    break;
                case "mono":
                    if (nextDiv.find("[class='v-input__append-inner']").exists()) {
                        min_v = chooseOptionForVListQuestion(idNumber, min_v );
                    }
                    else {
                        chooseOptionForMonoQuestion(idNumber);
                    }
                    break;
                case "likert dichotomy":
                    if (nextDiv.find("[class='likert__body seven']").exists()) {
                        chooseAnswerForQuestionLikertDichotomy7(idNumber);
                    }
                    else {
                        chooseAnswerForQuestionLikertDichotomy(idNumber);
                    }
                    break;
            }
        });
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
        $(question).waitUntil(visible, 5000);
        String ss = question + " [class='v-btn v-btn--contained theme--light v-size--default']";
        ElementsCollection d = $$(ss).shouldHaveSize(max);
        d.get(i).waitUntil(visible, 5000).click();
        System.out.println("pass");
        return this;
    }

    public SurveyPage chooseAnswerForQuestionLikertDichotomy(int number) {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        String question = "[id='question" + number + "']";
        $(question).waitUntil(visible, 5000);
        String ss = question + " [class='v-btn v-btn--contained theme--light v-size--default default']";
        ElementsCollection d = $$(ss);
        System.out.println("dichotomy size = " + d.size());
        d.shouldHaveSize(max);
        d.get(i).waitUntil(visible, 5000).click();
        System.out.println("pass");
        return this;
    }

    public SurveyPage chooseAnswerForQuestionLikertDichotomy7(int number) {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min - 1;
        String question = "[id='question" + number + "']";
        $(question).waitUntil(visible, 5000);
        String ss = question + " [class='v-btn v-btn--contained theme--light v-size--default']";
        ElementsCollection d = $$(ss).shouldHaveSize(max);
        d.get(i).waitUntil(visible, 5000).click();
        System.out.println("pass");
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
        $(question).waitUntil(visible, 5000);
        String ss = question + " [class='btn__wrapper display-flex flex-column']";
        ElementsCollection d = $$(ss).shouldHaveSize(max);
        d.get(i).waitUntil(visible, 5000).click();
        System.out.println("pass");
        return this;
    }


    public SurveyPage inputAnswerForOpenQuestion(int number, String generatorLorem) {
        String question = "[id='question" + number + "']";
        String ss = question + " [placeholder='Введите ответ']";
        SelenideElement d = $(ss).waitUntil(visible, 5000);
        d.setValue(generatorLorem);
        sleep(500);

        System.out.println("pass");
        return this;
    }

    public int chooseOptionForVListQuestion(int number, int min_v) {
        String question = "[id='question" + number + "']";
        String v_icon = question + " [class='v-icon notranslate fal fa-angle-down theme--light']";
        SelenideElement r = $(v_icon).waitUntil(visible, 5000);
        r.waitUntil(visible, 5000).click();
        sleep(300);
        String v_list = "[class='v-list-item v-list-item--link theme--light']";
        ElementsCollection d = $$(v_list);
        int max_v = d.size();

        if (max_v < min_v) {
            min_v = 1;
        }
        int diff = max_v - min_v;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min_v - 1;

        System.out.println(d.get(i).getText());
        d.get(i).waitUntil(visible, 5000).click();
        System.out.println("pass");
        return max_v;
    }

    public SurveyPage chooseOptionForMonoPolyQuestion(int number) {
        String question = "[id='question" + number + "']";
        String option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer']";
        String last_option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer last']";
        ElementsCollection d = $$(option);
        int max_mono_poly = d.size() + 1;
        int min_mono_poly = 1;
        int diff = max_mono_poly - min_mono_poly;
        Random random = new Random();
        int j = random.nextInt(diff + 1);
        j += min_mono_poly - 1;

        if (j == max_mono_poly - 1) {
            SelenideElement f = $(last_option).waitUntil(visible, 5000);
            f.waitUntil(visible, 5000).click();
        } else {

            d.get(j).waitUntil(visible, 5000).click();
        }
        System.out.println("pass");
        return this;
    }

    public SurveyPage chooseOptionForMonoQuestion(int number) {
        String question = "[id='question" + number + "']";
        String option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer no-table']";
        String last_option = question + " [class='display-inline-flex w-100 mono__answer cursor-pointer no-table last']";

        ElementsCollection d = $$(option);
        int max_m = d.size() + 1;


        int min_mono = 1;
        int diff = max_m - min_mono;
        Random random = new Random();
        int j = random.nextInt(diff + 1);
        j += min_mono - 1;


        if (j == max_m - 1) {
            SelenideElement f = $(last_option).waitUntil(visible, 5000);
            System.out.println(f.getText());
            f.waitUntil(visible, 5000).click();
        } else {
            System.out.println(d.get(j).getText());
            d.get(j).waitUntil(visible, 5000).click();
        }
        return this;

    }

    public SurveyPage completeSurvey() {
        $(byText("Завершить опрос")).waitUntil(visible, 5000).click();
        System.out.println("pass");
        return this;

    }

    public int messageComplete(String message) {
        return $$(byText(message)).shouldHaveSize(1).size();
    }

    public SurveyPage clickBack() {
        $("[class='v-icon notranslate fal fa-angle-left theme--light']").
                waitUntil(visible, 5000).click();
        return this;
    }
}
