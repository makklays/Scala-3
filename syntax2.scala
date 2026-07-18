
// Достаточно для запуска программы
@main def hello(): Unit =
  println("Привет, Scala 3!")


// Переменные
val immutableVal = 42      // Неизменяемая (константа)
var mutableVar = "Привет"  // Изменяемая
mutableVar = "Мир"

// Конструкция if-else
val x = 10
if x > 5 then
  println("Больше 5")
else
  println("Меньше или равно 5")

// Цикл for (For-comprehension)
for i <- 1 to 3 do
  println(s"Итерация: $i")

// Цикл while
var count = 0
while count < 3 do
  println(count)
  count += 1

// Обычная функция
def add(a: Int, b: Int): Int = a + b

// Многострочная функция без фигурных скобок
def complexCalc(x: Int): Int =
  val step1 = x * 2
  val step2 = step1 + 5
  step2

// Лямбда-выражение (анонимная функция)
val multiply = (a: Int, b: Int) => a * b

// Простой класс
class User(val name: String, var age: Int)

// Класс с методами и логикой
class Counter:
  private var current = 0
  
  def increment(): Unit = 
    current += 1
    
  def value: Int = current

// Трейты (Интерфейсы)
trait Greetable:
  def greet(): String

// Наследование
class FriendlyUser(name: String, age: Int) extends User(name, age) with Greetable:
  def greet(): String = s"Привет, меня зовут $name"

// Case-класс (автоматически создает equals, hashCode, toString)
case class Point(x: Int, y: Int)

// Простое перечисление (Enum)
enum Color:
  case Red, Green, Blue

// Параметризованное перечисление (замена старым sealed trait)
enum Option[+T]:
  case Some(value: T)
  case None

def process(value: Any): String = value match
  case 0           => "Ноль"
  case s: String   => s"Строка: $s"
  case Point(x, y) => s"Точка с координатами $x, $y"
  case Color.Red   => "Красный цвет"
  case _           => "Что-то другое"

// Определение контекстного значения (данного)
given executionContext: String = "GlobalContext"

// Функция, принимающая контекстный параметр
def runTask(name: String)(using ctx: String): Unit =
  println(s"Выполняю $name в контексте: $ctx")

// Вызов функции (контекст передается автоматически)
@main def app(): Unit =
  runTask("Сканирование")

// Добавляем метод к стандартному типу Int
extension (i: Int)
  def isEven: Boolean = i % 2 == 0

// Использование:
val check = 4.isEven // true


//
