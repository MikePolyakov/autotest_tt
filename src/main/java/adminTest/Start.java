package adminTest;

import com.codeborne.selenide.testng.GlobalTextReport;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import root.utillities.parserString;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static org.testng.AssertJUnit.assertEquals;

@Listeners({GlobalTextReport.class})
public class Start {

    static final String PROTOCOL_PROP = "mail.store.protocol";
    static final String PROTOCOL_TYPE = "imaps";
    public static String messageContent="";
    public static parserString newParse = new parserString();
    public String condition ="";
    public String companyNameString= "тиорлдж";
    public String companyPoolString = "AutoTestName";
    public int pageListSize = 0;
    public static String login = "tt.test.survey@gmail.com";
    public static String password = "tt123456TT";
//    public String statusPool = "";

    @BeforeSuite(alwaysRun=true)
    public void setUp (){
//        baseUrl ="https://engagement-stage.talenttechlab.org/login/";
        browser=CHROME;
        timeout=15000;
//        startMaximized = true;
        driverManagerEnabled = false;
        holdBrowserOpen = true;
        //reopenBrowserOnFail = false;
    }



}
