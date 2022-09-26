package com.berezkindv.mailRuTests.pages.components;

import com.berezkindv.mailRuTests.pages.LoginPage;

import static com.berezkindv.mailRuTests.TestData.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginComponent {
    LoginPage loginPage = new LoginPage();
    public void mailLogin(String login, String password) {
        loginPage
                .openLoginPage()
                .typeUserLogin(login)
                .pushSubmitLoginButton()
                .typeUserPassword(password)
                .pushSubmitPasswordButton();

//        open("https://e.mail.ru/inbox");
//        $("input[name=username]").setValue(login);
//        $(".submit-button-wrap").$(byText("Ввести пароль")).click();
//        $("input[name=password]").setValue(password);
//        $(".submit-button-wrap").$(byText("Войти")).click();
//        $("div[data-testid='whiteline-account']").click();
//        $(".ph-sidebar").shouldHave(text("John Smith"));
    }
}
