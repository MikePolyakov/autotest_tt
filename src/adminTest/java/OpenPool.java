import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class OpenPool extends AdminAuthorization {
    @Test
    public void accessPool() {
        //поискали опрос в списке всех опросов и зашли в него
        PageNavigator pn = new PageNavigator();
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        pn.findPoolByName(companyPoolString);
        sleep(1000);
        // ищем кнопку Запустить
        SelenideElement poolMenu = $("[class='page-header page-header--with-steps']");
        ElementsCollection poolMenuButton = $$(poolMenu.findElements(By.cssSelector("[type^='button']")));
        int ip = poolMenuButton.size();
        poolMenuButton.findBy(Condition.text("Запустить")).click();
//проверка. статус опроса активный(перешли на страницу компании.замем нашли нужную компанию и зашли в нее

        System.out.println("openPool - пройден");
    }
}
