package app.youtuybe.autotest.objects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class UserLoginObject {

    public SelenideElement clickButtonToComeIn = $("div[id=end] tp-yt-paper-button");
    public SelenideElement emailInput = $("input[type='Email']");
    public SelenideElement passwordInput = $("input[type='password']");
    public SelenideElement clickButtonFurther = $("div[class='qhFLie'] button[type='button']");
    static public final SelenideElement user = $("yt-formatted-string[id='email']");

    public void nativeLogin(String email, String password) {
        clickButtonToComeIn.click();

        emailInput.sendKeys(email);
        clickButtonFurther.click();

        passwordInput.sendKeys(password);
        clickButtonFurther.click();
    }

    static public void checkName(String name) {
        user.shouldHave(Condition.exactText(name));
    }
}
