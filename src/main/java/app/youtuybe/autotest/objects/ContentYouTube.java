package app.youtuybe.autotest.objects;

import app.youtuybe.autotest.util.ActionHelper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.Visible;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ContentYouTube {

    static public final SelenideElement content = $("div[id='contents'] ytd-item-section-renderer");
    static public final SelenideElement buttonsFeedBack= $("div[id='player']");

    static public void checkContent() {
        content.shouldBe(Condition.visible, Duration.ofSeconds(10));
    }

    static public void checkContentButtonsFeedback() {
        buttonsFeedBack.shouldBe(Condition.visible);
    }

    static public void selectingVideosFromContent(String videoSelection) {
        var clickVideo = $(String.format("ytd-video-renderer[lockup]:nth-child(%s) h3", videoSelection));
        ActionHelper.targetClick(clickVideo);
    }
}
