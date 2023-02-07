package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SecondTime {
    @Test
    void secondTime(){
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 400000;
        open("http://193.47.154.27:9944/lite/");
$("#br_login").setValue("000000061");
$("#br_pwd").setValue("A").pressEnter();

    }
}
