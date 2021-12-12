package app.youtuybe.autotest.util;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SearchHelper {

    static public void inputSearch(String text) {
        ActionHelper.sendKeys(text);
    }

    static public void selectionOfTheDesiredContent(String numberLi) {
        var clickNeedLi = $(String.format("li[role='presentation']:nth-child(%s)", numberLi));
        ActionHelper.targetClick(clickNeedLi);
    }

}
