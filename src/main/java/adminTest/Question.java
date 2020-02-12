package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Question {

    public void addQuestionButtonClick(){
        SelenideElement pageContent = $("[class='ant-collapse-content ant-collapse-content-active']");
        SelenideElement addQuestion = pageContent.$("[class='add-entity']");
        addQuestion.click();
        sleep(2000);
    }

    public void chooseAndClickTypeOfQuestion (String s){
        SelenideElement popupAllTypeQuestions = $("[class='ant-popover-content']");
        ElementsCollection allTypeQuestions = popupAllTypeQuestions.$$("[class^='pop-content__item']");
        SelenideElement typeOfQuestion = allTypeQuestions.findBy(Condition.text(s));
        typeOfQuestion.click();
    }



}
