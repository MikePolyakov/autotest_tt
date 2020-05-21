import com.codeborne.selenide.testng.GlobalTextReport;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import root.utillities.parserString;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

@Listeners({GlobalTextReport.class})
public class Start {
    static final String PROTOCOL_PROP = "mail.store.protocol";
    static final String PROTOCOL_TYPE = "imaps";
    String messageContent="";
    parserString newParse = new parserString();

    public String condition ="";
    public String companyNameString= "КОМПАНИЯ";
    public String poolNameString = "AutoTestName";
    public String reportNameString = "AutoTestReport";
    public String reportOpenNameString = "AutoTestOpenReport";
    public int pageListSize = 0;
//    public String login = "ponomarevafortest@gmail.com";
//    public String password = "123456-qwerty";
    public String login = "tt.test.survey@gmail.com";
    public String password = "tt123456TT";
//    public String loadStructureURL = "C:\\StructureAutotest.xlsx";
    public String loadStructureURL = "";

    @BeforeSuite(alwaysRun=true)
    public void setUp (){
        baseUrl ="https://engagement-stage.talenttechlab.org/login/";
        browser=CHROME;
        timeout=15000;
        startMaximized = true;
        driverManagerEnabled = false;
        holdBrowserOpen = true;
    }
}
