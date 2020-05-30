package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
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


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.sleep;


public class AdminPage extends Start {

    public static void userLogin() {
        SelenideElement email = $("[placeholder='Email']").waitUntil(visible, 10000);
        email.setValue(login);
        SelenideElement getLinkButton = $("[class='ant-btn ant-btn-primary']")
                .waitUntil(visible, 10000);
        getLinkButton.click();
        ElementsCollection errorMessage = $$("[class^='error-message']")
                .shouldHaveSize(0);
        Assert.assertEquals(errorMessage.size(), 0, "Email адрес не найден");
    }

    public static void mailLink() throws MessagingException, IOException {
        // Устанавливаем протокол
        sleep(10000);
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

    public static ElementsCollection sideMenuTest() {
        //проверяем, что на странице есть боковое меню
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']").shouldHaveSize(5);
        Assert.assertEquals(sideMenu.size(), 5, "Боковое меню содержит не 5 пунктов!");
        return sideMenu;
    }

    public static void companiesPageTest() {
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        int listCompanySize = allCompanies.size();
        Assert.assertNotEquals(listCompanySize, 0, "Пустой список Компаний");
    }

    public static void surveysPageTest(ElementsCollection sideMenu) {
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

    public static void usersPageTest() {
        //кликаем по иконке в боковом меню
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']").shouldHaveSize(5);
        sideMenu.get(4).click();
        sleep(5000);
        //проверяем, что в основном окне есть данные пользователей
        ElementsCollection allRaw = $$("[class^='entity-list__item-wrapper']");
        int elements_number = allRaw.size();
        Assert.assertNotEquals(elements_number,
                0,
                "Пустой список Пользователей");
        // кнопка добавления пользователя
        SelenideElement add_user = $("[class='ant-btn ant-btn-primary']").waitUntil(visible, 10000);
        add_user.click();
        // кнопка Отменить
        SelenideElement cancel = $(By.xpath("//div[@class='form-controls__item']//a")).waitUntil(visible, 10000);
        cancel.click();
    }

    public static void userPopupMenu() {
        SelenideElement item_avatar = $("[class='item-avatar']").waitUntil(visible, 10000);
        //кликаем по аватару в боковом меню
        item_avatar.click();
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']").shouldHaveSize(2);
        Assert.assertEquals(popContentMenu.size(), 2, "Pop-up меню содержит не 2 пункта!");
    }

    public static void userProfile() {
        SelenideElement item_avatar = $("[class='item-avatar']").waitUntil(visible, 10000);
        //кликаем по аватару в боковом меню
        item_avatar.click();
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']").shouldHaveSize(2);
        //кликаем на Профиль в боковом меню
        popContentMenu.get(0).click();
        SelenideElement user_profile = $("[class='fa fa-ellipsis-v']").waitUntil(visible, 10000);
        //кликаем меню три точки
        user_profile.click();
        SelenideElement change_name = $(By.xpath("//body//span[2]")).waitUntil(visible, 10000);
        //кликаем на изменить имя
        change_name.click();
        SelenideElement cancel = $("[class='fa fa-times']").waitUntil(visible, 10000);
        //кликаем Отменить
        cancel.click();
    }

    public static void userLogout() {
        SelenideElement item_avatar = $("[class='item-avatar']").waitUntil(visible, 10000);
        //кликаем по аватару в боковом меню
        item_avatar.click();
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']").shouldHaveSize(2);
        //кликаем на Выход в боковом меню
        popContentMenu.get(1).click();
    }

}
