import com.codeborne.selenide.testng.GlobalTextReport;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

@Listeners({GlobalTextReport.class})
public class Start {

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