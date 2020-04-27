package analytics;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static java.lang.Math.random;
import static java.lang.String.format;
import static org.testng.Assert.assertEquals;

public class EngegementForSeverstal {
    @Test(description="Ингейджмент генерация данных. Пульс Северстали")
    public void generationProfilePuls() {
        for (int i = 0; i < 50; i++) {

            Selenide.open("https://survey-stage.talenttechlab.org/survey/440fba203/welcome");
            sleep(1000);
            clickButtonNextToProfile();
            sleep(3000);

            //страница 1 структура
            clickLink();
            sleep(500);
            chooseSubdivision();
            sleep(500);
            clickButtonNext();
            sleep(1000);


            //страница 2
            choseNumberForQuestion2();
            inputAnswerForFirstQuestionOnPage(generatorText()+ generatorText() + generatorText());
            choseNumberForQuestion4();
            inputAnswerForLastQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            clickButtonNext();
            sleep(3000);

            //страница 3
            choseNumberForQuestion6();
            sleep(500);
            inputAnswerForFirstQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            clickButtonNext();

            //страница 4   
            sleep(3000);
            chosePoint6from7();
            sleep(500);
            clickButtonNext();
            sleep(2500);

            //страница 5  4 вопроса про счастье
            choseNumberForQuestion9();
            sleep(500);
            choseNumberForQuestion10();
            sleep(500);
            choseNumberForQuestion11();
            sleep(500);
            choseNumberForQuestion12();
            sleep(500);
            clickButtonNext();
            sleep(4000);

            //страница
            choseDihotomiya13();
            sleep(500);
            inputCommentForFirstQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForFirstQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya15();
            sleep(500);
            inputAnswerForQuestion15(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion16(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya17();
            sleep(500);
            inputAnswerForQuestion17(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion18(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya19();
            sleep(500);
            inputAnswerForQuestion19(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion20(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya21();
            sleep(500);
            inputAnswerForQuestion21(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion22(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya23();
            sleep(500);
            inputAnswerForQuestion23(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion24(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya25();
            sleep(500);
            inputAnswerForQuestion25(generatorText()+ generatorText() + generatorText());
            sleep(300);
            inputAnswerForQuestion26(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya27();
            sleep(500);
            inputAnswerForQuestion27(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion28(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya29();
            sleep(500);
            inputAnswerForQuestion29(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion30(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya31();
            sleep(500);
            inputAnswerForQuestion31(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion32(generatorText()+ generatorText() + generatorText());
            sleep(500);
            choseDihotomiya33();
            sleep(500);
            inputCommentForLastQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForLastQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            clickButtonNext();
            sleep(2500);

            //страница 7 завал 1, 1,1,1
            choseAnswerForQuestion35();
            sleep(500);
            choseAnswerForQuestion36();
            sleep(500);
            choseAnswerForQuestion37();
            sleep(500);
            choseAnswerForQuestion38();
            sleep(300);
            choseAnswerForQuestion39(); ///уточнить
            sleep(300);
            choseAnswerForQuestion40();
            sleep(300);
            choseAnswerForQuestion41();
            sleep(300);
            choseAnswerForQuestion42();
            sleep(700);
            clickButtonNext();
            sleep(3000);

            //страница 8
            if (getSizeCollection() == 16){
                choseAnswerForQuestion43();
                sleep(500);
            } else {
                clickBack();
                sleep(1000);
                // clickButtonNext();
                // sleep(1000);
                choseAnswerForQuestion43();
                sleep(500);}

            choseAnswerForQuestion44();
            sleep(580);
            clickButtonNext();
            sleep(3500);

            //страница 9

            if (getSizeCollection() == 30){
                choseAnswerForQuestion45();
                sleep(500);
            } else {
                clickBack();
                sleep(1000);
                //clickButtonNext();
                //sleep(1000);
                choseAnswerForQuestion45();
                sleep(500);}

            choseAnswerForQuestion46();
            sleep(500);
            choseAnswerForQuestion47(); ///уточнить
            sleep(500);
            choseAnswerForQuestion48();
            sleep(500);
            clickButtonNext();
            sleep(3000);

            //страница 10 завал 1, 1

            if (getSizeCollection() == 37){
                choseAnswerForQuestion49();
                sleep(500);
            } else {
                clickBack();
                sleep(1000);
                //clickButtonNext();
                //sleep(1000);
                choseAnswerForQuestion49();
                sleep(300);}

            choseAnswerForQuestion50();
            sleep(300);
            choseAnswerForQuestion51();
            sleep(300);
            choseAnswerForQuestion52(); ///уточнить
            sleep(300);
            choseAnswerForQuestion53();
            sleep(600);
            clickButtonNext();
            sleep(3500);

            // страница 11

            if (getSizeCollection() == 51){
                choseAnswerForQuestion54();
                sleep(500);
            } else {
                clickBack();
                sleep(500);
                clickButtonNext();
                sleep(1000);
                choseAnswerForQuestion54();
                sleep(100);}

            choseAnswerForQuestion55();
            sleep(100);
            choseAnswerForQuestion56();
            sleep(100);
            choseAnswerForQuestion57();
            sleep(100);
            choseAnswerForQuestion58();
            sleep(100);
            choseAnswerForQuestion59();
            sleep(500);
            choseAnswerForQuestion60();
            sleep(500);
            clickButtonNext();
            sleep(3000);

            // страница 12 ответ на 3 текстовых вопроса
            inputAnswerForFirstQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForQuestion62(generatorText()+ generatorText() + generatorText());
            sleep(500);
            inputAnswerForLastQuestionOnPage(generatorText()+ generatorText() + generatorText());
            sleep(500);
            clickButtonNext();
            sleep(3000);

            // страница 13
            choseOption1fromQuestion64();
            sleep(500);
            choseOption1fromQuestion65();
            sleep(800);
            choseOption1fromQuestion66();
            sleep(500);
            choseOption1fromQuestion67();
            sleep(700);
            choseOption1fromQuestion68();
            sleep(700);
            choseOption1fromQuestion69();
            sleep(700);
            complete();

            sleep(2000);
            assertEquals(massageComplete(),
                    1,
                    "Опрос не завершен");
            System.out.println("Опрос пройден успешно!");
        }

    }


    @AfterMethod
    private void closeBrowser() {
        close();
    }

    public int massageComplete() {
        return $$(byText("Благодарим за участие!")).size();
    }

    private void clickLink() {
        //$("[class='pseudo-link pt-3']").click();
        $(byText("Не нашли свое подразделение?")).click();}

    public static String generatorText(){
        String result = "";
        String text= "src/main/resources/textgenerator.txt";
        Random r = new Random();
        try {
            Object[] texts = Files.readAllLines(Paths.get(text)).toArray();
            result = texts[r.nextInt(texts.length)].toString();
        }
        catch (Exception e) {}

        return result + " " + result + " " + result; }

    private void chooseSubdivision() {
        SelenideElement c = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        c.click();
        sleep(300);
        $$( "[class='list-item text-break']").find(Condition.text("КОРПОРАТИВНЫЙ СЕГМЕНТ (ЦЕС, Инфоком, Авиа, СПб_Гипрошахт)")).click();
        sleep(300);
        SelenideElement a = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        a.click();
        sleep(300);
        $$( "[class='list-item text-break']").find(Condition.text("Центр единого сервиса")).click();
        sleep(300);
        SelenideElement v = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        v.click();
        sleep(300);
        $$( "[class='list-item text-break']").find(Condition.text(" ОСП Северсталь Череповец ")).click();
        sleep(300);
        SelenideElement s = $$("[class='v-icon notranslate fal fa-angle-down theme--light']").last();
        s.click();
        sleep(500);
        $$( "[class='list-item text-break']").find(Condition.text("Финансы_ОСП Северсталь Череповец (Руководитель - Ю.Г. Деряга)")).click();
    }

    private void clickButtonNext() {
        $(byText("Далее")).click(); }

    private void clickButtonNextToProfile() {
        $(byText("Заполнить анкету")).click();
    }

    private void complete() {
        $(byText("Завершить опрос")).click();
    }

    private void clickBack() {
        $("[class='v-icon notranslate fal fa-angle-left theme--light']").click();
    }

    private void inputAnswerForFirstQuestionOnPage(String generatorProfessions) {
        SelenideElement d = $("[placeholder='Введите ответ']");
        sleep(100);
        d.setValue(generatorProfessions); }

    private void inputAnswerForLastQuestionOnPage(String generatorProfessions) {
        SelenideElement d = $$("[placeholder='Введите ответ']").last();
        d.setValue(generatorProfessions);
    }

    private void inputCommentForFirstQuestionOnPage(String generatorProfessions) {
        SelenideElement inputAnswer = $("[placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions);
    }

    private void inputAnswerForQuestion15(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question15'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions);
    }

    private void inputAnswerForQuestion16(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question16'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions);
    }

    private void inputAnswerForQuestion17(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question17'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions);
    }

    private void inputAnswerForQuestion18(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question18'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions);
    }

    private void inputAnswerForQuestion19(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question19'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion20(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question20'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion21(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question21'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion22(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question22'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion23(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question23'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion24(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question24'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion25(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question25'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion26(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question26'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion27(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question27'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion28(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question28'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion29(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question29'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion30(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question30'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion31(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question31'] [placeholder='Оставьте комментарий']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputAnswerForQuestion32(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question32'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    private void inputCommentForLastQuestionOnPage(String generatorProfessions) {
        SelenideElement inputAnswer = $$("[placeholder='Оставьте комментарий']").last();
        inputAnswer.setValue(generatorProfessions); }



    private void inputAnswerForQuestion62(String generatorProfessions) {
        SelenideElement inputAnswer = $("[id='question62'] [placeholder='Введите ответ']");
        inputAnswer.setValue(generatorProfessions); }

    //выбирает рандомное значение из списка
    private void testRandomNumber() {
        ElementsCollection itemList = itemListForQuestion1();
        SelenideElement item = itemList.get((int) (random() * itemList.size()));
        item.click(); }


    private void choseNumberForQuestion2() {
        // стр.2 для условия 9 или 10 жестко задаем 9 или 10;
        // стр.2 для условия от 0 до 6 выбираем int min = 1; int max = 6;
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question2'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(11);
        d.get(7).click(); }


    public ElementsCollection itemListForQuestion1() {
        return $$(format("[id='question2'] [class='btn__wrapper display-flex flex-column']"));
    }

    public void choseNumberForQuestion4() {
        // стр.2 для условия от 0 до 6 выбираем int min = 1; int max = 6;
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question4'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(11);
        d.get(7).click(); }


    public int getSizeCollection() {
        return $$("[class='v-btn__content']").size(); }

    public int getSizeCollectionFaces() {
        return $$("[class='v-icon notranslate fal fa-angry theme--light']").size(); }


    public void choseNumberForQuestion6() {
        // стр.3 для условия меньше 6 выбираем int min = 1; int max = 5;
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question6'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(11);
        d.get(i).click(); }

    public void choseNumberForQuestion9() {
        // стр.5 для условия меньше 5 выбираем int min = 1; int max = 4;
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question9'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }


    public void choseNumberForQuestion10() {
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question10'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion11() {
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question11'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void choseNumberForQuestion12() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min -1;
        ElementsCollection d = $$("[id='question12'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click(); }

    public void chosePoint6from7( ) {
        ElementsCollection itemList = itemList1();
        SelenideElement item = itemList.get((int) (random() * itemList.size()));
        item.click();
    }

    public ElementsCollection itemList1() {
        return $$(format("[class='v-btn v-btn--contained theme--light v-size--default']"));
    }

    private void choseDihotomiya13() {
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question13'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();
    }

    private void choseDihotomiya15() {
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question15'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya17() {
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question17'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya19() {
        SelenideElement s= $(byText( "Оперативность и качество ремонтов и обслуживания оборудования"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question19'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya21() {
        SelenideElement s= $(byText( "Скорость решения совместных вопросов между участками, службами, цехами"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question21'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya23() {
        SelenideElement s= $(byText( "Скорость решения кросс-функциональных вопросов с дирекциями и управлениями"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question23'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya25() {
        SelenideElement s= $(byText( "Привлечение знаний, опыта, лучших практик других подразделений компании и внешних партнеров"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question25'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya27() {
        SelenideElement s= $(byText( "Проведение экспериментов, тестирование новых методов и технологий"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question27'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya29() {
        SelenideElement s= $(byText( "Внедрение цифровых технологий (автоматизация производственных процессов, работа с данными и т.д.)"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question29'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}


    private void choseDihotomiya31() {
        SelenideElement s= $(byText( "Оперативность реализации инвестиционных мероприятий/проектов"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question31'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}

    private void choseDihotomiya33() {
        SelenideElement s= $(byText( "Внесение изменений в работу с учетом обратной связи от клиентов"));
        s.scrollTo();
        int min = 2;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question33'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(6);
        d.get(i).click();}


    private void choseAnswerForQuestion35() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question35'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion36() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question36'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion37() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question37'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion38() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question38'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion39() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question39'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion40() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question40'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion41() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question41'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion42() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question42'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion43() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question43'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}


    public void choseAnswerForQuestion44() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question44'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    public void choseAnswerForQuestion45() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question45'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    public void choseAnswerForQuestion46() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question46'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    public void choseAnswerForQuestion47() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question47'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}


    public void choseAnswerForQuestion48() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question48'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    public void choseAnswerForQuestion49() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question49'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    public void choseAnswerForQuestion50() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question50'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    public void choseAnswerForQuestion51() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question51'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    public void choseAnswerForQuestion52() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question52'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}


    //11 страница
    private void choseAnswerForQuestion53() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question53'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion54() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question54'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion55() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question55'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion56() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question56'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion57() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question57'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion58() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question58'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion59() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question59'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseAnswerForQuestion60() {
        int min = 1;
        int max = 7;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question60'] [class='btn__wrapper display-flex flex-column']").shouldHaveSize(7);
        d.get(i).click();}

    private void choseOption1fromQuestion64() {
        int min = 1;
        int max = 8;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min-1;
        ElementsCollection d = $$("[id='question64'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(8);
        d.get(i).click();
    }
    private void choseOption1fromQuestion65() {
        // $(byText( "4-5 разряд")).click();
        // $(byText( "1-3 разряд")).click();
        $(byText( "6-8 разряд")).click();

   /*     SelenideElement s= $(byText( "Укажите, пожалуйста, разряд (только для рабочих и старших рабочих):"));
        s.scrollTo();
        int min = 1;
        int max = 2;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        ElementsCollection d = $$("[id='question65'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(2);
        d.get(i).click();*/
    }
    private void choseOption1fromQuestion66() {
        $(byText( "30-34 года")).click();
        // $(byText( "25-29 лет")).click();
        //Младше 25 лет
        //25-29 лет
        //30-34 года
        //35-44 года
        //45-54 года
        //55 лет и старше
     /*   SelenideElement s= $(byText( "Пожалуйста, укажите ваш возраст"));
        s.scrollTo();
        int min = 1;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        ElementsCollection d = $$("[id='question66'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(5);
        d.get(i).click();*/
    }
    private void choseOption1fromQuestion67() {
        //  $(byText( "До 1 года")).click();
        $(byText( "От 15 до 20")).click();

        //До 1 года
        //От 1 до 3
        //От 3 до 5
        //От 5 до 10
        //От 10 до 15
        //От 15 до 20
        //Более 20 лет

     /*  SelenideElement s= $(byText( "Укажите ваш стаж работы в компании, пожалуйста"));
        s.scrollTo();
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        ElementsCollection d = $$("[id='question67'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(6);
        d.get(i).click();*/
    }

    private void choseOption1fromQuestion68() {
        //$(byText( "Служба по обеспечению бизнеса (СОБ)")).click();
        $(byText( "Финансы")).click();
        //$(byText( "Охрана труда, промышленная безопасность и экология")).click();
        //$(byText( "Развитие БСС")).click();
        //$(byText( "Социально-бытовой комплекс, секретариат, административная поддержка")).click();
        //$(byText( "Продажи сырья и закупки")).click();
        //$(byText( "Проектные работы")).click();
        // $(byText( "Работа с персоналом (HR)")).click();
        //$(byText( "PR, GR")).click();
    /*    SelenideElement s= $(byText( "Функциональное направление Вашей работы/основных процессов, в которых Вы принимаете участие:"));
        s.scrollTo();
        int min = 1;
        int max = 18;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        ElementsCollection d = $$("[id='question68'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(18);
        d.get(i).click();*/
    }
    private void choseOption1fromQuestion69() {
        $(byText( "Ярославль")).click();
        // $(byText( "Орел")).click();
    /*    SelenideElement s= $(byText( "Город, где Вы живете:"));
        s.scrollTo();
        int min = 1;
        int max = 17;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        ElementsCollection d = $$("[id='question69'] [class='display-inline-flex w-100 mono__answer cursor-pointer']").shouldHaveSize(17);
        d.get(i).click();*/
    }

}
