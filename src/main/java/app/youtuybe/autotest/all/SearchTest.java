package app.youtuybe.autotest.all;

import app.youtuybe.autotest.BaseTest;
import app.youtuybe.autotest.util.ActionHelper;
import app.youtuybe.autotest.util.SearchHelper;
import app.youtuybe.autotest.objects.NProgressObject;
import app.youtuybe.autotest.objects.ContentYouTube;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {

    @Test
    public void checkingTheWorkOfTheSearch() {
        //GIVEN
        SearchHelper.inputSearch("1");

        //WHEN
        ActionHelper.doEnter();

        //THEN
        ContentYouTube.checkContent();
    }

    @Test
    public void inputTextSearch() {
        //GIVEN
        SearchHelper.inputSearch("Video 4k");

        //WHEN
        SearchHelper.selectionOfTheDesiredContent("4");

        //THEN
        NProgressObject.waitProgressBar();
        ContentYouTube.checkContent();

    }

    @Test
    public void videoSelectionAfterSearch() {
        //GIVEN
        SearchHelper.inputSearch("Forests");
        SearchHelper.selectionOfTheDesiredContent("4");

        //WHEN
        ContentYouTube.selectingVideosFromContent("4");

        //THEN
        NProgressObject.waitProgressBar();
        ContentYouTube.checkContentButtonsFeedback();
    }
}
