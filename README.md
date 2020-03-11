# stream-sandbox
Training ground for learning Java Stream API

### Setup instructions
Все следующие варианты настройки проекта относятся к IntelliJ Idea.

##### Создать проект с чистого листа 
 - *File -> New -> Project from version control*
 - в диалоге вводим URL репозитория (https://github.com/blr-Oliver/stream-sandbox), можно скопировать из строки браузера или после нажатия на зеленую кнопку **Clone or download**. Путь внутри папки назначения автоматически изменится под название репозитория.
 - убедились, что проект скачался
 - *File -> Project Structure..*
 - на вкладке Project:
    - SDK: 1.8
    - Project language level: 8
    - Указываем **абсолютный** путь к папке, куда IDE буде компилировать. Как правило нечто вроде `/target` или `/build` **внутри** папки проекта
 - на вкладке Modules
    - отмечаем `/src/main/java` как исходники (выделить папку, включить "Sources")
    - отмечаем `/src/main/resources` как ресурсы
 - *Build -> Build Project*
 - находим класс Runner, пробуем запустить:
    - правой кнопкой в дереве -> *Run Runner.main()* **ИЛИ**
    - открываем файл, слева зеленый треугольник