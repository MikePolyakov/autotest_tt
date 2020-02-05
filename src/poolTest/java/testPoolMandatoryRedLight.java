import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class testPoolMandatoryRedLight extends StartPool {
    PageNavigatorPool test=new PageNavigatorPool();
    NavigationButtons clickButton = new NavigationButtons();
    Random rand = new Random();

    @Test
    public void pool() {
        open(baseUrl);
        SelenideElement nextButton = $("[title='Нажмите, чтобы продолжить']");
//Приветственная страница
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
//Страница с инструкцией
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 1
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField = $$ ("[class^='survey-screen__error-message']");
        //если надпись есть, то переходим к следующему вопросу
        Assert.assertEquals(mandatoryField.size(), 1, "Нет предупреждения об обязательности вопроса Оргструктура!");
        int n=0;
        for (int i=0; i<=n; i++){
            ElementsCollection orgstrstep1 = $$("[class^='step-search__item']");
            int orgstrstep1_size = orgstrstep1.size(); //посчитали количество полей
            sleep(2000);
            ElementsCollection org1 = $$ ("[class^='ant-select-selection__rendered']");
            int m = org1.size();
            m--;
            org1.get(m).click();
            WebDriver driver = WebDriverRunner.getWebDriver();
            Actions a = new Actions(driver);
            a.sendKeys(Keys.DOWN, Keys.ENTER).build().perform();
            sleep(2000);
            ElementsCollection orgstrstep2 = $$("[class^='step-search__item']");
            int orgstrstep2_size = orgstrstep2.size();
            if (orgstrstep1_size < orgstrstep2_size) {
                n=n+1;
            }
        }
        clickButton.clickToNavigationButton(nextButton);
//страница 2
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField2 = $$ ("[class^='survey-screen__error-message']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField2.size(), 0, "Нет предупреждения об обязательности вопроса Дихотомия 5 ответов!");
        ElementsCollection questionDihotomia5 = $$("[class^='range-buttons-list__item']");
        sleep(2000);
        int dihotomia5_size = questionDihotomia5.size();
        --dihotomia5_size;
        test.chooseAnyAnswerToTheQuestion(dihotomia5_size, questionDihotomia5);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 3
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField3 = $$ ("[class^='survey-screen__error-message']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField3.size(), 0, "Нет предупреждения об обязательности вопроса Дихотомия 7 вариантов ответа!");
        ElementsCollection e5 = $$("[class^='ant-slider-dot']");
        int a5 = e5.size();
        --a5;
        test.chooseAnyAnswerToTheQuestion(a5, e5);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница4
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField4 = $$ ("[class^='survey-screen__error-message']");
        ElementsCollection redLight4 = $$("[class^='text-area text-area--validate-fail js-validate-error']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField4.size(), 1, "Нет предупреждения об обязательности вопроса Открытый!");
        Assert.assertEquals(redLight4.size(), 1, "Нет подсветки вопроса красным у вопроса Открытый!");
        SelenideElement e6 = $("[class='text-area__field']");
        test.enterTextInTextField(e6);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 5
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField5 = $$ ("[class^='survey-screen__error-message']");
        ElementsCollection redLight5 = $$("[class^='survey-screen__question-wrapper--comment-area-validate-fail js-validate-error survey-screen__question-wrapper--likert-validate-fail js-validate-error survey-screen__question-wrapper']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField5.size(), 1, "Нет предупреждения об обязательности вопроса Открытый внедренный!");
        Assert.assertEquals(redLight5.size(), 1, "Нет подсветки красным у вопроса Открытый внедренный!");
        SelenideElement e7 = $("[class='comment-area__field']");
        test.enterTextInTextField(e7);
        sleep(1000);
        ElementsCollection e8 = $$("[class^='range-buttons-list__item']");
//        sleep(2000);
        int a8 = e8.size();
        --a8;
        test.chooseAnyAnswerToTheQuestion(a8,e8);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(3000);
//страница 6
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField6 = $$ ("[class^='survey-screen__error-message']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField6.size(), 1, "Нет предупреждения об обязательности вопроса NPS!");
        ElementsCollection e9 = $$("[class^='ant-slider-dot']");
        sleep(3000);
        int a9 = e9.size();
        --a9;
        test.chooseAnyAnswerToTheQuestion(a9,e9);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 7
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField7 = $$ ("[class^='survey-screen__error-message']");
        ElementsCollection redLight7 = $$("[class^=' survey-screen__question-wrapper--likert-validate-fail js-validate-error survey-screen__question-wrapper']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField7.size(), 1, "Нет предупреждения об обязательности вопроса Шкала Лайкерта!");
        Assert.assertEquals(redLight7.size(), 1, "Нет подсветки красным вопроса Шкала Лайкерта!");
        ElementsCollection e10 =$$("[class^='range-buttons-list__item']");
        sleep(2000);
        int a10 = e10.size();
        --a10;
        test.chooseAnyAnswerToTheQuestion(a10,e10);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 8
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField8 = $$ ("[class^='survey-screen__error-message']");
        ElementsCollection redLight8 = $$("[class^=' survey-screen__question-wrapper--checkbox-validate-fail survey-screen__question-wrapper']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField8.size(), 1, "Нет предупреждения об обязательности вопроса Поливаривный!");
        Assert.assertEquals(redLight8.size(), 1, "Нет подсветки красным вопроса Поливариативный!");
        ElementsCollection e11 = $$("[class^='checkbox__label']");
        sleep(2000);
        int a11 = e11.size();
        --a11;
        test.testClickAllAnswerOfTheQuestion(a11,e11);
        sleep (1000);
        test.chooseAnyAnswerToTheQuestion(a11,e11);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 9
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        ElementsCollection mandatoryField9 = $$ ("[class^='survey-screen__error-message']");
        ElementsCollection redLight9=$$("[name^='js-validate-error']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField9.size(), 1, "Нет предупреждения об обязательности вопроса Моновариативный (радиокнопки)!");
        Assert.assertEquals(redLight9.size(), 1, "Нет подсветки красным вопроса Моновариативный (радиокнопки)!");
        ElementsCollection e12 = $$("[class^='radio__label']");
        sleep(2000);
        int a12 = e12.size();
        --a12;
        test.chooseAnyAnswerToTheQuestion(a12,e12);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 10
        SelenideElement endButton = $ ("[title='Нажмите, чтобы завершить опрос']");
        // пробуем перейти к следующему вопросу и ищем надпись
        clickButton.clickToNavigationButton(endButton);
        sleep(1000);
        ElementsCollection mandatoryField10 = $$ ("[class^='survey-screen__error-message']");
        //если надпись есть, то выбираем ответ и переходим к следующему вопросу
        Assert.assertEquals(mandatoryField10.size(), 1, "Нет предупреждения об обязательности вопроса Моновариативный (выпадающий список)!");
        ElementsCollection e13 = $$ ("[class^='select-list__field']");
        int i13 = e13.size();
        --i13;
        e13.get(i13).click();
        sleep(1000);
        ElementsCollection e14 = $$ ("[class^='select-list__item']");
        int a14=e14.size();
        --a14;
        test.chooseAnyAnswerToTheQuestion(a14,e14);
        sleep(1000);
        clickButton.clickToNavigationButton(endButton);
        sleep(2000);
//завершающая страница
        WebDriverRunner.getWebDriver().quit();
    }

}
