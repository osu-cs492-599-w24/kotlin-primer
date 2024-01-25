fun main() {
  println("Hello, world!")

  var n: Int = 16
  println("== n: $n")

  var k = 32
  // k = 4.25

  var x: Double = 4.25
  x = 4.toDouble()

  x *= 3.14
  // n = k

  val pi = 3.1415
  // pi = 6.125

  var nonNull = "This string can't be null" + " plus another string"
  println("== nonNull.length: ${nonNull.length}")

  var nullable: String? = "This string can be null"
  nullable = null
  val l = nullable?.length ?: 0
  println("== nullable?.length: ${l}")

  if (l > 0) {
    println("nullable is a nonempty string")
  } else {
    println("nullable is an empty string")
  }

  n = 1
  val max = if (n > pi) {
    println("n is greater")
    n
  } else {
    println("pi is greater")
    pi
  }
  println("== max: $max")

  when (l) {
    0 -> println("string is empty")
    in 1..20 -> println("string is short")
    else -> println("string is long")
  }

  val strDescription = when (l) {
    0 -> "string is empty"
    in 1..20 -> "string is short"
    else -> "string is long"
  }
  println("== strDescription: $strDescription")

  val donutsList = listOf("glazed", "fritter", "cake")
  println("== donutsList: $donutsList")

  val mutableDonuts = mutableListOf("glazed", "fritter", "cake")
  println("== mutableDonuts: $mutableDonuts")
  mutableDonuts.add("cream filled")
  println("== mutableDonuts: $mutableDonuts")

  printGreeting("world")
  printGreeting("CS 492/599", "Sup")
  printGreeting(greeting = "Howdy", who = "y'all")

  val twoCubed = powerOf(2, 3)
  val twoTimesTwo = timesTwo(2)

  val functionVal: (Int, Int) -> Int = ::powerOf
  val twoCubed2 = functionVal(2, 3)

  val pets = listOf("cat", "dog", "canary", "fish", "cow")
  val cPets = pets.filter(::startsWithC)
  println("== cPets: $cPets")

  val cPets2 = pets.filter({ str -> str.startsWith('c') })
  println("== cPets2: $cPets2")

  // val squaresList = List(10, { i -> i * i })
  val squaresList = List(10) { it * it }
  println("== squaresList: $squaresList")
}

fun startsWithC(str: String): Boolean {
  return str.startsWith('c')
}

fun printGreeting(who: String, greeting: String = "Hello") {
  println("${greeting}, ${who}")
}

fun powerOf(base: Int, exponent: Int): Int {
  var result = 1
  for (i in exponent downTo 1) result *= base
  return result
}

fun timesTwo(x: Int) = x * 2
