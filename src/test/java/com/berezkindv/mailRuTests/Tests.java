package com.berezkindv.mailRuTests;

import com.berezkindv.mailRuTests.pages.LoginPage;
import com.berezkindv.mailRuTests.pages.components.LoginComponent;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.berezkindv.mailRuTests.TestData.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class Tests extends TestBase {

    // почитать про selenium вэйты
    // пирамида тестирования
    // потренить коллекции
    // почитать про паттерны проектирования
    // состав http протокола, GET не имеет тела, это главное отличие от POST

//    @BeforeAll
//    static void beforeAllMethod() {
//        Configuration.baseUrl = "https://e.mail.ru";
//    }

    LoginPage loginPage = new LoginPage();
    LoginComponent loginComponent = new LoginComponent();

    @Tag("login_test")
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

//        open("https://e.mail.ru/inbox");
//        $("input[name=username]").setValue("johnsmithtests");
//        $(".submit-button-wrap").$(byText("Ввести пароль")).click();
//        $("input[name=password]").setValue("jstestspassword61");
//        $(".submit-button-wrap").$(byText("Войти")).click();
//
//        $("div[data-testid='whiteline-account']").click();
//        $(".ph-sidebar").shouldHave(text("John Smith"));

        sleep(2000);
    }

    @Test
    @Tag("send_mail_test")
    @Tag("all_tests")
    void sendMailTest() {
        loginComponent.mailLogin(userLogin, userPassword);


//        $(".ph-project-promo-close-icon").click();
//        $(".compose-button__wrapper").click();
//        $("div[class='sidebar__header']").$(byText("Написать письмо")).click();

        sleep(5000);
    }
}
