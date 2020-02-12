package surveyTest;

import com.codeborne.selenide.testng.GlobalTextReport;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import root.utillities.parserString;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

@Listeners({GlobalTextReport.class})
public class StartPool {

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
        baseUrl ="https://survey-stage.talenttechlab.org/98c4d2fd47";
        browser=CHROME;
        timeout=15000;
        startMaximized = true;
        driverManagerEnabled = false;
        holdBrowserOpen = true;
        //reopenBrowserOnFail = false;
    }



}
