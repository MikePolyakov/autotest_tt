import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class CreateCompanyStructure extends AdminAuthorization {
//    String l = "тиорлдж";

    @Test
    public void createCompanyStructure() {
        //ищем страницу компании с именем l и заходим на нее
//        PageNavigator pn= new PageNavigator();
//        pn.toAllCompanyPage();
//        pn.findCompanyByName(companyNameString);

        sleep(3000);
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        allCompanies.size();
//фильтруем элементы списка по совпадению со строкой
        int y = allCompanies.filterBy(Condition.text(companyNameString)).size();
        Assert.assertEquals(y, 1, "Нет компании с таким именем или у вас недостаточно прав");
        sleep(2000);
//ищем внутри карточки компании кнопку оргструктуры и кликаем по ней
        ElementsCollection allCompanyName = $$("[class^='ant-card-body']");
        allCompanyName.size();
        for (int i = 0; i < allCompanyName.size(); i++) {
            SelenideElement company= allCompanyName.get(i);
            SelenideElement e2 = $(company).find(By.cssSelector("[class='card__title']"));
//            SelenideElement e2 = allCompanyName.get(i);
            String line = e2.text();
            if (line.equals(companyNameString)){
                SelenideElement cardBody = $(company).find(By.cssSelector("[class='label']"));
                cardBody.click();
            }
        }
        //ищем кнопку загрузки и кликаем по ней
        SelenideElement inputFileButton = $("[class='content-card']");
        SelenideElement putFileButton = $(inputFileButton).find(By.cssSelector("[class='ant-upload ant-upload-select ant-upload-select-text']"));
        SelenideElement inputFile = $(putFileButton).find(By.cssSelector("[type='file']"));
        inputFile.sendKeys("C:\\StructureAutotest.xlsx");
        sleep(10000);
        //проверки. наличие поп-ап с нужным текстом. и его закрытие.
        SelenideElement notification = $("[class='ant-notification-notice ant-notification-notice-closable']");
        SelenideElement notifMessage = $(notification).find(By.cssSelector("[class='ant-notification-notice-message']"));
        String ff = notifMessage.text();
        Assert.assertTrue (ff.equals("Файл загружен."), "Неверный текст у поп-ап!");
        SelenideElement notifClose =$(notification).find(By.cssSelector("[class='ant-notification-close-x']"));
        notifClose.click();
        //еще нужна проверка, что страница обновилась
        // проверка наличия контента (строчки с данными)
 //       SelenideElement findContent = $("[class='controls-wrapper visible']");
        ElementsCollection findContentList =$$("[class^='LazyLoad is-visible']");
        int fCL = findContentList.size();
        Assert.assertFalse(fCL==0, "Оргструктура не отображается!");
//        SelenideElement findMenu = $("[class='page-header page-header--with-steps']");
//        SelenideElement findMenuOrg = $("[class='']");
    }
}



