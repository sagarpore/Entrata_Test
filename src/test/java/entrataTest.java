import com.entrata.pages.WelcomePage;
import org.entrata.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class entrataTest extends BaseTest {

    WelcomePage welcomePage = new WelcomePage(driver);
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void launchBrowser() {
        launchApplication();
    }

    @Test(priority = 1, description = "Checking the Title")
    public void entrataFunctionality() {
        String titleName = driver.getTitle();
        System.out.println(titleName);
    }

    @Test(priority = 2, description = "Checking for the cookie consent pop up once the website loads")
    public void cookieConsentValidation() {
        boolean consentOption1 = welcomePage.cookieConsentOptions("Accept");
        boolean consentOption2 = welcomePage.cookieConsentOptions("Decline");

        softAssert.assertTrue(consentOption1, "Accept Cookies button not present");
        softAssert.assertTrue(consentOption2, "Decline Cookies button not present");

        softAssert.assertAll();
    }

    @Test(priority = 3, description = "Scheduling Demo")
    public void schedulingDemo() {
        welcomePage.clickOnButton("Schedule Demo");
    }

    @Test(priority = 4, description = "Filling Schedule Demo Details")
    public void fillScheduleDemoDetails() {
        welcomePage.fillScheduleDemoDetails("FirstName", "ABC");
        welcomePage.fillScheduleDemoDetails("LastName", "XYZ");
        welcomePage.fillScheduleDemoDetails("Email", "ABC@gmail.com");
        welcomePage.fillScheduleDemoDetails("Company", "Operative");
        welcomePage.fillScheduleDemoDetails("JobTitle", "Jr");
        welcomePage.fillScheduleDemoDetails("LastName", "Engineer");
    }

    @AfterTest
    public void tearDown() {
        driverQuit();
    }

}
