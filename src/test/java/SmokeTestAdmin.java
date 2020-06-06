import org.testng.Assert;
import org.testng.annotations.Test;
import root.GetMail;
import root.PageNavigation;

import javax.mail.MessagingException;
import java.io.IOException;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.testng.Assert.*;

public class SmokeTestAdmin extends StartSmokeTestAdmin {
    PageNavigation pn = new PageNavigation();
    GetMail gm= new GetMail();
    //залогинились под зарегистрированным пользователем
    @Test
    public void testAuthorisation() throws IOException, MessagingException{
        open(baseUrl);
        pn.getAutorization(login);
        gm.getInboxFolder(login, password);
        //+проверка
        System.out.println("testAuthorisation - пройден");
    }
    //создали(зашли) команию/ Закомментировано, тк компанию нельзя удалить.
    @Test (dependsOnMethods = "testAuthorisation")
   public void testToCreateCompany(){
        pn.clickToCreateCompanyButton();
        pn.createCompanyName(companyNameString);
        pn.clickToCreateCompanyButton();
        Assert.assertTrue(pn.checkCompanyByName(companyNameString), "Нет компании "+companyNameString+" в списке компаний");
        System.out.println("testToCreateCompany - пройден");
   }

    //загрузили оргструктуру
    @Test (dependsOnMethods = "testAuthorisation")
    public void createStructureInCompany(){
        pn.openStructurePage(companyNameString);
        pn.loadStructure(loadStructureURL);
        Assert.assertTrue(pn.findPopUpText().equals("Файл загружен."), "Неверный текст у подсказки");
        pn.clickPopUpYes();
        Assert.assertFalse(pn.checkStructure()==0, "Оргструктура не отображается!");
        System.out.println("createStructureInCompany - пройден");
    }
    //выгрузили оргструктуру
    @Test(dependsOnMethods = "testAuthorisation")
    public void downloadStructure(){
        pn.openStructurePage(companyNameString);
        pn.downloadStructure();
        System.out.println("downloadStructureFromCompany - пройден");
    }
    //внутри компании создали опрос
    @Test (dependsOnMethods = "testAuthorisation")
    public void testCreateSurvey(){
        pn.toAllPoolPage();
        pn.createPoolButtonClick();
        pn.createNameSurvey(poolNameString);
        pn.createDateSurvey();
        pn.createAssociateCompany(companyNameString);
        sleep(2000);
        assertTrue(pn.checkPoolCountPage()==3, "Шаблон опроса создан неверно!");
        Assert.assertTrue(pn.checkPoolByName(poolNameString), "Нет опроса " + poolNameString + " c именем в списке всех опросов!");
        System.out.println("testCreateSurvey - пройден");
    }
    //внутри опроса создали страницу
    @Test (dependsOnMethods = "testAuthorisation")
    public void testCreatePage(){
        pn.toAllCompanyPage();
        pn.findAndClickCompany(companyNameString);
        pn.clickPoolByName(poolNameString);
        int n = pn.checkPoolCountPage();
        pn.clickCreatePageButton();
        int n1 = pn.checkPoolCountPage();
        Assert.assertTrue(n1==n+1, "Количество страниц в отчете не изменилось!");
        Assert.assertTrue(pn.checkPageByName("СТРАНИЦА "+ (n1-3)), "Нет страницы с таким именем!");
        System.out.println("testCreatePage - пройден");
    }
    //внутри страницы создали вопрос
    @Test (dependsOnMethods = "testAuthorisation")
    public void testToCreateQuestion(){
        pn.toAllCompanyPage();
        pn.findAndClickCompany(companyNameString);
        pn.clickPoolByName(poolNameString);
        pn.clickPageByName("Страница 1");
        pn.addQuestionClick();
        pn.chooseQuestionType("Оргструктура");
        //добавить проверку наличия вопроса нужного типа на странице
        System.out.println("testToCreateQuestion - пройден");
    }
    //запустили опрос нажатием на кнопку
    @Test (dependsOnMethods = "testAuthorisation")
    public void testToOpenSurvey(){
        pn.toAllCompanyPage();
        pn.findAndClickCompany(companyNameString);
        pn.clickPoolByName(poolNameString);
        pn.clickOpenPoolButton();
        String statusPool = pn.checkPoolStatus(companyNameString, poolNameString);
        Assert.assertTrue(statusPool.equals("АКТИВНЫЙ"), "Статус опроса не АКТИВНЫЙ. Запуск опроса не произведен");
        System.out.println("tesToOpenSurvey- пройден");
    }
    //завершить опрос нажатием на кнопку
    @Test (dependsOnMethods = "testAuthorisation")
    public void testToCloseSurvey(){
        pn.toAllCompanyPage();
        pn.findAndClickCompany(companyNameString);
        pn.clickPoolByName(poolNameString);
        pn.clickClosePoolButton();
        //вот тут падаем после нажития кнопки Завершить
        String statusPool = pn.checkPoolStatus(companyNameString, poolNameString);
        Assert.assertTrue(statusPool.equals("ЗАВЕРШЕННЫЙ"), "Статус опроса не ЗАВЕРШЕННЫЙ. Завершение опроса не произведено");
        System.out.println("tesToCloseSurvey- пройден");
    }
    //проверили кнопку ПЕРЕИНДЕКСИРОВАТЬ. есть вопросы!!
 /*   @Test (dependsOnMethods = "testAuthorisation")
    public void reindexReport(){
        pn.toAllCompanyPage();
        comp.findAndClickCompanyByName(companyNameString);
        sr.checkSurvayStatusFinished(poolNameString);
        Assert.assertTrue(sr.survayStatus.equals("ЗАВЕРШЕННЫЙ"), "Статус опроса не ЗАВЕРШЕННЫЙ. нельзя получить статистику");
        sr.findAndClickPoolByName(poolNameString);
        sr.clickAnaliticPage();
        //кнопка переиндексировать не доступна для обычных пользователей
//        rpt.reindexButtonIsClickable();
        //проверка наличия текста.
        rpt.checkAnalyticPage();
        System.out.println("reindexReport - пройден");
    }*/
    //создали отчет
    @Test (dependsOnMethods = "testAuthorisation")
    public void createReport(){
        pn.toAllReportPage();
        pn.clickCreateReportButton();
        pn.createReportNameForPool(reportNameString, poolNameString);
        Assert.assertEquals(pn.checkReport(), 1, "Нет шаблона таблицы отчета");
        pn.toAllReportPage();
        Assert.assertTrue(pn.checkReportByName(reportNameString), "Нет опроса " + reportNameString + " c именем в списке всех опросов!");
        System.out.println("createReport - пройден");
    }
    //создали открытый отчет
    @Test (dependsOnMethods = "testAuthorisation")
    public void createOpenReport(){
        pn.toAllReportPage();
        pn.clickCreateReportButton();
        pn.createOpenReportNameForPool(reportOpenNameString, poolNameString);
        Assert.assertTrue(pn.checkOpenReportByName(reportOpenNameString), "Нет опроса " + reportOpenNameString + " c именем в списке всех опросов!");
        System.out.println("createReport - пройден");
    }

