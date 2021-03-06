# Приложение для благополучателя из кластера проектов **Цепочка добрых дел**

## Описание кластера
Кластер приложений **Цепочка добрых дел** состоит из пяти элементов:
- Приложение для благополучателя (текущее приложение)
- Приложение для [модератора](https://github.com/Rinchiny/kdc_moderator_app)
- Приложение для [исполнителя](https://github.com/Rinchiny/kdc_assignee_app) 
- Приложение [REST-api](https://github.com/Rinchiny/kdc_rest_api)
- База данных

## Описание приложения благополучателя
Текущее приложение существует для того, чтобы осуществлять отдачу статического контента, который соответствует 
веб-приложению благополучателя, а также предоставлять АПИ для его работы.
Внутри бэкенда происходит взаимодействие с RESTful API для манипулирования (Получения, Создания, Обновления и Удаления) записями в базе данных. 
Структура проекта позволяет вести независимую разработку фронтенда и бэкенда благодаря делению на модули. 
Одновременно с этим, модули связаны таким образом, что при сборке проекта осуществляется сборка и упаковка в единый артефакт обоих модулей, как если бы деления не было.
Основа бэкенд проекта - это Java 11 со Spring Boot на борту, основа фронтенд проекта - JS с Vue 3.
