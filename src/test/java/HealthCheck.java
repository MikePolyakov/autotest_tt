import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import root.utillities.SlackBot;

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


public class HealthCheck extends Start {
    private final String projectName = "Engagement";
    private final String testName = " [stage] Health Check ";
    private String result = "`Result:` " + projectName + testName + "passed";


    @Test
    public void healthChecks() {

        try {
            // авторизация пользователя
            userLogin();

            // переход по ссылке из почты
            mailLink();

            // тест элементов бокового меню
            ElementsCollection sideMenu = sideMenuTest();

            //тест страницы Компаний
            companiesPageTest();

            //тест страницы Опросов
            surveysPageTest(sideMenu);

            //тест страницы Пользователи
            usersPageTest(sideMenu);

            //тест элементов поп-ап меню пользователя
            userPopupMenu();

            //тест профиля Пользователи
            userProfile();

            //выход
            userLogout();

        } catch (AssertionError a) {
            result = "`Problem:` " + projectName + testName + "failed because: " + a.getMessage();

        } catch (Exception e) {
            result = "`Problem:` " + projectName + testName + "failed because: " + e.getMessage();

        }
    }

    @AfterMethod
    private void closeBrowser() {
        WebDriverRunner.getWebDriver().close();
        SlackBot sb = new SlackBot();
//        sb.sendResulttoSlack(projectName, result);
        System.out.println(result);
    }

    private void userLogin() {
        open(baseUrl);
        sleep(3000);
        SelenideElement e = $("[placeholder='Email']");
        e.setValue(login);
        SelenideElement e2 = $("[class='ant-btn ant-btn-primary']");
        e2.click();
        sleep(6000);
        ElementsCollection e3 = $$("[class^='error-message']");
        Assert.assertEquals(e3.size(), 0, "Email адрес не найден");
        sleep(3000);
    }

    private void mailLink() throws MessagingException, IOException {
        // Устанавливаем протокол
        Properties props = new Properties();
        props.setProperty(PROTOCOL_PROP, PROTOCOL_TYPE);
        // Получаем сессию
        Session session = Session.getInstance(props, null);
        // Получаем место в сессии
        Store store = session.getStore();
        // Коннектимся к ящику
        store.connect("imap.gmail.com", login, password);
        // В ящике ищем папку "Входящие"
        Folder inbox = store.getFolder("Inbox");
        // Открываем папку в режиме чтения
        inbox.open(Folder.READ_WRITE);
        //ищем письма от support@talenttechlab.com
        SearchTerm searchTerm = new BodyTerm("support");
        // письмо должно быть не прочитано
        FlagTerm flagSeen = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
        SearchTerm totalTerm = new AndTerm(flagSeen, searchTerm);
        Message[] message = inbox.search(totalTerm);
        sleep(3000);
        Assert.assertFalse(message.length == 0, "No unread message");
        for (Message value : message) {
            String contentType = value.getContentType();
            if (contentType.contains("text/plain") || contentType.contains("text/html")) {
                Object content = value.getContent();
                if (content != null) {
                    messageContent = content.toString();
                    System.out.println(messageContent);
                }
            } else if (contentType.contains("multipart")) {
                Multipart multiPart = (Multipart) value.getContent();
                int numberOfParts = multiPart.getCount();
                for (int partCount = 0; partCount < numberOfParts; partCount++) {
                    MimeBodyPart part = (MimeBodyPart) multiPart.getBodyPart(partCount);
                    messageContent = part.getContent().toString();
                }
            }
            newParse.parceAndClic(messageContent);
            sleep(3000);
            ElementsCollection equals = $$("[class^='error-message']");
            Assert.assertEquals(equals.size(), 0, "Url not active");
            value.setFlag(Flags.Flag.SEEN, true);
        }
        inbox.close(false);
        store.close();
    }

    private ElementsCollection sideMenuTest() {
        //проверяем, что на странице есть боковое меню
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        Assert.assertEquals(sideMenu.size(), 5, "Боковое меню содержит не 5 пунктов!");
        return sideMenu;
    }

    private void companiesPageTest() {
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        int listCompanySize = allCompanies.size();
        Assert.assertNotEquals(listCompanySize, 0, "Пустой список Компаний");
    }

    private void surveysPageTest(ElementsCollection sideMenu) {
        //кликаем по иконке в боковом меню
        sideMenu.get(1).click();
        sleep(15000);
        //проверяем, что в основном окне есть данные опросов
        ElementsCollection allRaw = $$("[class^='entity-list__item-wrapper']");
        int elements_number = allRaw.size();
        Assert.assertNotEquals(elements_number,
                0,
                "Пустой список Опросов");
    }

    private void usersPageTest(ElementsCollection sideMenu) {
        //кликаем по иконке в боковом меню
        sideMenu.get(4).click();
        sleep(5000);
        //проверяем, что в основном окне есть данные пользователей
        ElementsCollection allRaw = $$("[class^='entity-list__item-wrapper']");
        int elements_number = allRaw.size();
        Assert.assertNotEquals(elements_number,
                0,
                "Пустой список Пользователей");
        // кнопка добавления пользователя
        SelenideElement add_user = $("[class='ant-btn ant-btn-primary']");
        add_user.click();
        sleep(3000);
        // кнопка Отменить
        SelenideElement cancel = $(By.xpath("//div[@class='form-controls__item']//a"));
        cancel.click();
        sleep(3000);
    }

    private void userPopupMenu() {
        SelenideElement item_avatar = $("[class='item-avatar']");
        //кликаем по аватару в боковом меню
        item_avatar.click();
        sleep(3000);
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']");
        Assert.assertEquals(popContentMenu.size(), 2, "Pop-up меню содержит не 2 пунктов!");
    }

    private void userProfile() {
        SelenideElement item_avatar = $("[class='item-avatar']");
        //кликаем по аватару в боковом меню
        item_avatar.click();
        sleep(3000);
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']");
        //кликаем на Профиль в боковом меню
        popContentMenu.get(0).click();
        sleep(3000);
        SelenideElement user_profile = $("[class='fa fa-ellipsis-v']");
        //кликаем меню три точки
        user_profile.click();
        sleep(3000);
        SelenideElement change_name = $(By.xpath("//body//span[2]"));
        //кликаем на изменить имя
        change_name.click();
        sleep(3000);
        SelenideElement cancel = $("[class='fa fa-times']");
        //кликаем Отменить
        cancel.click();
        sleep(3000);
    }

    private void userLogout() {
        SelenideElement item_avatar = $("[class='item-avatar']");
        //кликаем по аватару в боковом меню
        item_avatar.click();
        sleep(3000);
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']");
        //кликаем на Выход в боковом меню
        popContentMenu.get(1).click();
        sleep(3000);
    }
}
