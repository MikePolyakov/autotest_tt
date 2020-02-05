import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class AdminAuthorizationCheck extends AdminAuthorization {
    @Test
    public void checkAuthorizationCheck() {
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        Assert.assertEquals(sideMenu.size(), 5, "Боковое меню содержит не 5 пунктов!");
        //проверяем, что на странице Компании есть список компаний
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        Assert.assertFalse(allCompanies.size()==0, "Нет ни одной компании!");
        for (int aac=1; aac<sideMenu.size(); aac++){
            //кликаем по иконке в боковом меню
            sideMenu.get(aac).click();
            sleep(3000);
            //проверяем, что в основном окне есть иконки и кнопка Создать
            ElementsCollection allRaw = $$("[class^='entity-list__item-wrapper']");
            allRaw.size();
            Assert.assertFalse(allRaw.size()== 0, "Нет ни одной строчки на странице!"+aac);
        }
    }
}
