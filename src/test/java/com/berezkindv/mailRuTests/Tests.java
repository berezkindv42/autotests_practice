package com.berezkindv.mailRuTests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Tests {

    @Test
    void loginTest() {
        open("https://e.mail.ru/inbox");
        $("input[name=username]").setValue("johnsmithtests");
        $(".submit-button-wrap").$(byText("Ввести пароль")).click();
        $("input[name=password]").setValue("jstestspassword61");
        $(".submit-button-wrap").$(byText("Войти")).click();

        $("div[data-testid='whiteline-account']").click();
        $(".ph-sidebar").shouldHave(text("John Smith"));

        sleep(2000);
    }
}
