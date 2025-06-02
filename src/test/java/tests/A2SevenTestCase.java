package tests;


import helpers.Attach;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static java.awt.SystemColor.text;

@Tag("simple")
public class A2SevenTestCase extends TestBase {

    @Feature("Логотип компании А2Seven")
    @Story("Наличие корректного логотипа")
    @Owner("Menfus")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка наличия корректного логотипа компании А2Seven")
    @Test
    void CheckingForALogo() {
        step("Открываем сайт", () -> {
            open(baseUrl);
        });
        step("Проверяем наличие логотипа компании в хедере сайта", () -> {
            $(by("src", "https://a2seven.ru/wp-content/themes/assembling/static/images/logo.svg")).should(visible);
        });
    }


    @Feature("Tab в хедере -> Услуги -> Блок тестирования")
    @Story("Наличие корректного текста")
    @Owner("Menfus")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка наличия корректного текста в разделе тестирования")
    @Test
    void CheckingForTextTabTesting() {
        step("Открываем сайт", () -> {
            open(baseUrl);
        });
        step("Проверка наличия корректного текста в разделе тестирования", () -> {
            //$(byTagAndText("span", "Услуги")).hover();
            $$("li a span").findBy(text("Услуги")).hover();
            $$("ul li a").findBy(text("Тестирование")).click();
            $(".page-description").shouldHave(text("Проводим различные виды тестирования. Находим слабые места в вашем продукте и помогаем снизить риски, связанные с качеством и безопасностью программного обеспечения"));
        });
    }


    @Feature("Tab в хедере -> Аутстаффинг -> Блок тестирования -> Стек")
    @Story("Наличие корректного описания стека отдела тестирования")
    @Owner("Menfus")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка наличия описания стека отдела тестирования")
    @Test
    void CheckingForToolTesting() {
        step("Открываем сайт", () -> {
            open(baseUrl);
        });
        step("Проверка наличия описания стека отдела тестирования", () -> {
            $$("li a span").findBy(text("Аутстаффинг")).click();
            $("#allrecords").shouldHave(text("Devtools, Postman, PostgeSQL, Qase, CypressJS, Jmeter"));
        });
    }


    @Feature("Tab в хедере -> Компания -> О нас -> Описание компании")
    @Story("Наличие отображения блока Кто мы")
    @Owner("Menfus")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка отображения блока Кто мы")
    @Test
    void CheckingForDescriptionCompany() {
        step("Открываем сайт", () -> {
            open(baseUrl);
        });
        step("Проверка отображения блока Кто мы", () -> {
            $$("li a span").findBy(text("Компания")).hover();
            $$("ul li a").findBy(text("О нас")).click();
            $(".page-title").should(visible).shouldHave(text("Кто мы"));
        });
    }
        @Feature("Tab в хедере -> Направления -> AgroTech -> Описание компании")
        @Story("Наличие слогана")
        @Owner("Menfus")
        @Severity(SeverityLevel.BLOCKER)
        @DisplayName("Проверка отображения слогана")
        @Test
        void CheckingForAgroTechSlogan() {
            step("Открываем сайт", () -> {
                open(baseUrl);
            });
            step("Проверка отображения слогана", () -> {
                $$("li a span").findBy(text("Направления")).hover();
                $$("ul li a").findBy(text("AgroTech")).click();
                $(by("field","title")).should(visible).shouldHave(text("Повышаем эффективность и улучшаем производительность"));
            });
        }
    }
