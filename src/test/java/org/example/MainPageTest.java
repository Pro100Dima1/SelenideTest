package org.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {

    @BeforeAll
    public static void setUp() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x800";
        Configuration.baseUrl = "https://www.ticketland.ru";
        Configuration.holdBrowserOpen = true;
        selenideOpen();
    }
    public static void selenideOpen(){
        open("https://www.ticketland.ru");
    }
    @DisplayName("Проверка наличия кнопки поиска")
    @Test
    public void checkSearchButton(){
        $("button[class='calendar-search-btn btn btn--primary btn--icon']").isDisplayed();
    }


}
