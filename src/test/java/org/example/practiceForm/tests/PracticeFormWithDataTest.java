package org.example.practiceForm.tests;

import org.example.practiceForm.pages.PracticeFormPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class PracticeFormWithDataTest extends TestData {
    public PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Tag("Input")
    @DisplayName("Проверка поля ввода FirstName")
    @Test
    public void checkFirstNameInput() {
        practiceFormPage.sendValueFirstNameInput(dataName);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода LastName")
    @Test
    public void checkLastNameInput() {
        practiceFormPage.sendValueLastNameInput(dataLastName);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода Email")
    @Test
    public void checkEmailInput() {
        practiceFormPage.sendValueEmailInput(dataEmail);
    }

    @Tag("RadioButton")
    @DisplayName("Проверка выбора radioButton Gender Male")
    @Test
    public void checkGenderRadioButton() {
        practiceFormPage.clickOnRadioButtonGender(dataGender);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода Mobile Number")
    @Test
    public void checkMobileNumberInput() {
        practiceFormPage.setMobileNumber(dataMobileNumber);
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
        practiceFormPage.sendValueCurrentAddress(dataAddress);
    }

    @Tag("Registration")
    @DisplayName("Проверка успешной регистрации")
    @Test
    public void succsessfulRegistrationTest() {
        practiceFormPage.sendValueFirstNameInput(dataName)
                .sendValueLastNameInput(dataLastName)
                .sendValueEmailInput(dataEmail)
                .setMobileNumber(dataMobileNumber)
                .clickOnRadioButtonGender(dataGender)
                .sendValueCurrentAddress(dataAddress)
                .clickOnHobbiesCheckBox()
                .setBirthDate(dataDay, dataMonth, dataYear);
    }
}
