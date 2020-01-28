import org.testng.annotations.BeforeSuite;
import org.testng.asserts.*;
import org.testng.asserts.Assertion.*;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.driverManagerEnabled;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

public class Start {
    @BeforeSuite(alwaysRun=true)
    public void setup (){
        baseUrl ="https://engagement-stage.talenttechlab.org/login/";
        browser="CHROME";  //Browsers.CHROME;
        timeout=15000;
        startMaximized = true;
        driverManagerEnabled = false;
        holdBrowserOpen = true;
        //reopenBrowserOnFail = false;
    }
    static final String PROTOCOL_PROP = "mail.store.protocol";
    static final String PROTOCOL_TYPE = "imaps";
    String messageContent="";
    parserString newParse = new parserString();
    public String condition ="";


}
