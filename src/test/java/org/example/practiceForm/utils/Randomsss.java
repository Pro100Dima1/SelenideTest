package org.example.practiceForm.utils;

import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class Randomsss {

    public String randomizeString(int count) {
        String generatedString = RandomStringUtils.randomAlphabetic(count);
        return generatedString;
    }
    public String randomizeEmail(int size) {
        String generatedEmail = randomizeString(size) + "@.ru";
        return generatedEmail;
    }
}


