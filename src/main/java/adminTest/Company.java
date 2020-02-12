package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.*;

//класс для работы с компаниями: создаем, редактируем, проверяем наличие, загружаем оргструктуру и т д.
public class Company {




    public void findAndClickCompanyByName (String companyName) {
        SelenideElement allCompaniesView = $("[class='content__wrapper']");
        sleep(1000);
        ElementsCollection allCompanyName = allCompaniesView.$$("[class^='card__title']");
        for (int i = 0; i < allCompanyName.size(); i++) {
            SelenideElement e2 = allCompanyName.get(i);
            String line = e2.text();
            if (companyName.equals(line)) {
                e2.click();
            }
        }
        sleep(1000);
    }

    public ElementsCollection findCompanyByName (String companyname){
        SelenideElement allCompaniesView = $("[class='content__wrapper']");
        ElementsCollection allCompanies = allCompaniesView.$$("[class^='card__title']");//("[class^='ant-col ant-col-6']");
        ElementsCollection findCompanyByName  = allCompanies.filterBy(Condition.text(companyname));
        return findCompanyByName;
    }
    public int getSizeCompany (ElementsCollection y){
        int getSizeCompany = y.size();
        return getSizeCompany;
    }
    public void clickCompanyByName (ElementsCollection y){
        y.get(0).click();
    }
    public boolean checkCompanyByName(ElementsCollection y){
        if(y.get(0).exists()) return true;
        return false;
    }

    public void clickRadioButtonStructure(ElementsCollection companyname){
        companyname.get(0).click();
        SelenideElement header = $("[class='page-header page-header--with-steps']");
        SelenideElement headerButton = header.$("[class='ant-col ant-col-12']");
        ElementsCollection radioButtonCompany = headerButton.$$("[class^='ant-radio-button-wrapper']");
        radioButtonCompany.get(0).click();
    }
 /*   public void findAndClickStructureButtonOnCardCompany(String companyname){
        ElementsCollection allCompanyName = $$("[class^='ant-card-body']");
        allCompanyName.size();
        for (int i = 0; i < allCompanyName.size(); i++) {
            SelenideElement company= allCompanyName.get(i);
            SelenideElement e2 = $(company).find(By.cssSelector("[class='card__title']"));
//            SelenideElement e2 = allCompanyName.get(i);
            String line = e2.text();
            if (line.equals(companyname)){
                SelenideElement cardBody = $(company).find(By.cssSelector("[class='label']"));
                cardBody.click();
            }
        }
    }*/
    public void loadCompanyStructure(String url){
        SelenideElement inputFileButton = $("[class='content-card']");
        SelenideElement putFileButton = $(inputFileButton).find(By.cssSelector("[class='ant-upload ant-upload-select ant-upload-select-text']"));
        SelenideElement inputFile = $(putFileButton).find(By.cssSelector("[type='file']"));
        inputFile.sendKeys(url);
        sleep(10000);
    }
    public SelenideElement downloadCompanyStructureButton(){
        SelenideElement inputFileButton = $("[class='content-card']");
        SelenideElement downloadFileButton = $(inputFileButton).find(By.cssSelector("[class='fa fa-download']"));
        return downloadFileButton;
//        ExpectedConditions.elementToBeClickable(downloadFileButton);
//        downloadFileButton.click();
    }
    public void checkButtonIsClicable(SelenideElement y){
        ExpectedConditions.elementToBeClickable(y);
        y.click();
    }

    public SelenideElement findStructurePopUp(){
        SelenideElement notification = $("[class='ant-notification-notice ant-notification-notice-closable']");
        return notification;
    }
    public String getTextStructurePopUp(SelenideElement y){
        SelenideElement notifMessage = $(y).find(By.cssSelector("[class='ant-notification-notice-message']"));
        String ff = notifMessage.text();
        return ff;
    }
    public void loadStructurePopUpClickYes(SelenideElement y){
        SelenideElement notifClose =$(y).find(By.cssSelector("[class='ant-notification-close-x']"));
        notifClose.click();
    }

    public int checkCompanyStructure(){
        return $$("[class^='LazyLoad is-visible']").size();
    }

    public void createCompanyButtonClick(){
        SelenideElement makeCompanyButton = $("[class='ant-btn ant-btn-primary']");
        makeCompanyButton.click();
    }

    public void chooseCompanyName(String s){
        SelenideElement companyName = $("[class='page-body__form']");
        companyName.click();
        companyName.setValue(s);
    }

}
