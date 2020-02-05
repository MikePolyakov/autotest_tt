import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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


public class AdminAuthorization extends Start {
    //авторизация. отравили письмо со страницы авторизации.
    @Test
    public void adminAuthorization() throws IOException, MessagingException {
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
        System.out.println("adminAuthorization - пройден");
    }
//@Test
    //проверяем почту: заходим в почтовый ящик, ищем непрочитанные сообщения от support, получаем текст сообщения, извлекаем ссылку и переходим по ней
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
//        store.connect("imap.gmail.com","a.ponomareva@talenttech.ru", "");
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
        Assert.assertFalse(message.length==0, "нет непрочитанных писем");
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
                Assert.assertEquals(equals.size(), 0, "Ссылка сгорела");
                message[i].setFlag(Flags.Flag.SEEN, true);
            }
    inbox.close(false);
    store.close();
//    WebDriverRunner.getWebDriver().quit();
        System.out.println("adminAuthorization - пройден");
    }

}
