package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SecondTime {
    @Test
    void secondTime(){
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        open("https://github.com/");
$(".js-site-search-focus").setValue("Selenide").pressEnter();
$$(".repo-list li").first().$("a").click();
$(".Layout-sidebar").$(Selectors.byText("contributors"))
.ancestor(".BorderGrid-cell").$$("ul li")
        .first().hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
    }
}
