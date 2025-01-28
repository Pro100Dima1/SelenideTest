package org.example.practiceForm.tests;

import com.codeborne.selenide.Configuration;
import org.example.practiceForm.pages.PracticeFormPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.closeWindow;

public class TestBase {

    public PracticeFormPage practiceFormPage = new PracticeFormPage();

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x800";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
        practiceFormPage.selenideOpen();
    }

    /*@AfterEach
    public void tearDown() {
        closeWindow();
    }*/
}
