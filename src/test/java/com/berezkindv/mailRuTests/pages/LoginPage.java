package com.berezkindv.mailRuTests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private static final SelenideElement userLoginInput = $("input[name=username]"),
            submitLoginButton = $(".submit-button-wrap").$(byText("Ввести пароль")),
            userPasswordInput = $("input[name=password]"),
            submitPasswordButton = $(".submit-button-wrap").$(byText("Войти")),
            profileTab = $("div[data-testid='whiteline-account']"),
            profileTabName = $(".ph-sidebar");

    public LoginPage openLoginPage() {
        open("/inbox");
        return this;
    }

    public LoginPage typeUserLogin(String value) {
        userLoginInput.setValue(value);
        return this;
    }

    public LoginPage pushSubmitLoginButton() {
        submitLoginButton.click();
        return this;
    }

    public LoginPage typeUserPassword(String value) {
        userPasswordInput.setValue(value);
        return this;
    }

    public LoginPage pushSubmitPasswordButton() {
        submitPasswordButton.click();
        return this;
    }

    public LoginPage openProfileTab() {
        profileTab.click();
        return this;
    }

    public void assertLogin(String name, String soname) {
        profileTabName.shouldHave(text(name + " " + soname));
    }
}
