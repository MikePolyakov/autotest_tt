package root;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
//import jdk.javadoc.internal.tool.Start;
//import jdk.javadoc.internal.tool.Start;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

public class PageNavigator {
    public String statusPool;
    public void toAllCompanyPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(0).click();
        sleep(2000);
    }
    public void toAllPoolPage(){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(1).click();
        sleep(2000);
    }
    public void toAllReportPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(2).click();
        sleep(2000);
    }
    public void toAllOpenReportPage (){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(3).click();
        sleep(2000);
    }
    public void toAllUserPage(){
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(4).click();
        sleep(2000);
    }


    public void findAnfClickCompanyByName (String companyName) {
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        allCompanies.size();
//фильтруем элементы списка по совпадению со строкой
        int y = allCompanies.filterBy(Condition.text(companyName)).size();
        Assert.assertEquals(y, 1, "Нет компании с таким именем или у вас недостаточно прав");
        sleep(2000);
        ElementsCollection allCompanyName = $$("[class^='card__title']");

        for (int i = 0; i < allCompanyName.size(); i++) {
            SelenideElement e2 = allCompanyName.get(i);
            String line = e2.text();
//если строка совпала, то переходим к этому элементу списка и кликаем по нему.
            if (companyName.equals(line)) {
                e2.click();
            }
        }
        sleep(1000);
    }

    public void findAndClickPoolByName(String poolName){
//запускает поиск по названию опоса внутри компании
        SelenideElement visiblePage = $("[class='controls-wrapper visible']");
        ElementsCollection listPool = $$(visiblePage.findElements(By.cssSelector("[class^='title__name']")));
        SelenideElement xx = listPool.findBy(Condition.text(poolName));
        xx.click();
    }

    public void checkStatusPool(String poolName){
        SelenideElement visiblePage = $("[class='controls-wrapper visible']");
        ElementsCollection listPool = visiblePage.$$("[class^='ant-row-flex ant-row-flex-middle']");
        listPool.size();
        for (int mm=0; mm<listPool.size(); mm++){
            SelenideElement checkPoolName = listPool.get(mm).find(By.cssSelector("[class='item-title']"));
            String poolNameText = checkPoolName.text();
            if (poolNameText.equals(poolName)){
                SelenideElement statusPoolName = listPool.get(mm).find(By.cssSelector("[class='status-label status-label--active']"));
                statusPool = statusPoolName.text();
            }
        }
    }

    public void findPoolByNameInAllPool(String poolName) {
        SelenideElement visiblePage = $("[class='ant-row']");
        ElementsCollection listPool = $$(visiblePage.findElements(By.cssSelector("[class^='title__name']")));
        if (listPool.findBy(Condition.text(poolName)).exists()){
            System.out.println("опрос с таким именем найден");
            listPool.findBy(Condition.text(poolName)).click();
        }
        else{System.out.println("нет такого названия опроса в списке опросов");}
    }

    public void pageListSizeTake(int pageListSize) {
        SelenideElement findPageList = $("[class='controls-wrapper visible']");
        ElementsCollection pageList = $$(findPageList.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        pageListSize = pageList.size();
    }

    public void addPage(SelenideElement e){
        SelenideElement addPageButton = $(e).find(By.cssSelector("[class='add-entity']"));
        addPageButton.click();
        sleep(2000);
    }

        public void findCompanyByName(String companyNameString){

        }
    public void findPoolByName(String companyPoolString){

    }
    public void findPoolAndCheckStatus (String poolName){ //ДОДЕЛАТЬ
        SelenideElement visiblePage = $("[class='controls-wrapper visible']");
        ElementsCollection listPool = $$(visiblePage.findElements(By.cssSelector("[class^='title__name']")));
        SelenideElement xx = listPool.findBy(Condition.text(poolName));

 /*       SelenideElement listPool1 = $("[class='controls-wrapper visible']");
        ElementsCollection listPool = $$(listPool1.findElements(By.cssSelector("[class^='entity-list__item-wrapper']")));
//System.out.println(listPool.size());
        for (int mm=0; mm<listPool.size(); mm++){
            SelenideElement poolName11 = listPool.get(mm).find(By.cssSelector("[class='item-title']"));
            String poolNm = poolName11.text();
            if (poolNm.equals(poolName)){
                SelenideElement poolList =listPool.get(mm);
                ElementsCollection qq = $$(poolList.findElements(By.cssSelector("[class^='status-label status-label--active']")));
//Assert.assertNotEquals(qq.size(), 1 , "Статус опроса активный");
                Assert.assertFalse(qq.size()==0, "Статус опроса не активный!");
                condition = qq.get(0).text();
                System.out.println(condition);
            }
        }
        System.out.println(condition);*/

    }

    public void createUserButtonClick(){

        SelenideElement upMenu = $("[class='content__wrapper]");
        SelenideElement createUserButton = $(upMenu).find(By.cssSelector("[type='button']"));
        createUserButton.click();
        sleep(2000);
    }
}
