package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;

public class SecondTime {
    @Test
    void secondTime(){
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        open("https://github.com/");
$(".js-site-search-focus").setValue("Selenide").pressEnter();
$$(".repo-list li").first().$("a").click();

    }
}
