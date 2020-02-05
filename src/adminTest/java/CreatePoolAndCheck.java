import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

//public class CreatePoolAndCheck extends AdminAutorizaciya{
    public class CreatePoolAndCheck{
    String l = "тиорлдж";
    String testName= "AutoTestName";
    @Test //(dependsOnMethods = "adminAutorizaciya")
public void createPoolAndCheck(){
        sleep(3000);
        ElementsCollection allCompanies = $$("[class^='ant-col ant-col-6']");
        allCompanies.size();
//фильтруем элементы списка по совпадению со строкой
        int y = allCompanies.filterBy(Condition.text(l)).size();
        Assert.assertEquals(y, 1, "Нет компании с таким именем или у вас недостаточно прав");
        sleep(2000);
        ElementsCollection allCompanyName = $$("[class^='card__title']");

            for (int i=0; i<allCompanyName.size(); i++) {
                SelenideElement e2= allCompanyName.get(i);
                String line = e2.text();
//если строка совпала, то переходим к этому элементу списка и кликаем по нему.
                if (l.equals(line)){
                e2.click();
                }
            }
        sleep(2000);
//ищем кнопку Добавить опрос и кликаем по ней
        SelenideElement makePoolButton = $("[class='ant-btn ant-btn-primary']");
        makePoolButton.click();
        //ищем текстовое поле и вводим в него название опроса
        SelenideElement createPoolName = $("[placeholder='Введите название опроса']");
        createPoolName.setValue("AutoTestName");
        //ищем и нажимаем кнопку Далее
        makePoolButton.click();
        //редактируем (?) срок проведения опроса. или не трогаем и просто тыкаем Далее
        makePoolButton.click();
        //выбираем ассоциированную компанию(ту самую, которую создали, название l)
        //1.кликнули по плейсхолдеру
        SelenideElement chooseCompany = $("[class='ant-select ant-select-enabled']");
        chooseCompany.click();
        //2.ищем список компаний
        ElementsCollection listCollection = $$("[class^='ant-select-dropdown-menu-item']");
        listCollection.findBy(Condition.text(l)).click();
//нажимаем Создать опрос
        makePoolButton.click();
        //перекинуло на страницу конструктора опроса(можно это проверить, поискав кнопку запуска или кнопки меню)
        sleep(2000);
        ElementsCollection runTestButton = $$("[class^='ant-btn ant-btn-success']");
        Assert.assertFalse(runTestButton.size()==0, "Опрос не создан!");
//надо проверять, что создан шаблон: есть 3 страницы и кнопка
        ElementsCollection checkTemplate = $$("[class^='ant-collapse-item ant-collapse-no-arrow']");
        Assert.assertEquals(checkTemplate.size(), 3, "В шаблоне опроса не 3 страницы!");
//надо перейти на страницу опросы, отфильтровать по названию. убедиться, что такой опрос есть
        SelenideElement sideMenu = $("[class='sidebar']");
        ElementsCollection sideMenuButtons= $$(sideMenu.findElements(By.cssSelector("[class^='side-menu__item ']")));
        for (int i=0; i<sideMenuButtons.size(); i++){
            ElementsCollection findOpros = $$(sideMenuButtons.get(i).findElements(By.cssSelector("[title='Все опросы']")));
            if (findOpros.size()!=0){
                sideMenuButtons.get(i).click();
            }
        }
 //собираю весь список опросов, фильтрую по названию и ищу совпадения
        ElementsCollection checkCountPool = $$("[class^='entity-list__item-wrapper']");
        int y1 = checkCountPool.filterBy(Condition.text("AutoTestName")).size();
        Assert.assertFalse(y1==0,"Нет опроса с таким названием в списке всех опросов!");
    }
}
