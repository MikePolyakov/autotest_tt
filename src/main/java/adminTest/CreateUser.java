package adminTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import root.PageNavigator;

import static com.codeborne.selenide.Selenide.*;

public class CreateUser extends AdminAuthorization{

    public void createUser(){
        PageNavigator pn = new PageNavigator();
        //заходим на страницу всех пользователей
        ElementsCollection sideMenu = $$("[class^='side-menu__item ']");
        sideMenu.get(4).click();
        sleep(2000);
        //кнопка добавить пользователя
        SelenideElement createUserButton = $("[class='page-header__controls']");
        createUserButton.click();
//вводим e-mail и имя
        SelenideElement nameText = $ ("[placeholder='Имя и фамилия']");
        nameText.setValue("User ForTest");
        SelenideElement emailText = $("[placeholder='email']");
        nameText.setValue("ponomarevafortest@gmail.com");
//далее кнопка
        SelenideElement vv = $("[class='ant-btn ant-btn-primary']");
        vv.click();
//2 страница
//выбираем ассоциированную компанию(ту самую, которую создали, название l)
//1.кликнули по плейсхолдеру
//SelenideElement chooseCompany = $("[class='ant-select ant-select-enabled']");
        ElementsCollection forText = $$("[class='page-body__form']");
        forText.size();
        SelenideElement chooseCompany = forText.get(0);
        chooseCompany.click();
//2.ищем список компаний(надо собрать коллекцию. ее размер 1. id Меняется от браузера к браузеру
        ElementsCollection chooseCompanyList = $$("[role^='listbox']");
        ElementsCollection listCompanyCollection = $$("[role^='option']");
        listCompanyCollection.findBy(Condition.text(companyNameString)).click();
//3.кликаем по списку роей
        SelenideElement chooseRules = forText.get(1);
        chooseRules.click();
//2.выбираем роль
        ElementsCollection listRulesCollection = $$("[role^='option']");
        listRulesCollection.findBy(Condition.text("Контент-менеджер")).click();
//ищем кнопку выслать приглашение и кликаем по ней.
        SelenideElement sendWelcome = $("[type='button']");
        sendWelcome.click();

//проверка что пользователь есть в списке пользователей(необходимо зайти под админом)
//проверка что у пользователя есть доступ в админку(сложно - нужно проверять доступ только к тем страницам, для которых достаточно прав)
//проверка, что есть надпись "Ссылка для входа отправлена на"
        ElementsCollection checkUser = $$("[class^='color: rgb(132, 146, 166);']");
        Assert.assertEquals(checkUser.size(), 0, "Нет надписи о высланном пользователю приглашении!");
        System.out.println("createUser - прошел");
    }
}
