package org.example.practiceForm.tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.example.practiceForm.pages.PracticeFormPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFromWithFakerDataTest extends TestBase {
    public PracticeFormPage practiceFormPage = new PracticeFormPage();

    Faker faker = new Faker(new Locale("ru"));  //библиотека Faker генерит рандомные данные. И можно указать на каком языке это делать
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String streetAddress = faker.internet().emailAddress();

    @Test
    public void testTest() {
        Configuration.holdBrowserOpen = true;
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода FirstName")
    @Test
    public void checkFirstNameInput() {
        practiceFormPage.sendValueFirstNameInput(firstName);
    }


    @Tag("Input")
    @DisplayName("Проверка поля ввода LastName")
    @Test
    public void checkLastNameInput() {
        open("/automation-practice-form");
        practiceFormPage.sendValueLastNameInput(lastName);
    }

    @Tag("Input")
    @DisplayName("Проверка поля ввода Email")
    @Test
    public void checkEmailInput() {
        open("/automation-practice-form");
        practiceFormPage.sendValueEmailInput(streetAddress);
    }
}
