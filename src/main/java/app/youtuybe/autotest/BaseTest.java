package app.youtuybe.autotest;

import app.youtuybe.autotest.objects.RootPageObject;
import app.youtuybe.autotest.util.ActionHelper;
import app.youtuybe.autotest.util.AuthHelper;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    static private Boolean setupComplete = false;

    @BeforeAll
    void setup() {
        if (setupComplete) {
            return;
        }
        initDriver();
        setupComplete = true;
        AuthHelper.goToLoginPageAndLoginNative(
                (String) getProperty("testyoutubbeee"),
                (String) getProperty("q1w1e2r3t6")
        );
    }

    @AfterEach
    public void cleaningThePage() {
        ActionHelper.goToANewPage();
    }

    private void initDriver() {
        System.out.println("Start init driver");
        System.out.printf("Driver remote=%s%n", Configuration.remote);
        Configuration.browserCapabilities.setCapability("acceptInsecureCerts", true);
        Configuration.browser = "chrome";
        Configuration.browserVersion = "96.0";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        Configuration.browserCapabilities.setCapability("enableVideo", false);
        Configuration.browserCapabilities.setCapability("enableLog", false);
        Configuration.browserCapabilities.setCapability("sessionTimeout", "5m");
        Configuration.holdBrowserOpen = true;


    }

    static Object getProperty(String key) {
        return key;
    }
}
