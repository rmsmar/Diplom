# Дипломный проект профессии «Тестировщик»

### Документация:

* <code>[План по автоматизации](https://github.com/rmsmar/Diplom/blob/master/docs/Plan.md) </code>

* <code>[Отчет по итогам тестирования](https://github.com/rmsmar/Diplom/blob/master/docs/Report.md) </code>

* <code>[Отчет по итогам автоматизации](https://github.com/rmsmar/Diplom/blob/master/docs/Summary.md) </code>

### Окружение:

- Docker

- IntelliJ IDEA

- Java 11

- Браузер Chrome

### Инструкция по установке:

1. Открыть в Intelij IDEA проект Diplom, предварительно его склонировав.
2. Запустить контейнер, в котором разворачивается база данных:  docker-compose up -d --force-recreate
3. Запустить приложение:
- для базы данных MySQL ввести команду: java -jar artifacts/aqa-shop.jar -Dspring.datasource.url=jdbc:mysql://localhost:3306/app;

- для базы данных PostgreSQL ввести команду: java -jar artifacts/aqa-shop.jar -Dspring.datasource.url=jdbc:postgresql://localhost:5432/postgres.
4. Запустить тесты командой: .\gradlew test
5. Сформировать отчет Allure Report, выполнив команду: ./gradlew allureServe