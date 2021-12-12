package app.youtuybe.autotest.objects;

import app.youtuybe.autotest.util.ActionHelper;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.refresh;

public class RootPageObject {

    public SelenideElement newPage = $("ytd-topbar-logo-renderer[id='logo']");

    public void createNewPage() {
        newPage.click();
        refresh();
    }
}
