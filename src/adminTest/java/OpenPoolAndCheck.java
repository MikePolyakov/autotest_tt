import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class OpenPoolAndCheck extends CreatePool {
    @Test
    public void accessPool(){
        //есть созданный опрос
        //добавить проверку, что мы находимся на странице Конструктор опроса
        SelenideElement poolMenu = $("[class='page-header page-header--with-steps']");
        ElementsCollection poolMenuButton = $$(poolMenu.findElements(By.cssSelector("[type^='button']")));
        int ip = poolMenuButton.size();
        poolMenuButton.findBy(Condition.text("Запустить")).click();
        //проверка. статус опроса активный(перешли на страницу компании.замем нашли нужную компанию и зашли в нее
        SelenideElement sideMenu = $("[class='sidebar']");
        ElementsCollection sideMenuButtons= $$(sideMenu.findElements(By.cssSelector("[class^='side-menu__item ']")));
        for (int i=0; i<sideMenuButtons.size(); i++){
            ElementsCollection findOpros = $$(sideMenuButtons.get(i).findElements(By.cssSelector("[title='Компании']")));
            if (findOpros.size()!=0){
                sideMenuButtons.get(i).click();
            }
        }
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        allCompanies.size();
//фильтруем элементы списка по совпадению со строкой
        int y = allCompanies.filterBy(Condition.text(companyNameString)).size();
        ElementsCollection allCompanyName = $$("[class^='card__title']");

        for (int i = 0; i < allCompanyName.size(); i++) {
            SelenideElement e2 = allCompanyName.get(i);
            String line = e2.text();
//если строка совпала, то переходим к этому элементу списка и кликаем по нему.
            if (companyNameString.equals(line)) {
                e2.click();
            }
        }
//фильтруем список опросов в компании по нужному имени
        SelenideElement listPool1 = $("[class='controls-wrapper visible']");
        ElementsCollection listPool = $$(listPool1.findElements(By.cssSelector("[class^='entity-list__item-wrapper']")));
//System.out.println(listPool.size());
        for (int mm=0; mm<listPool.size(); mm++){
            SelenideElement poolName = listPool.get(mm).find(By.cssSelector("[class='item-title']"));
            String poolNm = poolName.text();
            if (poolNm.equals(companyPoolString)){
                SelenideElement poolList =listPool.get(mm);
                ElementsCollection qq = $$(poolList.findElements(By.cssSelector("[class^='status-label status-label--active']")));
//Assert.assertNotEquals(qq.size(), 1 , "Статус опроса активный");
                Assert.assertFalse(qq.size()==0, "Статус опроса не активный!");
                condition = qq.get(0).text();
                System.out.println(condition);
            }
        }
        System.out.println(condition);

    }
}
