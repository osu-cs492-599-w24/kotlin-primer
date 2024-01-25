import java.io.File

class Student(val id: Int, val name: String, var gpa: Double) {
    fun print() {
        println("GPA for ${name} (${id}): ${gpa}")
    }
}

class Rectangle(var width: Int, var height: Int) {
    val area get() = this.width * this.height
}

class FileReader(val filename: String) {
    val fileContents: String
    init {
        val file = File(filename)
        fileContents = file.readText()
    }
}

fun main () {
    val s = Student(933111111, "Leia Organa", 4.0)

    s.gpa = 4.1
    println("GPA for ${s.name} (${s.id}): ${s.gpa}")
    s.print()

    val r = Rectangle(4, 8)
    println("area of r: ${r.area}")

    r.width = 8
    println("area of r: ${r.area}")

    val reader = FileReader("Classes.kt")
    println("== fileContents: ${reader.fileContents}")
}
