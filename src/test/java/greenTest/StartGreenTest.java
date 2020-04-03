package greenTest;

import com.codeborne.selenide.testng.GlobalTextReport;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import root.utillities.parserString;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

@Listeners({GlobalTextReport.class})
public class StartGreenTest {
    static final String PROTOCOL_PROP = "mail.store.protocol";
    static final String PROTOCOL_TYPE = "imaps";
    String messageContent="";
    parserString newParse = new parserString();

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
