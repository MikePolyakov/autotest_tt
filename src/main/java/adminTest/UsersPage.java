package adminTest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class UsersPage {

    public UsersPage usersPageTest() {
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
        return this;
    }

    public UsersPage userPopupMenu() {
        SelenideElement item_avatar = $("[class='item-avatar']").waitUntil(visible, 10000);
        //кликаем по аватару в боковом меню
        item_avatar.click();
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']").shouldHaveSize(2);
        Assert.assertEquals(popContentMenu.size(), 2, "Pop-up меню содержит не 2 пункта!");
        return this;
    }

    public UsersPage userProfile() {
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
        return this;
    }

    public UsersPage userLogout() {
        SelenideElement item_avatar = $("[class='item-avatar']").waitUntil(visible, 10000);
        //кликаем по аватару в боковом меню
        item_avatar.click();
        ElementsCollection popContentMenu = $$("[class^='pop-content__item']").shouldHaveSize(2);
        //кликаем на Выход в боковом меню
        popContentMenu.get(1).click();
        return this;
    }

}
