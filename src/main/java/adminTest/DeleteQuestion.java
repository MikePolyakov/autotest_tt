package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class DeleteQuestion {
    PageNavigator pn = new PageNavigator();
    int pageListSize;
    public void deleteQuestion(){
        // зашли в компанию
        pn.toAllCompanyPage();
//        pn.findCompanyByName(companyNameString);
        // зашли в опрос на страницу конструктор
//        pn.findPoolByName(companyPoolString);
        // посчитали количество страниц. если их 3, то в опросе нет редактируемых страниц!
        SelenideElement findPageList = $("[class='constructor']");
        sleep(3000);
//        находим страницу по названию Страница 1
        ElementsCollection pageList = $$(findPageList.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        pageListSize = pageList.size();
        Assert.assertFalse(pageListSize==3, "В конструкторе нет редактируемых страниц! сначала создайте страницу опроса!");
        sleep (2000);
        for (int i=0; i<pageListSize; i++) {
            SelenideElement xx = pageList.get(i).find("[class='collapse-header']");
            if (xx.text().equals("СТРАНИЦА 1")) {
//находим на странице 1 кнопку открыть и нажимаем ее
                SelenideElement openPageButton = pageList.get(i).find(By.cssSelector("[class='fa fa-chevron-down']"));
                openPageButton.click();
                // нашли ВОПРОС с именем Оргструктура.
                SelenideElement findQuestionsOnPage = pageList.get(i).$("[class='questions-collapse']");
                ElementsCollection allQuestionsOnPage = findQuestionsOnPage.$$(By.cssSelector("[class^='ant-row-flex ant-row-flex-middle']"));
                for (int y = 0; y < allQuestionsOnPage.size(); y++) {
                    sleep(2000);
                    SelenideElement typeOfQuestion = allQuestionsOnPage.get(y).$("[class='question-type']");
                    if (typeOfQuestion.text().equals("Оргструктура")) {
                        //нашли у этого вопроса кнопку удаления и кликнуть по ней
                        SelenideElement deleteQuestion = allQuestionsOnPage.get(y).$("[class='fa fa-trash']");
                        deleteQuestion.click();
                    }
//                    else {Assert.assertTrue(false, "На странице нет вопроса типа Оргструктура!");}
                }
                //проверяем, что вопроса с типом Оргструктура нет на странице
                for (int y = 0; y < allQuestionsOnPage.size(); y++) {

                    SelenideElement typeOfQuestion = allQuestionsOnPage.get(y).$("[class='question-type']");
                    sleep(2000);
                    if (typeOfQuestion.text().equals("Оргструктура")) {
                        //нашли у этого вопроса кнопку удаления и кликнуть по ней
                        Assert.assertTrue(false, "Вопрос не удален!");
                    }
                    else {Assert.assertTrue(true, "Вопрос удален успешно");}
                }
            }
        }
        System.out.println("deleteQuestion - пройден");
    }
}
