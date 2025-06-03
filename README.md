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
<a href="https://www.jetbrains.com/idea/"><img src="Media/logo/IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="Media/logo/JAVA.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="Media/logo/GIT.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="Media/logo/J5.png" width="45" height="45"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="Media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="Media/logo/Selen.png" width="50" height="50"  alt="Selenide"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="Media/logo/ALLURE.png" width="50" height="50"  alt="Allure"/></a>  
<a href="https://www.jenkins.io/"><img src="Media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> 
<a href="https://docs.docker.com//"><img src="Media/logo/Docker.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://docs.docker.com//"><img src="Media/logo/logo-telegram.png" width="50" height="50"  alt="Jenkins"/></a>
</p>

- Тесты написаны на ***Java*** с использованием фреймворка ***Selenide*** в ***IntelliJ IDEA***  
- Сборка проекта осуществляется через ***Gradle***  
- Запуск тестов в контейнерах ***Selenoid***  
- Интеграция с ***Jenkins*** + автоматическая отправка отчетов в ***Telegram***  

---

## 🌐 Web-тесты

### Основные проверки
- ✅ Проверка отображения логотипа компании
- ✅ Проверка отображения слогана компании
- ✅ Проверка наличия корректного текста в разделе "тестирования"
- ✅ Проверка наличия описания стека отдела "тестирования"
- ✅ Проверка отображения блока "Кто мы"

---

## [<img src="Media/logo/Jenkins.svg" width="40" height="40" alt="Jenkins"> Запуск тестов в Jenkins](https://jenkins.autotests.cloud/job/035-Azkeww-hw14/)

### Локальный запуск
```bash
gradle clean simple_test
```


### Удаленный запуск (Jenkins)

```bash
clean simple_test
```



## [<img src="Media/logo/ALLURE.png" width="40" height="40" alt="Allure"> Allure-отчет](https://jenkins.autotests.cloud/job/HH_TEST/8/allure/)

### Главная страница Allure-отчета
<img src="Media/screens/allure_result.png" width="1920">

### Пример отчета о выполнении тестов
Содержит в себе:
- Шаги теста
- Скриншот страницы на последнем шаге
- Page Source
- Логи браузерной консоли
- Видео прогона автотестов

<img src="Media/screens/allure_steps.png"  width="1920" height="" width="800" alt="Allure">


## <img src="Media/logo/logo-telegram.png" width="40" height="40" alt="Telegram"> Уведомления в Telegram

### После завершения сборки, бот, созданный в Telegram, автоматически обрабатывает и отправляет сообщение с результатом

<p align="center">
<img src="Media/screens/tg.png" width="500" alt="Allure">
</p>

## <img src="Media/logo/Selenoid.svg" width="40" height="40" alt="Selenoid"> Видео с запуском тестов в Selenoid

<p align="center">
<img title="Selenoid Video" src="Media/screens/allure.gif/"width="550" height="350"  alt="video">
</p>




