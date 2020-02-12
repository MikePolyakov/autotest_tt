package root;

import adminTest.*;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class PageNavigation {

    Authorization auth = new Authorization();
    SideMenu sm = new SideMenu();
    Survey srv = new Survey();
    Page pg = new Page();
    Company comp = new Company();
    Report rpt = new Report();
    Question quest = new Question();


 //страница авторизации
    public void getAutorization(String s){
        auth.inputLogin(s);
        auth.clickAuthorizationButton();
    }
    public void logOff(){
        sm.clickProfile();
        auth.chooseLogOffClick();
    }
    public SelenideElement email(){
        return auth.inputLoginElement();
    }
//кнопки бокового меню
    public void toAllCompanyPage (){
        sm.toAllCompanyPage();
        sleep(2000);
    }
    public void toAllPoolPage(){
        sm.toAllPoolPage();
        sleep(2000);
    }
    public void toAllReportPage (){
        sm.toAllReportPage();
        sleep(2000);
    }
    public void toAllOpenReportPage (){
        sm.toAllOpenReportPage();
        sleep(2000);
    }
    public void toAllUserPage(){
        sm.toAllUserPage();
        sleep(2000);
    }
//создание компании
    public void clickToCreateCompanyButton(){
        comp.createCompanyButtonClick();
    }
    public void createCompanyName(String companyName){
        comp.chooseCompanyName(companyName);
        comp.createCompanyButtonClick();
    }
    public void findAndClickCompany(String s){
       sm.toAllCompanyPage();
       ElementsCollection company = comp.findCompanyByName(s);
       comp.clickCompanyByName(company);
    }
    public boolean checkCompanyByName(String s){
        sm.toAllCompanyPage();
        ElementsCollection listCompany = comp.findCompanyByName(s);
        return comp.checkCompanyByName(listCompany);
    }
    public void loadStructure(String url){
        comp.loadCompanyStructure(url);
    }
    public void downloadStructure(){
        SelenideElement y = comp.downloadCompanyStructureButton();
        comp.checkButtonIsClicable(y);
    }
    public int checkStructure(){
        return comp.checkCompanyStructure();
    }
    public String findPopUpText(){
        SelenideElement poopUp = comp.findStructurePopUp();
        String s = comp.getTextStructurePopUp(poopUp);
        return s;
    }
    public void clickPopUpYes(){
        SelenideElement popUp = comp.findStructurePopUp();
        comp.loadStructurePopUpClickYes(popUp);
    }
    public void openStructurePage(String companyName){
        ElementsCollection tt = comp.findCompanyByName(companyName);
        comp.clickRadioButtonStructure(tt);
    }
//создание опроса
    public void createPoolButtonClick(){
        srv.createPoolButtonClick();
    }
    public void createNameSurvey(String name){
        srv.createPoolName(name);
        srv.createPoolButtonClick();
    }
    public void createDateSurvey(){
        //закодить даты
        srv.createPoolButtonClick();
    }
    public void createAssociateCompany(String company){
        srv.chooseAssociateCompany(company);
        srv.createPoolButtonClick();
    }
    public int checkPoolCountPage(){
        return srv.poolCountPage().size();
    }
    public boolean checkPoolByName(String poolName){
        sm.toAllPoolPage();
        if (srv.findPoolByName(poolName).exists()) return true;
        return false;
    }
    public void clickPoolByName(String poolName){
        srv.findPoolByName(poolName).click();
    }
    public void clickOpenPoolButton(){
        srv.clickOpenPoolButton();
        sleep(1000);
    }
    public void clickClosePoolButton(){
        srv.clickClosePoolButton();
        sleep(1000);
    }
    public String checkPoolStatus(String companyName, String poolName){
        sm.toAllCompanyPage();
        comp.clickCompanyByName(comp.findCompanyByName(companyName));
        SelenideElement xx = srv.findPoolByNameAndReturnIt(poolName);
        String ss = srv.checkSurveyStatus(xx);
        return ss;
    }

//создание страницы
    public void clickCreatePageButton(){
        pg.clickAddPageButton();
    }
    public boolean checkPageByName(String s){
        ElementsCollection xx = pg.findPageList();
       return pg.checkPageNameIntoList(xx, s);
    }
    public void clickPageByName(String s){
        ElementsCollection xx = pg.findPageList();
        pg.clickPageByName(xx, s);
    }

//создание вопроса
    public void addQuestionClick(){
            quest.addQuestionButtonClick();
    }
    public void chooseQuestionType(String type){
        quest.chooseAndClickTypeOfQuestion(type);
    }

//создание отчета
    public void clickCreateReportButton(){
            rpt.clickCreateReportButton();
    }
    public void createReportNameForPool(String reportName, String poolName){
        rpt.chooseReportName(reportName);
        rpt.chooseAssociatePool(poolName);
        rpt.clickToCreateReport();
    }
    public int checkReport(){
       int t = rpt.checkReportTableSize();
       return t;
    }
    public boolean checkReportByName(String reportName){
        sm.toAllReportPage();
        if (rpt.checkReportByName(reportName).exists()) return true;
        return false;
    }
    public void createOpenReportNameForPool(String reportName, String poolName){
        rpt.chooseReportName(reportName);
        rpt.chooseAssociatePool(poolName);
        rpt.clickOpenReportButton();
        rpt.clickToCreateReport();
    }
    public boolean checkOpenReportByName(String reportName){
        sm.toAllOpenReportPage();
        if (rpt.checkReportByName(reportName).exists()) return true;
        return false;
    }

}
