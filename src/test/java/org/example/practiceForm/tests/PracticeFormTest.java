package org.example.practiceForm.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
        String emailVal = "Mihov";
        practiceFormPage.sendValueEmailInput(emailVal);
    }

    @Tag("RadioButton")
    @DisplayName("Проверка выбора radioButton Gender Male")
    @Test
    public void checkGenderRadioButton() {
        String gender = "Male";
        practiceFormPage.clickOnRadioButtonGender(gender);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода Mobile Number")
    @Test
    public void checkMobileNumberInput() {
        String mobileNumber = "89345548595";
        practiceFormPage.setMobileNumber(mobileNumber);
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
        practiceFormPage.clickOnHobbiesCheckBox();
    }

    @Tag("Input")
    @DisplayName("Проверка ввода в поле Current Address")
    @Test
    public void checkCurrentAddress() {
        String address = "Moscow";
        practiceFormPage.sendValueCurrentAddress(address);
    }

    @Tag("Registration")
    @DisplayName("Проверка успешной регистрации")
    @Test
    public void succsessfulRegistrationTest() {
        String name = "Dudka";
        String lastName = "Trubnik";
        String emailVal = "Mihov@mail.com";
        String mobileNumber = "89345548595";
        String gender = "Male";
        String address = "Moscow";

        practiceFormPage.sendValueFirstNameInput(name)
                .sendValueLastNameInput(lastName)
                .sendValueEmailInput(emailVal)
                .setMobileNumber(mobileNumber)
                .clickOnRadioButtonGender(gender)
                .sendValueCurrentAddress(address)
                .clickOnHobbiesCheckBox();
    }
}
