package org.example.practiceForm.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.practiceForm.pages.components.ComponentCalendar;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage {
    ComponentCalendar componentCalendar = new ComponentCalendar();

    private SelenideElement
            firstName = $("#firstName"),
            lastname = $("#lastName"),
            email = $("#userEmail"),
            mobilenumber = $("#userNumber"),
            hobbiesCheckBox = $("#hobbiesWrapper").$(byText("Sports")),
            currentAddress = $("#currentAddress");

    public static void selenideOpen() {
        open("/automation-practice-form");
    }

    public PracticeFormPage sendValueFirstNameInput(String name) {
        firstName.sendKeys(name);
        return this;
    }

    public PracticeFormPage sendValueLastNameInput(String lastName) {
        lastname.sendKeys(lastName);
        return this;
    }

    public PracticeFormPage sendValueEmailInput(String emailVal) {
        email.sendKeys(emailVal);
        return this;
    }

    public PracticeFormPage clickOnRadioButtonGender(String gender) {
        $("#genterWrapper").$(byText(gender)).click();
        return this;
    }

    public PracticeFormPage setMobileNumber(String mobileNumber) {
        mobilenumber.sendKeys(mobileNumber);
        return this;
    }

    public PracticeFormPage clickOnHobbiesCheckBox() {
        hobbiesCheckBox.click();
        return this;
    }

    public PracticeFormPage sendValueCurrentAddress(String address) {
        currentAddress.sendKeys(address);
        return this;
    }

    public PracticeFormPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        componentCalendar.setDate(day, month, year);
        return this;
    }
}
