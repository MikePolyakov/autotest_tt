# Автоматизация тестирования Engagement
### Запуск тестов:
- healthCheck
    ```bash
    mvn clean test -D suiteXmlFile=healthCheck.xml
    ```
- SurveyTest (надо добавить номер опроса в Start)
    ```bash
    mvn clean test -D suiteXmlFile=survey.xml
    ```
 
