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

public class testPoolContinueLater extends StartPool {
    PageNavigatorPool test=new PageNavigatorPool();
    NavigationButtons clickButton = new NavigationButtons();
    Random rand = new Random();
    String[] myKey = new String[5];

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
// Выбираем ответ на Оргструктура и препываем опрос
        SelenideElement continueLater = $("[title='Нажмите, чтобы продолжить позднее']");
        int y = rand.nextInt(2);
        if (y==0) {
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
            //           clickButton.clickToNavigationButton(continueLater);
        }
        if (y==1) {
            SelenideElement e1 = $("[class='link-button']");
            sleep(2000);
            e1.click();
            SelenideElement e2 = $("[placeholder='Выберите вариант']");
            e2.click();
            sleep(2000);
            ElementsCollection e3 = $$("[class^='search-select-list__item']");
//        int a3 = e3.size();
//            --a3;
            int a3 = 5;
//сейчас некорректно работает выбор оргструктуры из выпадающего списка, поэтому а3=7
            test.chooseAnyAnswerToTheQuestion(a3, e3);
            sleep(1000);

        }

//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        ElementsCollection individualKey = $$("[class^='circle-info__item']");
        test.rememberIndividualKey(myKey, individualKey);
        SelenideElement continueLaterPage = $("[title='Нажмите, чтобы прервать опрос']");
        clickButton.clickToNavigationButton(continueLaterPage);
        SelenideElement chooseLanguage = $ ("[class='language-choice-button__image-wrapper']");
        chooseLanguage.click();
        SelenideElement writeYouKey = $("[title='Нажмите, чтобы ввести код и продолжить']");
        clickButton.clickToNavigationButton(writeYouKey);
        ElementsCollection inputIndividualKey = $$("[class^='circle-input__mask-item']");
        sleep(3000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);

//страница 2
        ElementsCollection questionDihotomia5 = $$ ("[class^='range-buttons-list__item']");
        sleep (2000);
        int dihotomia5_size = questionDihotomia5.size();
        --dihotomia5_size;
        Assert.assertEquals(dihotomia5_size, 4, "Неверное количество ответов на вопрос Дихотомия 5 кнопок");
        test.testClickAllAnswerOfTheQuestion(dihotomia5_size, questionDihotomia5);
        sleep(1000);
        test.chooseAnyAnswerToTheQuestion(dihotomia5_size, questionDihotomia5);
        sleep(1000);

//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 3
        ElementsCollection e5 = $$("[class^='ant-slider-dot']");
        int a5 = e5.size();
        --a5;
        Assert.assertEquals(a5, 6, "Неверное количество ответов на вопрос Дихотомия 7 вариантов на шкале");
//        test.testClickAllAnswerOfTheQuestion(a5, e5);
//        sleep(1000);
        test.chooseAnyAnswerToTheQuestion(a5, e5);
        sleep(1000);
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(3000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
//страница4
        SelenideElement e6 = $("[class='text-area__field']");
        test.enterTextInTextField(e6);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
//страница 5
        SelenideElement e7 = $("[class='comment-area__field']");
        test.enterTextInTextField(e7);
        sleep(1000);
        ElementsCollection e8 = $$("[class^='range-buttons-list__item']");
        int a8 = e8.size();
        --a8;
        Assert.assertEquals(a8, 5, "Неверное количество ответов на вопрос Открытый внедренный (Шкала Лайкерта)");
//        test.testClickAllAnswerOfTheQuestion(a8,e8);
//        sleep (1000);
        test.chooseAnyAnswerToTheQuestion(a8,e8);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
//страница 6
        ElementsCollection e9 = $$("[class^='ant-slider-dot']");
        sleep(3000);
        int a9 = e9.size();
        --a9;
        Assert.assertEquals(a9, 10, "Неверное количество ответов на вопрос NPS");
//вот тут почему-то не прощелкиваются все значения(???)
//        test.testClickAllAnswerOfTheQuestion(a9,e9);
//        sleep (1000);
        test.chooseAnyAnswerToTheQuestion(a9,e9);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(2000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 7
        ElementsCollection e10 =$$("[class^='range-buttons-list__item']");
        sleep(2000);
        int a10 = e10.size();
        --a10;
        Assert.assertEquals(a10, 5, "Неверное количество ответов на вопрос Шкала Лайкерта");
//        test.testClickAllAnswerOfTheQuestion(a10,e10);
//        sleep (1000);
        test.chooseAnyAnswerToTheQuestion(a10,e10);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(3000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 8
        ElementsCollection e11 = $$("[class^='checkbox__label']");
        sleep(2000);
        int a11 = e11.size();
        --a11;
        test.testClickAllAnswerOfTheQuestion(a11,e11);
        sleep (1000);
        test.chooseAnyAnswerToTheQuestion(a11,e11);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(3000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 9
        ElementsCollection e12 = $$("[class^='radio__label']");
        sleep(2000);
        int a12 = e12.size();
        --a12;
        test.testClickAllAnswerOfTheQuestion(a12,e12);
        sleep (1000);
        test.chooseAnyAnswerToTheQuestion(a12,e12);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(2000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(2000);
//страница 10
        SelenideElement e13 = $ ("[placeholder='Выберите вариант']");
        e13.click();
        sleep(1000);
        ElementsCollection e14 = $$ ("[class^='select-list__item']");
        int a14=e14.size();
        --a14;
        test.chooseAnyAnswerToTheQuestion(a14,e14);
        sleep(1000);
        SelenideElement endButton = $ ("[title='Нажмите, чтобы завершить опрос']");
//как-то оптимизировать
        clickButton.clickToNavigationButton(continueLater);
        sleep(2000);
        clickButton.clickToNavigationButton(continueLaterPage);
        clickButton.clickToNavigationButton(chooseLanguage);
        clickButton.clickToNavigationButton(writeYouKey);
        sleep(1000);
        test.inputIndividualKey(myKey, inputIndividualKey);
        sleep(1000);
        clickButton.clickToNavigationButton(nextButton);
        sleep(1000);
        clickButton.clickToNavigationButton(endButton);
        sleep(2000);
//завершающая страница
//проверка, что нельзя войти в опрос с использованным кодом
        open(baseUrl);
        clickButton.clickToNavigationButton(writeYouKey);
        test.inputIndividualKey(myKey, inputIndividualKey);
        ElementsCollection errorMessage = $$("[class^='survey-password-screen__error-message']");
        Assert.assertEquals(errorMessage.size(), 0, "Нет предупреждения, что код неверный!");
//закрываем браузер
        WebDriverRunner.getWebDriver().quit();
        System.out.println("testPoolContinueLater - прошел");
    }
}

