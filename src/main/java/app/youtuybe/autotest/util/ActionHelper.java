package app.youtuybe.autotest.util;

import app.youtuybe.autotest.objects.NProgressObject;
import app.youtuybe.autotest.objects.RootPageObject;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class ActionHelper {

    static public final SelenideElement clickSearchBox = $("ytd-searchbox[role='search']");
    static public final SelenideElement iconUser = $("button[id='avatar-btn']");

    static public void doEnter() { actions().sendKeys(Keys.ENTER).perform(); }

    static public void sendKeys(String text) {
        actions().click(clickSearchBox).sendKeys(text).perform();
    }

    static public void targetClick(SelenideElement target) {
        actions().click(target).perform();
    }

    static public void goToANewPage() {
        var rootPageObject = new RootPageObject();
        rootPageObject.createNewPage();
        NProgressObject.waitProgressBar();
    }
}
