# RuCountableNouns

Kotlin library for presenting russian nouns with adjectives & numbers in proper form.
Available for jvm and js targets.

## Examples

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

Available artifacts:
+ rucountablenouns-jvm for JVM
+ rucountablenouns-js for JS
+ `rucountablenouns` for multiplatform modules

## Maven

1. Add repository in the `repositories` section of your `pom.xml`:
    ```xml
    <repositories>
        <repository>
             <id>rucountablenouns</id>
             <url>https://shirinkinarseny.github.io/rucountablenouns/maven-repo/</url>
        </repository>
    </repositories>
    ```
2. Add dependency in the `dependencies` section:
    ```xml
   <dependencies>
       <dependency>
           <groupId>com.aarsenij</groupId>
           <artifactId>rucountablenouns-jvm</artifactId>
           <version>1.0</version>
       </dependency>
   </dependencies>
    ```

## Gradle 
   _To be done..._     
    
## Download JAR
https://github.com/ShirinkinArseny/rucountablenouns/blob/master/maven-repo/com/aarsenij/rucountablenouns-jvm/1.0/rucountablenouns-jvm-1.0.jar?raw=true
