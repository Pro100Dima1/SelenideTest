package org.example.practiceForm;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        Configuration.browser = "chrome";
        Configuration.browserSize = "1280x800";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
        selenideOpen();
    }

    @AfterEach
    public void tearDown() {
        closeWindow();
    }

    public static void selenideOpen() {
        open("/automation-practice-form");
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода FirstName")
    @Test
    public void checkFirstNameInput() {
        $("#firstName").sendKeys("Lesha");
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода LastName")
    @Test
    public void checkLastNameInput() {
        $("#lastName").isDisplayed();
        $("#lastName").sendKeys("Miha");
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода Email")
    @Test
    public void checkEmailInput() {
        $("#userEmail").isDisplayed();
        $("#userEmail").sendKeys("dfgds@asdfas");
    }

    @Tag("RadioButton")
    @DisplayName("Проверка выбора radioButton Gender Male")
    @Test
    public void checkGenderRadioButton() {
        $("#genterWrapper").$(byText("Male")).click();
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода Mobile Number")
    @Test
    public void checkMobileNumberInput() {
        $("#userNumber").isDisplayed();
        $("#userNumber").sendKeys("848484");
    }

    @Tag("Date")
    @DisplayName("Проверка выбора года рождения в Date of Birth")
    @Test
    public void checkDateOfBirth() {
        $("#dateOfBirthInput").isDisplayed();
        $("#dateOfBirthInput").click();
        $("select[class='react-datepicker__month-select']").selectOption("January");
        $("select[class='react-datepicker__year-select']").selectOption("2025");
        $("div[class = 'react-datepicker__day react-datepicker__day--030']").click();
    }

    @Tag("CheckBox")
    @DisplayName("Проверка нажатия на чекбокс Хобби")
    @Test
    public void checkHobbiesCheckBox() {
        $("#hobbiesWrapper").$(byText("Sports")).click();
    }

    @Tag("Input")
    @DisplayName("Проверка ввода в поле Current Address")
    @Test
    public void checkCurrentAddress() {
        $("#currentAddress").sendKeys("Dom");
    }

}
