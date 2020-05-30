import com.codeborne.selenide.testng.GlobalTextReport;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.WebDriverRunner.CHROME;

@Listeners({GlobalTextReport.class})
public class StartSurvey {

    @BeforeSuite(alwaysRun=true)
    public void setUp (){
        browser=CHROME;
        driverManagerEnabled = false;
        holdBrowserOpen = true;
    }
}
