package app.youtuybe.autotest.util;

import app.youtuybe.autotest.objects.UserLoginObject;
import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selenide.*;

public class AuthHelper {

    static public void goToLoginPageAndLoginNative(String email, String password) {

        System.out.printf("Start login with email=%s%n", email);
        var loginPage = new UserLoginObject();

        open("https://www.youtube.com/");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        refresh();

        loginPage.nativeLogin(email, password);
    }
}
