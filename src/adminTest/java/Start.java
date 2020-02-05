import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.impl.SelenideElementIterator;
import com.codeborne.selenide.testng.GlobalTextReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.util.Random;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static org.testng.AssertJUnit.assertEquals;

@Listeners({GlobalTextReport.class})
public class Start {

    static final String PROTOCOL_PROP = "mail.store.protocol";
    static final String PROTOCOL_TYPE = "imaps";
    String messageContent="";
    parserString newParse = new parserString();
    public String condition ="";
    public String companyNameString= "тиорлдж";
    public String companyPoolString = "AutoTestName";
    public int pageListSize = 0;

    @BeforeSuite(alwaysRun=true)
    public void setUp (){
        baseUrl ="https://engagement-stage.talenttechlab.org/login/";
        browser=CHROME;
        timeout=15000;
        startMaximized = true;
        driverManagerEnabled = false;
        holdBrowserOpen = true;
        //reopenBrowserOnFail = false;
    }



}
