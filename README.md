# RuCountableNouns

Kotlin library for presenting russian nouns with adjectives & numbers in proper form.
Available for jvm and js targets.

Библиотека на Kotlin для представления связок
существительных, прилагательных и числительных
в правильных числовых и падежных формах.

## Usecases / решаемые задачи

+ Printing sum using words in contracts, invoices etc

  Отображение сумм прописью в договорах, счетах и иных документах
  
+ Display the correct word forms for specific number of items
  (number of unread messages, delivered orders and so on)
  
  Отображение правильных склонений в интерфейсах для заведомо
  неизвестного числа элементов (количество непрочитанных
  сообщений, доставленых заказов и так далее)

## Examples /  Примеры кода

```kotlin

/*
First we need to set all forms of the noun (6 case forms * 2 amount forms)
Сначала указываем все формы существительного (6 падежей * 2 числа)
*/
val roubleNoun = Существительное(
    "рубль", "рубля", "рублю", "рубль", "рублём", "рубле",
    "рубли", "рублей", "рублям", "рубли", "рублями", "рублях",
    Род.МУЖСКОЙ
)


/*
Then we get the noun joined with number in specific case form.
Затем получаем существительное и числительное в нужной падежной форме.

Will be printed / будет напечатано:
сто двадцать три миллиона четыреста пятьдесят шесть тысяч семьсот восемьдесят девять рублей

*/
println(
    roubleNoun
        .countedBy(123456789, numberAsText = true)
        .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
)



/*
Also we can add adjective to characterise the noun. We need to specify
6 case forms * (3 gender forms + 1 many-amounted form)

Так же мы можем добавить прилагательное, чтобы охарактеризовать существительное.
Нужно указать 6 падежных форм * (3 родовых формы + 1 форма множественного числа)
*/

val newAdjective = Прилагательное(
    "новый", "нового", "новому", "новый", "новым", "новом",
    "новая", "новой", "новой", "новую", "новой", "новой",
    "новое", "новому", "новому", "новое", "новым", "новом",
    "новые", "новых", "новым", "новые", "новыми", "новых"    
)    
  
val messageNoun = Существительное(
    "сообщение", "сообщения", "сообщению", "сообщение", "сообщением", "сообщении",
    "сообщения", "сообщений", "сообщениям", "сообщения", "сообщениями", "сообщениях",
    Род.СРЕДНИЙ
)    

// 1 новое сообщение
println(
    messageNoun
        .propBy(newAdjective)
        .countedBy(1, numberAsText = false)
        .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
)

// 2 новых сообщения
println(
    messageNoun
        .propBy(newAdjective)
        .countedBy(2, numberAsText = false)
        .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
)

// 5 новых сообщений
println(
    messageNoun
        .propBy(newAdjective)
        .countedBy(5, numberAsText = false)
        .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
)

```

---

Available artifacts / доступные пакеты:
+ `rucountablenouns-jvm` for Kotlin/JVM
+ `rucountablenouns-js` for Kotlin/JS
+ `rucountablenouns-kotlinMultiplatform` for multiplatform modules

## Gradle 

1. Add repository in the `repositories` section of your `build.gradle`:
    ```groovy
    repositories {       
        jcenter()
    }
    ```
2. Add dependency in the `dependencies` section:
    ```groovy
    dependencies {       
        compile "com.aarsenij:rucountablenouns-jvm:1.4.21"
    }
    ```
   
## Multiplatform modules

If you want to use this library in a multiplatform (jvm/js) module,
you should add `rucountablenouns-kotlinMultiplatform` as a dependency to your common module,
and `rucountablenouns-jvm` / `rucountablenouns-js` as a dependency to 
modules, that depend on your common module.

Если вы хотите использовать библиотеку в мультиплатформенном (jvm/js) модуле,
вам нужно добавить `rucountablenouns-kotlinMultiplatform` в зависимости вашего общего модуля,
и `rucountablenouns-jvm` / `rucountablenouns-js` в зависимости модулей,
зависящих от вашего общего модуля.

## Presets

[Here](https://github.com/ShirinkinArseny/rucountablenouns/blob/master/src/commonTest/kotlin/com/aarsenij/rucountablenouns/Words.kt)
you can find some commonly-used words, which have already specified forms,
so you can just copy-paste them.


[Здесь](https://github.com/ShirinkinArseny/rucountablenouns/blob/master/src/commonTest/kotlin/com/aarsenij/rucountablenouns/Words.kt)
вы найдёте некоторые часто используемые слова с уже указанными формами,
которые вы можете просто скопипастить в свой проект.