<p align="center">
  <a href="https://a2seven.ru/" target="_blank">
    <img src="Media/logo/logo_A27.svg" width="200" alt="LoyLabs Logo">
  </a>
</p>

# Проект по автоматизации тестовых сценариев для сайта компании [A2SEVEN](https://a2seven.ru/)

## Содержание
- [Технологический стек](#-технологический-стек)
- [Web-тесты](#-web-тесты)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Allure-отчет](#-allure-отчет)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео с запуском тестов в Selenoid](#-видео-с-запуском-тестов-в-selenoid)

## 💻 Технологический стек

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

- Тесты написаны на **Java** с использованием фреймворка **Selenide** в **IntelliJ IDEA**  
- Сборка проекта осуществляется через **Gradle**  
- Запуск тестов в контейнерах **Selenoid**  
- Интеграция с **Jenkins** + автоматическая отправка отчетов в **Telegram**  

---

## 🌐 Web-тесты

### Основные проверки
- ✅ Проверка отображения логотипа компании"
- ✅ Открываем страницу Кейсы и отображается заголовок Кейсы
- ✅ Открываем страницу Новости и видим заголовок Новости
- ✅ Открываем страницу Карьера и проверяем наличие вакансий
- ✅ Открываем страницу Контакты и отображается заголовок Контакты

---

## [<img src="media/logo/Jenkins.svg" width="40" height="40" alt="Jenkins"> Запуск тестов в Jenkins](https://jenkins.autotests.cloud/job/035-Azkeww-hw14/)

### Локальный запуск
```bash
gradle clean loylabs_test
```


### Удаленный запуск (Jenkins)

```bash
clean loylabs_test
"-Dselenoid_host=${SELENOID_HOST}"
-Dselenoid_login=${SELENOID_LOGIN}
-Dselenoid_password=${SELENOID_PASSWORD}
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DscreenResolution=${SCREEN_RESOLUTION}"
```



## [<img src="media/logo/Allure_Report.svg" width="40" height="40" alt="Allure"> Allure-отчет](https://jenkins.autotests.cloud/job/035-Azkeww-hw14/9/allure/)

### Главная страница Allure-отчета
<img src="media/screens/allure_report_1.png" width="800" alt="Allure">

### Пример отчета о выполнении тестов
Содержит в себе:
- Шаги теста
- Скриншот страницы на последнем шаге
- Page Source
- Логи браузерной консоли
- Видео прогона автотестов
<img src="media/screens/allure_report_2.png" width="800" alt="Allure">


## <img src="media/logo/Telegram.svg" width="40" height="40" alt="Telegram"> Уведомления в Telegram

### После завершения сборки, бот, созданный в Telegram, автоматически обрабатывает и отправляет сообщение с результатом

<p align="center">
<img src="media/screens/tg_notification.png" width="600" alt="Allure">
</p>

## <img src="media/logo/Selenoid.svg" width="40" height="40" alt="Selenoid"> Видео с запуском тестов в Selenoid

<p align="center">
  <img src="media/screens/selenoid.gif" width="600" alt="Selenoid Demo">
</p>




