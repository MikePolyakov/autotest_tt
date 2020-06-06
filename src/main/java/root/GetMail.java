package root;

import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import root.utillities.parserString;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.search.AndTerm;
import javax.mail.search.BodyTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.SearchTerm;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class GetMail {
    String messageContent="";
    parserString newParse = new parserString();
    static final String PROTOCOL_PROP = "mail.store.protocol";
    static final String PROTOCOL_TYPE = "imaps";

    public void getInboxFolder(String user, String password) throws MessagingException, IOException {
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
//        store.connect("imap.gmail.com","ponomarevafortest@gmail.com", "123456-qwerty");
        store.connect("imap.gmail.com",user, password);
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
//                    System.out.println(messageContent);
                }
            }
            else if (contentType.contains("multipart")) {
                Multipart multiPart = (Multipart) message[i].getContent();
                int numberOfParts = multiPart.getCount();
                for (int partCount = 0; partCount < numberOfParts; partCount++) {
                    MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
                    messageContent = part.getContent().toString();
//                    System.out.println(messageContent);
                }
            }
//            System.out.println(messageContent);
            newParse.parceAndClic(messageContent);
            sleep(3000);
            ElementsCollection equals = $$("[class^='error-message']");
            Assert.assertEquals(equals.size(), 0, "Ссылка сгорела");
            message[i].setFlag(Flags.Flag.SEEN, true);
        }
        inbox.close(false);
        store.close();
//    WebDriverRunner.getWebDriver().quit();

    }
}
