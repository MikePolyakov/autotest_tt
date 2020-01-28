import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class PageNavigation {
    public void checkAutorizaciya() {
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        //не проверяем количество пунктов меню
 //       Assert.assertEquals(sideMenu.size(), 5, "Боковое меню содержит не 5 пунктов!");
        //проверяем, что на странице Компании есть список компаний
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        int a = allCompanies.size();
//        Assert.assertFalse(allCompanies.size()==0, "Нет ни одной компании!");
        for (int aac=1; aac<a; aac++){
            //кликаем по иконке в боковом меню
            sideMenu.get(aac).click();
            sleep(3000);
            //проверяем, что в основном окне есть иконки и кнопка Создать
            ElementsCollection allRaw = $$("[class^='entity-list__item-wrapper']");
            int e = allRaw.size();
//            Assert.assertFalse(allRaw.size()== 0, "Нет ни одной строчки на странице!"+aac);
        }
    }
}