    //удалили вопрос
    @Test (dependsOnMethods = "testAuthorisation")
    public void deleteQuestion(){

    }
    //удалили страницу
    @Test (dependsOnMethods = "testAuthorisation")
    public void deletePage(){
        pn.findAndClickCompany(companyNameString);
        pn.clickPoolByName(poolNameString);
        int n = pn.checkPoolCountPage();
        assertTrue(n>3, "В отчете нет страниц, которые можно удалить!");
        pn.deletePageByName("Страница 1");
        int n1 = pn.checkPoolCountPage();
        Assert.assertTrue(n1==n-1, "Количество страниц в отчете не изменилось!");
        System.out.println("deletePage - пройден");
    }
    //удалили опрос
    @Test (dependsOnMethods = "testAuthorisation")
    public void deleteSurvey(){
        pn.findAndClickCompany(companyNameString);
        Assert.assertTrue(pn.checkPoolByName(poolNameString), "Нет опроса " + poolNameString + " в списке опросов компании!");
        pn.clickPoolByName(poolNameString);
        pn.deletePool(poolNameString);
        Assert.assertFalse(pn.checkPoolByName(poolNameString), "Опрос " + poolNameString + " не удален!");
        System.out.println("deleteSurvey - пройден");
    }
    //удалили отчет
    @Test (dependsOnMethods = "testAuthorisation")
    public void deleteReport(){
        pn.toAllReportPage();
        Assert.assertTrue(pn.checkReportByName(reportNameString), "Нет отчета " + reportNameString + " в списке всех отчетов!");
        pn.clickReportByName(reportNameString);
        pn.deleteReportButtonClick();
        pn.deleteReportPopUpYes();
        Assert.assertFalse(pn.checkReportByName(reportNameString), "Отчет " + reportNameString + " не удален!");
        System.out.println("deleteReport - пройден");
    }
    //удалили открытый отчет
    @Test (dependsOnMethods = "testAuthorisation")
    public void deleteOpenReport(){
        pn.toAllOpenReportPage();
        Assert.assertTrue(pn.checkOpenReportByName(reportOpenNameString), "Нет отчета " + reportOpenNameString + " в списке всех отчетов!");
        pn.clickReportByName(reportOpenNameString);
        pn.deleteReportButtonClick();
        pn.deleteReportPopUpYes();
        Assert.assertFalse(pn.checkOpenReportByName(reportOpenNameString), "Отчет " + reportOpenNameString + " не удален!");
        System.out.println("deleteOpenReport - пройден");
    }
    //тест логофф
    @Test(dependsOnMethods = "testAuthorisation")
    public void testLogOff(){
        pn.logOff();
        Assert.assertNotNull(pn.email(), "пользователь не разлогинен");
        System.out.println("TestLogOff - пройден");
    }
}
