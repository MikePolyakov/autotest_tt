package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;

//класс для работы с опросами : создание/удаление, заполнение шаблона, проверки количества страниц, наличия опроса, статуса и т д.

public class Survey {

    public void createPoolButtonClick(){
        SelenideElement makePoolButton = $("[class='ant-btn ant-btn-primary']");
        makePoolButton.click();
    }
    public void createPoolName (String s){
        SelenideElement createPoolName = $("[placeholder='Введите название опроса']");
        createPoolName.setValue(s);
    }
    public void chooseAssociateCompany(String s){
        //1.кликнули по плейсхолдеру
        SelenideElement chooseCompany = $("[class='ant-select ant-select-enabled']");
        chooseCompany.click();
        //2. фильтруем список по названию
        ElementsCollection listCollection = $$("[class^='ant-select-dropdown-menu-item']");
        listCollection.findBy(Condition.text(s)).click();
    }

    public int findOpenPoolCompanyButton(){
        int openPoolCompanyButtonSize = $$("[class^='ant-btn ant-btn-success']").size();
        return openPoolCompanyButtonSize;
    }

    public void findChangePoolButton(){
        SelenideElement poolMenu = $("[class='page-header page-header--with-steps']");
        SelenideElement changePoolButton = $(poolMenu.find(By.cssSelector("[class='fa fa-ellipsis-v']")));
        changePoolButton.click();
    }

    public void findAndClickDeletePoolButton(){
        SelenideElement findChangePopup = $("[class='ant-popover ant-popover-placement-bottom']");
        ElementsCollection changePopUp =$$(findChangePopup.findElements(By.cssSelector("[class^='pop-content__item']")));
        changePopUp.findBy(Condition.text("Удалить опрос")).click();
    }

    public ElementsCollection poolCountPage(){
        sleep(1000);
        SelenideElement constructor = $("[class = 'page-body survey block']").find("[class = 'constructor']");
        ElementsCollection poolCountPage = constructor.$$("[class^='ant-collapse-item ant-collapse-no-arrow']");
        return poolCountPage;
    }

    public SelenideElement findPoolByName(String poolName){
//запускает поиск по названию опоса внутри компании
        SelenideElement visiblePage = $("[class='content__wrapper']");
        ElementsCollection listPool = visiblePage.$$("[class^='title__name']");
        return listPool.findBy(Condition.text(poolName));
    }

    public SelenideElement findPoolByNameAndReturnIt(String poolName){
//запускает поиск по названию опоса и возвращаем всю строчку опроса
        SelenideElement companyRawByName = null;
        SelenideElement visiblePage = $("[class='content__wrapper']");
        ElementsCollection listPool = visiblePage.$$("[class^='ant-row-flex ant-row-flex-middle']");
        for (int mm=0; mm<listPool.size(); mm++) {
            SelenideElement checkPoolName = listPool.get(mm).find(By.cssSelector("[class='item-title']"));
            String poolNameText = checkPoolName.text();
            if(poolNameText.equals(poolName)) companyRawByName = listPool.get(mm);
        }
        return companyRawByName;
    }

    public void clickOpenPoolButton(){
        SelenideElement openPoolButton = $("[class='ant-btn ant-btn-success']");
        openPoolButton.click();
    }

    public void clickClosePoolButton(){
        SelenideElement poolMenu = $("[class='page-header__controls pull-right']");
//        SelenideElement poolMenu = $("[class='page-header page-header--with-steps']");
        ElementsCollection poolMenuButton = poolMenu.$$("[type^='button']");
        poolMenuButton.findBy(Condition.text("Завершить")).click();
    }

    public String checkSurveyStatus(SelenideElement e){
        SelenideElement statusPoolName = e.$("[class='ant-col ant-col-3']");
        String surveyStatus = statusPoolName.getText();
        return surveyStatus;
    }
    public void clickAnalyticPage(){//ВАЖНО ПОПРАВИТЬ!!!
        SelenideElement upMenu = $("[class='page-header page-header--with-steps']").find("[class='constructor-tabs']");
        ElementsCollection constructorTabs = upMenu.$$("ant-radio-button");
        constructorTabs.findBy(Condition.text("Аналитика")).click();
    }

    public Survey surveysPageTest() {
        //проверяем, что в основном окне есть данные опросов
        ElementsCollection allRaw = $$("[class^='entity-list__item-wrapper']");
        int elements_number = allRaw.size();
        Assert.assertNotEquals(elements_number,
                0,
                "Пустой список Опросов");
        return this;
    }
}
