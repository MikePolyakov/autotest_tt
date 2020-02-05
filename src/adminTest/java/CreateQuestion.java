import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class CreateQuestion extends AdminAuthorization{
    @Test
    public void createQuestion() {
        //заходим на страницу компании и переходим в компанию с нужным названием
        PageNavigator pn = new PageNavigator();
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        // ищем опрос по названию и заходим в него(знаем, что мы на странице конструктор)
        pn.findPoolByName(companyPoolString);
        //убедились, что мы на странице конструктора
        //зашли на страницу с названием "Страница n"
        SelenideElement constructor = $("[class='constructor']");
        ElementsCollection allPage = constructor.$$(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']"));
        for (int i=0; i<allPage.size(); i++){
            SelenideElement findPage = allPage.get(i).$(By.cssSelector("[class='collapse-header']"));
            String textPage = findPage.getText();
            if (textPage.equals("СТРАНИЦА 1")){
                //открываем поле страницы
                SelenideElement downButton = allPage.get(i).$("[class='fa fa-chevron-down']");
                downButton.click();
                //ищем кнопку Добавить вопрос и кликаем по ней
                SelenideElement pageContent = $("[class='ant-collapse-content ant-collapse-content-active']");
                SelenideElement addQuestion = pageContent.$(By.cssSelector("[class='add-entity']"));
                addQuestion.click();
                //выбираем тип вопроса (пока просто оргструктура)
                sleep (2000);
                SelenideElement popupAllTypeQuestions = $("[class='ant-popover-content']");
                ElementsCollection allTypeQuestions = popupAllTypeQuestions.$$(By.cssSelector("[class^='pop-content__item']"));
                SelenideElement orgstructureQuestion = allTypeQuestions.findBy(Condition.text("Оргструктура"));
                orgstructureQuestion.click();
            }
        }
//проверка наличия вопроса в конструкторе(какая?)

    }
}
