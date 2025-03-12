package org.example.practiceForm.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Fakerr {

    public String fakerData(){
        Faker faker = new Faker(new Locale("ru"));
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();

        String streetAddress = faker.internet().emailAddress();

        return faker.toString();
    }
}
