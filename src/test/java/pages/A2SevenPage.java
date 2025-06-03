package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class A2SevenPage {
    private SelenideElement visibleLogo = $(by("src", "https://a2seven.ru/wp-content/themes/assembling/static/images/logo.svg")),
            tabListServices = $$("li a span").findBy(text("Услуги")),
            tabListTesting = $$("ul li a").findBy(text("Тестирование")),
            tabListTestingTxt = $(".page-description"),
            tablistAutstaffing = $$("li a span").findBy(text("Аутстаффинг")),
            tablistAutstaffingTxt = $("#allrecords"),
            tabListCompany = $$("li a span").findBy(text("Компания")),
            tabListCompanyTxt =  $$("ul li a").findBy(text("О нас")),
            tabListCompanyTxtAboutUs = $(".page-title");



    public A2SevenPage visibleLogo2() {
        visibleLogo.should(visible);
        return this;
    }

    public A2SevenPage tabListServices() {
        tabListServices.hover();
        return this;
    }

    public A2SevenPage tabListTesting() {
        tabListTesting.click();
        return this;
    }

    public A2SevenPage tabListTestingTxt() {
        tabListTestingTxt.shouldHave(text("Проводим различные виды тестирования. Находим слабые места в вашем продукте и помогаем снизить риски, связанные с качеством и безопасностью программного обеспечения"));
        return this;
    }

    public A2SevenPage tablistAutstaffing() {
        tablistAutstaffing.click();
        return this;
    }

    public A2SevenPage tablistAutstaffingTxt() {
        tablistAutstaffingTxt.shouldHave(text("Devtools, Postman, PostgeSQL, Qase, CypressJS, Jmeter"));
        return this;
    }

    public A2SevenPage tabListCompany(){
        tabListCompany.hover();
        return this;
    }

    public A2SevenPage tabListCompanyTxt(){
        tabListCompanyTxt.click();
        return this;
    }

    public A2SevenPage tabListCompanyTxtAboutUs(){
        tabListCompanyTxtAboutUs.should(visible).shouldHave(text("Кто мы"));
        return this;
    }
}


