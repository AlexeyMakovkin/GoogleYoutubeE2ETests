package app.youtuybe.autotest.objects;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class NProgressObject {

    static public void waitProgressBar() {
        $("yt-page-navigation-progress[aria-valuemin]").shouldNotBe(visible, Duration.ofSeconds(10));
    }

}
