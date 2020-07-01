package analytics;

import com.codeborne.selenide.testng.GlobalTextReport;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

@Listeners({GlobalTextReport.class})
public class StartOld {
    static String projectName = "Engagement";
    static String environment = "prod";
//    static String environment = "stage";
//
//    static String surveyNumber = "59a4982c08"; // [prod 325] LENTA Pulse 2020
//    static String surveyNumber = "e3861257b5"; // [prod 326] Nordgold Drive - 2020
//    static String surveyNumber = "062a5ae28d"; // [prod 352] TUInsight - 2020
    static String surveyNumber = "422d116596"; // [prod 353] Engagement SeverGroup Medicine 2020
//    static String surveyNumber = "5b5faa3281"; // [prod 358] Engagement UTKONOS 2020
//    static String surveyNumber = "28b4a8de59"; // [prod 377] EnergoPulse Power Machines 2020
//    static String surveyNumber = "95bc51135a"; // Pulse stage
    static String result = "`Result:` " + projectName + " " + environment + " Survey "+ surveyNumber + " passed";
    static String domain = "http://survey.talenttechlab.com/";
//    static String domain = "https://survey-stage.talenttechlab.org/";
    static String baseUrl = domain + surveyNumber;

    @BeforeSuite(alwaysRun=true)
    public void setUp (){
        browser=CHROME;
        timeout=15000;
        startMaximized = false;
        driverManagerEnabled = false;
        holdBrowserOpen = true;
        screenshots = false;
        savePageSource = false;
        headless = false;
    }
}