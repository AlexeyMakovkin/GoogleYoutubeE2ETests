package app.youtuybe.autotest.all;

import app.youtuybe.autotest.BaseTest;
import app.youtuybe.autotest.objects.UserLoginObject;
import app.youtuybe.autotest.util.ActionHelper;
import org.junit.jupiter.api.Test;

public class CheckUserTest extends BaseTest {

    @Test
    public void checkUser() {
        //WHEN
        ActionHelper.targetClick(ActionHelper.iconUser);

        //THEN
        UserLoginObject.checkName("testyoutubbeee@gmail.com");
    }
}
