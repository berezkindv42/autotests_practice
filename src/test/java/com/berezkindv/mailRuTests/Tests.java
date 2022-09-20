package com.berezkindv.mailRuTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Tests {

    @Test
    void loginTest() {
        open("https://e.mail.ru/inbox");


    }
}
