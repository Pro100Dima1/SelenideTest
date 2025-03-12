package org.example.practiceForm.tests;

import org.example.practiceForm.pages.PracticeFormPage;
import org.example.practiceForm.utils.Randomsss;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class PracticeFromWithRandomDataTest {
    public Randomsss randomsss = new Randomsss();
    public PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Tag("Input")
    @DisplayName("Проверка поля ввода FirstName")
    @Test
    public void checkFirstNameInput() {
        String dataName = randomsss.randomizeString(10);
        practiceFormPage.sendValueFirstNameInput(dataName);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода LastName")
    @Test
    public void checkLastNameInput() {
        String dataLastName = randomsss.randomizeString(10);
        practiceFormPage.sendValueLastNameInput(dataLastName);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода Email")
    @Test
    public void checkEmailInput() {
        String dataEmail = randomsss.randomizeEmail(10);
        practiceFormPage.sendValueEmailInput(dataEmail);
    }
}
//    @Tag("RadioButton")
//    @DisplayName("Проверка выбора radioButton Gender Male")
//    @Test
//    public void checkGenderRadioButton() {
//        practiceFormPage.clickOnRadioButtonGender(dataGender);
//    }
//
//    @Tag("Input")
//    @DisplayName("Проверка поля ввода Mobile Number")
//    @Test
//    public void checkMobileNumberInput() {
//        practiceFormPage.setMobileNumber(dataMobileNumber);
//    }
//
//    @Tag("Date")
//    @DisplayName("Проверка выбора года рождения в Date of Birth")
//    @Test
//    public void checkDateOfBirth() {
//        practiceFormPage.setBirthDate("30", "January", "2025");
//    }
//
//    @Tag("CheckBox")
//    @DisplayName("Проверка нажатия на чекбокс Хобби")
//    @Test
//    public void checkHobbiesCheckBox() {
//        practiceFormPage.clickOnHobbiesCheckBox();
//    }
//
//    @Tag("Input")
//    @DisplayName("Проверка ввода в поле Current Address")
//    @Test
//    public void checkCurrentAddress() {
//        practiceFormPage.sendValueCurrentAddress(dataAddress);
//    }
//
//    @Tag("Registration")
//    @DisplayName("Проверка успешной регистрации")
//    @Test
//    public void succsessfulRegistrationTest() {
//        practiceFormPage.sendValueFirstNameInput(dataName)
//                .sendValueLastNameInput(dataLastName)
//                .sendValueEmailInput(dataEmail)
//                .setMobileNumber(dataMobileNumber)
//                .clickOnRadioButtonGender(dataGender)
//                .sendValueCurrentAddress(dataAddress)
//                .clickOnHobbiesCheckBox()
//                .setBirthDate(dataDay, dataMonth, dataYear);
//    }
//}
