package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class ClosePool extends AdminAuthorization {

    public void completePool(){
        PageNavigator pn = new PageNavigator();
        //есть созданный опрос
        //предполагаем, что мы не знаем, где находимся в данной точке. тогда ищем компанию с нужным именем, заходим в нее и ищем опрос
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        sleep(2000);
        pn.findPoolByName(companyPoolString);
        sleep(1000);
        //проверяем статус. должен быть активный
        //добавить проверку, что мы находимся на странице Конструктор опроса
        SelenideElement poolMenu = $("[class='page-header page-header--with-steps']");
        ElementsCollection poolMenuButton = $$(poolMenu.findElements(By.cssSelector("[type^='button']")));
//        int ip = poolMenuButton.size();
        poolMenuButton.findBy(Condition.text("Завершить")).click();
        //проверка. статус опроса активный(перешли на страницу компании.замем нашли нужную компанию и зашли в нее
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        sleep(2000);
        pn.findPoolByName(companyPoolString);
        sleep(2000);

//фильтруем список опросов в компании по нужному имени
        SelenideElement listPool1 = $("[class='controls-wrapper visible']");
        ElementsCollection listPool = $$(listPool1.findElements(By.cssSelector("[class^='entity-list__item-wrapper']")));
        System.out.println(listPool.size());
        for (int mm=0; mm<listPool.size(); mm++){
            SelenideElement poolName = listPool.get(mm).find(By.cssSelector("[class='item-title']"));
            String poolNm = poolName.text();
            if (poolNm.equals(companyPoolString)){
                SelenideElement poolList =listPool.get(mm);
                ElementsCollection qq = $$(poolList.findElements(By.cssSelector("[class^='status-label status-label--finished']")));
//Assert.assertNotEquals(qq.size(), 1 , "Статус опроса активный");
                Assert.assertFalse(qq.size()==0, "Статус опроса не завершенный!");
                condition = qq.get(0).text();
//                System.out.println(condition);
            }
        }
        System.out.println(condition);
        System.out.println("closePool - пройден");
    }
 //   System.out.println("createPool - пройден");
}
