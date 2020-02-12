package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DownloadStructure extends AdminAuthorization {

    public void downloadStructure(){
        //ищем страницу компании с именем l и заходим на нее
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
        //ищем кнопку скачать и проверяем ее кликабельность
        SelenideElement inputFileButton = $("[class='content-card']");
        SelenideElement downloadFileButton = $(inputFileButton).find(By.cssSelector("[class='fa fa-download']"));
        ExpectedConditions.elementToBeClickable(downloadFileButton);
            downloadFileButton.click();
        System.out.println("downloadStructure - пройден");
    }
}
