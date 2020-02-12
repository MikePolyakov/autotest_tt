package root;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

import static com.codeborne.selenide.Selenide.sleep;

public class PageNavigatorPool {
    //выбираем случайным образом один из вариантов ответа (метод 1)
    public void chooseAnyAnswerToTheQuestion(int size, ElementsCollection e){
        Random rand = new Random();
        int x = rand.nextInt(size);
        e.get(x).click();
    }
    //ответ на вопрос с текстовым полем (метод 2)
    public void enterTextInTextField(SelenideElement e){
        e.click();
        e.setValue("собираем много данных");
    }
    //тест вопроса - все варианты кликабельны (метод 4)
    public void testClickAllAnswerOfTheQuestion(int size, ElementsCollection e){
        for (int i=0; i<=size; i++) {
            e.get(i).click();
        }
    }

    //запоминаем индивидуальный код
    public void rememberIndividualKey(String[] f, ElementsCollection e){
        Assert.assertEquals(e.size(), 5, "Индивидуальный код не пять цифр!");
        for (int b=0; b<e.size(); b++) {
            f[b] = e.get(b).getAttribute("innerHTML");
        }
    }

    public void inputIndividualKey(String[] x, ElementsCollection e){
        Assert.assertEquals(e.size(), 5, "Количество полей для ввода кода неверное!");
        sleep(5000);
        WebDriver d = WebDriverRunner.getWebDriver();
        Actions a = new Actions(d);
        for (int f=0; f<e.size(); f++){
            a.sendKeys(Keys.chord(x[f])).build().perform();
        }
    }
}
