package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Page {
    public void clickAddPageButton(){
        SelenideElement findPageList = $("[class='constructor']");
        SelenideElement addPageButton = findPageList.$("[class='add-entity']");
        addPageButton.click();
        sleep(1000);
    }
 /*   public boolean checkPageName(String s){
        SelenideElement findPageList = $("[class='constructor']");
        sleep(3000);
//        находим страницу по названию Страница 1
        ElementsCollection pageList = findPageList.$$("[class^='ant-collapse-item ant-collapse-no-arrow']");
        for (int i=0; i<pageList.size(); i++){
            SelenideElement xx = pageList.get(i).find("[class='collapse-header']");
          if(xx.text().equals(s)){
               return true;
            }
        }
        return true;
    }*/
     public ElementsCollection findPageList(){
         SelenideElement constructor = $("[class='constructor']");
         ElementsCollection allPageList = constructor.$$("[class^='ant-collapse-item ant-collapse-no-arrow']");
         return allPageList;
     }
//    public boolean str = false;
    public boolean checkPageNameIntoList(ElementsCollection e,String s){
//        SelenideElement findPageListNew = $("[class='constructor']");
//        ElementsCollection getNamePage =findPageListNew.$$("[class^='collapse-header']");
        if (e.findBy(Condition.text(s)).exists()) return true;
        return false;
    }

    public void clickPageByName(ElementsCollection e, String pageName){
//        SelenideElement constructor = $("[class='constructor']");
//        ElementsCollection allPage = constructor.$$("[class^='ant-collapse-item ant-collapse-no-arrow']");
        e.findBy(Condition.text(pageName)).click();
    }
}
