package adminTest;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class OpenPoolAndCheck extends AdminAuthorization {

    public void accessPool(){
        //есть созданный опрос, зашли в него
        PageNavigator pn = new PageNavigator();
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        pn.findPoolByName(companyPoolString);
        sleep(2000);
        //ищем кнопку запуска опроса
        SelenideElement openPoolButton = $("[class='ant-btn ant-btn-success']");
        openPoolButton.click();
        //проверка. статус опроса активный(перешли на страницу компании.замем нашли нужную компанию и зашли в нее
        pn.toAllCompanyPage();
        pn.findCompanyByName(companyNameString);
        //фильтруем список опросов в компании по нужному имени
        pn.checkStatusPool(companyPoolString);
//        System.out.println(pn.statusPool);
        Assert.assertTrue(pn.statusPool.equals("АКТИВНЫЙ"), "Статус опроса не АКТИВНЫЙ. Запуск опроса не произведен");

        System.out.println("openPoolAndCheck - пройден");
    }
}
