
// condition 
val hour = 23
val doing = 
  if hour >= 23 || hour < 8 then 
    "sleep"
  else 
    "work"

// loop for
for i <- 0 to 24 do 
  println(s"Hour: $i")

// loop while 
var count = 1
while count < 24 do 
  println(s"Hour: $count")
  count+=1

// for comprehension
val secondHours = 
  for 
    i <- 1 to 24 
    if i % 2 == 0 // Фильтр (Guard)
  yield
    s"Second hour: $i"


// function 
def myFunction(a: Int, b: Int): Int = 
  a + b 

// function 2 
def qvadrat(a: Int, b: Int): Int = 
  val step1 = a * b 
  val step2 = step1 + 2
  step2 

// class 
class User(val name: String, var age: Int)

// case class 
case class Employee(name: String, var age: Int, department: String)

val empl = Employee("Alexander", 26, "IT department")

// pattern matching (switch-case) 
val activity = empl.department match 
  case "IT department" => "Write code"
  case "Managers"      => "Do calls"
  case "QA"            => "Test applications"
  case _               => "Do other work"


// trait 
trait myFirstTrait:
  def firstFun(): String = "First!"
  def secondFun(): String = "Second!"

trait mySecondTrait:
  def thirdFun(): Int 

// extends 
// первый родитель (класс или трейт) всегда подключается через слово extends.Второе и последующие дополнения подключаются через слово with.
// или class myClass extends myFirstTrait with mySecondTrait:
class myClass extends myFirstTrait, mySecondTrait:
  override def secondFun(): String = "Third!" 
  def thirdFun(): Int = 3


//
