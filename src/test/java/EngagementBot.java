import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
//import com.codeborne.selenide.WebDriverRunner;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utillities.SlackBot;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.search.AndTerm;
import javax.mail.search.BodyTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchTerm;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertNotEquals;

public class EngagementBot extends Start{
    private String result = "[stage] Green Test passed";
    private String projectName = "Engagement";
//    private PageNavigation pn = new PageNavigation();
    @Test
    public void loginAsAdmin(){
//        WebDriver driver = WebDriverRunner.getWebDriver();
        try{
            open(baseUrl);
            sleep(3000);
            SelenideElement e = $ ("[placeholder='Email']");
            e.setValue("ponomarevafortest@gmail.com");
//        e.setValue("a.ponomareva@talenttech.ru");
            SelenideElement e2 = $ ("[class='ant-btn ant-btn-primary']");
            e2.click();
            sleep(1000);
            ElementsCollection e3 = $$("[class^='error-message']");
            Assert.assertEquals(e3.size(), 0, "Email адрес не найден");
            sleep(5000);
            getInboxFolder();

//проверяем, что на странице Компании есть список компаний
            ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
            Assert.assertEquals(sideMenu.size(), 5, "Боковое меню содержит не 5 пунктов!");
            ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
            int listCompanySize = allCompanies.size();
            assertNotEquals(listCompanySize,
                    0,
                    "Missing company list");
            //проверяем, что на остальных страницах есть данные
            int tt = 0;
            for (int aac=1; aac<sideMenu.size(); aac++){
                //кликаем по иконке в боковом меню
                sideMenu.get(aac).click();
                sleep(3000);
                //проверяем, что в основном окне есть иконки и кнопка Создать
                ElementsCollection allRaw = $$("[class^='entity-list__item-wrapper']");
                tt = allRaw.size();
//                Assert.assertFalse(allRaw.size()== 0, "Нет ни одной строчки на странице!"+aac);
                assertNotEquals(tt,
                        0,
                        "Missing pool/analitic/user list");
            }

        } catch (AssertionError a){
            result = "[stage] Green Test failed because: " + a.getMessage();
        } catch (Exception e){
            result = "[stage] Green Test failed because: " + e.getMessage();
        }
    }
    private void getInboxFolder() throws MessagingException, IOException {
        sleep(10000);
        // Устанавливаем протокол
        Properties props = new Properties();
        props.setProperty(PROTOCOL_PROP, PROTOCOL_TYPE);
        //props.setProperty("mail.imap.sll.enable", "true");
        // Получаем сессию
        Session session = Session.getInstance(props, null);
        // Получаем место в сессии
        Store store =  session.getStore();
        // Коннектимся к ящику
        store.connect("imap.gmail.com","ponomarevafortest@gmail.com", "123456-qwerty");
//        store.connect("imap.gmail.com","a.ponomareva@talenttech.ru", "jCNHJD2012");
        // В ящике ищем папку "Входящие"
        Folder inbox = store.getFolder("Inbox");
        // Открываем папку в режиме чтения
        inbox.open(Folder.READ_WRITE);
        //ищем письма от support@talenttechlab.com (a.ponomareva@talenttech.ru с названием "тест")
        SearchTerm searchTerm = new BodyTerm("support"); //SearchTerm searchTerm = new BodyTerm("a.ponomareva");
        // письмо должно быть не прочитано
        FlagTerm flagSeen = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
        SearchTerm totalTerm = new AndTerm(flagSeen, searchTerm);
        Message[] message = inbox.search(totalTerm);
        sleep(3000);
        Assert.assertFalse(message.length==0, "No unread message");
        for (int i = 0, n = message.length; i < n; i++) {
            String contentType = message[i].getContentType();
            if (contentType.contains("text/plain") || contentType.contains("text/html")) {
                Object content = message[i].getContent();
                if (content != null) {
                    messageContent = content.toString();
                    System.out.println(messageContent);
                }
            }
            else if (contentType.contains("multipart")) {
                Multipart multiPart = (Multipart) message[i].getContent();
                int numberOfParts = multiPart.getCount();
                for (int partCount = 0; partCount < numberOfParts; partCount++) {
                    MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
                    messageContent = part.getContent().toString();
                    System.out.println(messageContent);
                }
            }
            System.out.println(messageContent);
            newParse.parceAndClic(messageContent);
            sleep(3000);
            ElementsCollection equals = $$("[class^='error-message']");
            Assert.assertEquals(equals.size(), 0, "Url not active");
            message[i].setFlag(Flags.Flag.SEEN, true);
        }
        inbox.close(false);
        store.close();
//    WebDriverRunner.getWebDriver().quit();
    }
    @AfterMethod
    private void closeBrowser() {
        SlackBot sb = new SlackBot();
        sb.sendResulttoSlack(projectName, result);
        close();
//        WebDriverRunner.getWebDriver().quit();
    }
}
