package com.berezkindv.mailRuTests;

import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Tests {

    @Test
    void loginTest() {
        open("https://e.mail.ru/inbox");
        $("input[name=username]").setValue("johnsmith");
        $(".submit-button-wrap").$(byText("Ввести пароль")).click();
        $("input[name=password]").setValue("jstestspassword61");
        $(".submit-button-wrap").$(byText("Войти")).click();

        sleep(2000);
    }
}
