package com.berezkindv.mailRuTests;

import com.berezkindv.mailRuTests.pages.LoginPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.berezkindv.mailRuTests.TestData.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Tests extends TestBase {

//    @BeforeAll
//    static void beforeAllMethod() {
//        Configuration.baseUrl = "https://e.mail.ru";
//    }

    LoginPage loginPage = new LoginPage();

    @Tag("login")
    @Tag("all_tests")
    @Test
    void loginTest() {
        loginPage
                .openLoginPage()
                .typeUserLogin(userLogin)
                .pushSubmitLoginButton()
                .typeUserPassword(userPassword)
                .pushSubmitPasswordButton()
                .openProfileTab()
                .assertLogin(userName, userSoname);

//        open("/inbox");
//        $("input[name=username]").setValue("johnsmithtests");
//        $(".submit-button-wrap").$(byText("Ввести пароль")).click();
//        $("input[name=password]").setValue("jstestspassword61");
//        $(".submit-button-wrap").$(byText("Войти")).click();
//
//        $("div[data-testid='whiteline-account']").click();
//        $(".ph-sidebar").shouldHave(text("John Smith"));

        sleep(2000);
    }
}
