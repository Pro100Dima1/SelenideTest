package org.example.practiceForm.tests;

import org.example.practiceForm.pages.PracticeFormPage;
import org.example.practiceForm.utils.Randomsss;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class PracticeFromWithFakerDataTest {
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
