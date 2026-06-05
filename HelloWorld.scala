
// 1. Объявляем наш case class (аналог data class)
// Значение по умолчанию пишется через знак "="
case class Greet(name: String = "Alex"):
    
    // Функция внутри класса (def вместо fun)
    def say(guestName: String): Unit =
        // Перед строкой ставится "s", чтобы работали переменные через $
        println(s"Hello world! Hello $guestName")

    def say2(guestName: String): Unit =
        println(s"Hello world! Меня зовут $name, а тебя зовут $guestName!")

// 2. Точка входа в программу (аналог функции main)
// В Scala 3 можно использовать аннотацию @main перед функцией
@main def runHelloWorld(): Unit =
    // Создаем объект класса (значения по умолчанию)
    val greeter = Greet()
    
    // Вызываем метод класса
    greeter.say("Ivan") 
    // Выведет: Hello world! Hello Ivan

    // Вариант 1: Используем имя по умолчанию ("Alex")
    val greeter1 = Greet()
    greeter1.say2("Ivan") 
    // Выведет: Hello world! Меня зовут Alex, а тебя зовут Ivan!

    // Вариант 2: Передаем в конструктор свое имя ("Мария")
    val greeter2 = Greet(name = "Мария")
    greeter2.say2("Петр")
    // Выведет: Hello world! Меня зовут Мария, а тебя зовут Петр!


//

