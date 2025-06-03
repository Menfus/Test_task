package tests;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import pages.A2SevenPage;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class A2SevenTestCase extends TestBase {
    A2SevenPage a2SevenPage = new A2SevenPage();

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
            a2SevenPage.visibleLogo2();
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
          a2SevenPage.tabListServices()
                  .tabListTesting()
                  .tabListTestingTxt();
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
            a2SevenPage.tablistAutstaffing()
                    .tablistAutstaffingTxt();
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
          a2SevenPage.tabListCompany()
                  .tabListCompanyTxt()
                  .tabListCompanyTxtAboutUs();
        });
    }

    //Оставлен без использования Page Object
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
