package org.example.practiceForm;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;
import static java.awt.SystemColor.control;

public class PracticeFormTest {

    @BeforeAll
    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        Configuration.browser = "firefox";
        Configuration.browserSize = "1280x800";
        //Configuration.baseUrl = "https://demoqa.com";
        //Configuration.holdBrowserOpen = true;
        //Configuration.pageLoadTimeout = 120000;
        selenideOpen();
    }

    public static void selenideOpen(){
        //open("/automation-practice-form");
        open("https://demoqa.com/automation-practice-form", PracticeFormTest.class);
    }

    @Tag("Input")
    @DisplayName("Проверка наличия поля ввода FirstName")
    @Test
    public void checkFirstNameInput(){
        $("#firstName").setValue("Qaqw");
    }

    @Tag("Input")
    @DisplayName("Проверка наличия поля ввода LastName")
    @Test
    public void checkLastNameInput(){
        $("#lastName").isDisplayed();
    }

    @Tag("Input")
    @DisplayName("Проверка наличия поля ввода Email")
    @Test
    public void checkEmailInput(){
        $("#userEmail").isDisplayed();
    }

    @Tag("RadioButton")
    @DisplayName("Проверка выбора radioButton Gender Male")
    @Test
    public void checkGenderRadioButton(){
        $("#gender-radio-1").setSelected(true);
    }   // Пока оставлю. Киря поможет с радиобатанном

    @Tag("Input")
    @DisplayName("Проверка наличия поля ввода Mobile Number")
    @Test
    public void checkMobileNumberInput(){
        $("#userNumber").isDisplayed();
        $("#userNumber").setValue("848484");
    }

    @Tag("Date")
    @DisplayName("Проверка выбора года рождения в Date of Birth")
    @Test
    public void checkDateOfBirth(){
        $("#dateOfBirthInput").isDisplayed();
        $("#dateOfBirthInput").click();
        $("#react-datepicker__day react-datepicker__day--030 react-datepicker__day--outside-month").click();
        $("#react-datepicker__month-select").selectOption("January");
        $("#react-datepicker__year-select").selectOption("2025");
    }








}
