package org.example.practiceForm.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.practiceForm.pages.components.ComponentCalendar;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormPage {
    ComponentCalendar componentCalendar = new ComponentCalendar();

    private SelenideElement
            firstName =  $("#firstName"),
            lastname =  $("#lastName");

    public static void selenideOpen() {
        open("/automation-practice-form");
    }

    public PracticeFormPage sendValueFirstNameInput(String name) {
       firstName.sendKeys(name);
       return this;
    }

    public PracticeFormPage sendValueLastNameInput(String lastName) {
        lastname.isDisplayed();
        lastname.sendKeys(lastName);
        return this;
    }

    public PracticeFormPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        componentCalendar.setDate(day, month, year);
        return this;
    }

}
