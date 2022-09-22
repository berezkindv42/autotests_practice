package com.berezkindv.mailRuTests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final SelenideElement userLoginInput = $("input[name=username]"),
            submitLoginButton = $(".submit-button-wrap").$(byText("Ввести пароль")),
            userPasswordInput = $("input[name=password]"),
            submitPasswordButton = $(".submit-button-wrap").$(byText("Войти")),
            profileTab = $("div[data-testid='whiteline-account']"),
            profileTabName = $(".ph-sidebar");
}
