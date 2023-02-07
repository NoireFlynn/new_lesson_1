package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class SecondTime {
    @Test
    void secondTime(){
        open("https://github.com/");

    }
}
