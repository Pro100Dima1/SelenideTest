package org.example.practiceForm.tests;

import com.codeborne.selenide.Configuration;
import org.example.practiceForm.pages.PracticeFormPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest extends TestBase {

    @Tag("Input")
    @DisplayName("Проверка поля ввода FirstName")
    @Test
    public void checkFirstNameInput() {
        String name = "Lesha";
        practiceFormPage.sendValueFirstNameInput(name);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода LastName")
    @Test
    public void checkLastNameInput() {
        String lastName = "Mihov";
        practiceFormPage.sendValueLastNameInput(lastName);
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
        practiceFormPage.setBirthDate("30", "January", "2025");
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

    @Tag("Registration")
    @DisplayName("Проверка успешной регистрации")
    @Test
    public void succsessfulRegistrationTest() {
        String name = "Dudka";
        String lastName = "Trubnik";

        practiceFormPage.sendValueFirstNameInput(name)
                .sendValueLastNameInput(lastName);
    }

}
