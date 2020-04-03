package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class DeletePage {
        public void deletePage() {
            int pageListSize;
        PageNavigator pn = new PageNavigator();
        pn.toAllCompanyPage();
 //       pn.findCompanyByName(companyNameString);
        // ищем опрос по названию и заходим в него(знаем, что мы на странице конструктор)
//        pn.findPoolByName(companyPoolString);
        //проверяем количество страниц
        SelenideElement findPageList = $("[class='constructor']");
        sleep(3000);
//        находим страницу по названию Страница 1
        ElementsCollection pageList = $$(findPageList.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        pageListSize = pageList.size();
        Assert.assertFalse(pageListSize==3, "В конструкторе нет редактируемых страниц! сначала создайте страницу опроса!");
        for (int i=0; i<pageListSize; i++){
            SelenideElement xx = pageList.get(i).find("[class='collapse-header']");
            if(xx.text().equals("СТРАНИЦА 1")){
//находим на странице 1 кнопку удалить и нажимаем ее
                SelenideElement deletePageButton = pageList.get(i).find(By.cssSelector("[class='fa fa-trash']"));
                deletePageButton.click();
            }
        }

        //проверяем, что количество страниц стало -1
        SelenideElement findPageListNew = $("[class='controls-wrapper visible']");
        ElementsCollection pageListNew = $$(findPageListNew.findElements(By.cssSelector("[class^='ant-collapse-item ant-collapse-no-arrow']")));
        int newpagesize = pageListNew.size();
        Assert.assertFalse(pageListSize == newpagesize - 1, "Не смогли удалить страницу опроса!");

        System.out.println("deletePage - пройден");
    }

}
