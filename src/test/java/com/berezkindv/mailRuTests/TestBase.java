package com.berezkindv.mailRuTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void beforeAllMethod() {
        Configuration.baseUrl = "https://e.mail.ru";
        Configuration.browserSize = "1280x720";
    }

    @AfterEach
    public void afterEach() {
        Selenide.closeWebDriver();
    }
}
