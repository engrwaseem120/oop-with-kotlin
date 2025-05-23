fun main(args : Array<String>)
{
    //=========== 24 June 2018 =================================

    //CLASS and OBJECT
    var student1 : Student12 = Student12()

    println("student1 object field 'name' value before setting its value : ${student1.name}")
    student1.name="Kotlin Object"
    println("student1 object field 'name' value after setting its value : ${student1.name}")

    //---------------------------------

    println()

    var student2 = Student14("java","a@g.c0m",1)
    println("student2 object's field 'name' value : ${student2.name}")
    println("student2 object's field 'email' value : ${student2.email}")
    println("student2 object's field 'age' value : ${student2.age}")

    println()

    var student3 = Student13()
    println("student3 object's field 'name' value : ${student3.name}")
    println("student3 object's field 'email' value : ${student3.email}")
    println("student3 object's field 'age' value : ${student3.age}")

    println()

    var student4 = Student15("Kotlin", 12,"k@g.com", 12312)
    println("student4 object's field 'name' value ${student4.name}")
    println("student4 object's field 'email' value ${student4.email}")
    println("student4 object's field 'age' value ${student4.age}")
    println("student4 object's field 'id' value ${student4.id}")

    println()

    //PRIMARY CONSTRUCTOR
    //Primary constructor -> init { }
    //a class can be defined as
    //e.g : class Student16(var name: String, var age: Int, var email: String, var id: Int)
    //here name, age, email, id will be the fields of class Student16

    var student5 = Student16("Kotlin2", 122,"k2@g.com", 123122)
    println("student5 object's field 'name' value ${student5.name}")
    println("student5 object's field 'email' value ${student5.email}")
    println("student5 object's field 'age' value ${student5.age}")
    println("student5 object's field 'id' value ${student5.id}")

    println()
    //SECONDARY CONSTRUCTOR
    //Cannot create same argument constructor in a class
    //Secondary Constructor -> constructor(name: String, email: String, age: Int) : this(name) { }
    var t = Teacher("Kotlin")
    println("t object's values : ${t.toString()}")

    println()

    var t2 = Teacher("java", "e@g.com")
    println("t2 object's values : ${t2.toString()}")

    println()

    var t3 = Teacher("c#", "j@c.com", 19)
    println("t3 object's values : ${t3.toString()}")

    //calling methods through objects
    println()

    var teacher1 : Teacher12=Teacher12()
    var teacher2 : Teacher12 = Teacher12()
    teacher1.name="Java"
    teacher1.email="J@email.com"
    teacher1.age=19
    teacher2.name="Java2"
    teacher2.email="Jabc@emaaail.com"
    teacher2.age=29

    println("Calling teacher1 object's printName method")
    teacher1.printName()
    println("Calling teacher2 object's printName method")
    teacher2.printName()

    println("Calling teacher1 object's printEmail method")
    teacher1.printEmail()
    println("Calling teacher2 object's printEmail method")
    teacher2.printEmail()

    println("Calling teacher1 object's printAge method")
    teacher1.printAge()
    println("Calling teacher2 object's printAge method")
    teacher2.printAge()
}

class Teacher12 {
    var name : String = ""
    var email : String = ""
    var age = 0

    fun printName(){
        println("Name of Teacher is $name")
    }

    fun printEmail(){
        println("Email of Teacher is $email")
    }

    fun printAge(){
        println("Age of Teacher is $age")
    }
}

class Teacher ( name : String) {
    var name: String = ""
    var email: String = ""
    var age = 0

    init {
        this.name = name
    }

    constructor(name: String, email: String) : this(name) {
        this.email = email
    }

    constructor(name: String, email: String, age: Int) : this(name) {
        this.email = email
        this.age = age
    }

    //Cannot create same argument constructor
//    constructor(name: String, email: String, age: Int) : this(name) {
//        this.email = email
//        this.age = age
//    }

    override fun toString(): String {
        return "Teacher(name='$name', email='$email', age=$age)"
    }
}

class Student15(n: String, a: Int, e: String, i: Int) {
    var name: String
    var email: String
    var id: Int
    var age: Int

    init {
        name = n
        email = e
        id = i
        age = a
    }
}

class Student16(var name: String, var age: Int, var email: String, var id: Int)

class Student14 ( name : String , e : String , a : Int ) {
    var name : String = ""
    var email : String = ""
    var age : Int = 1

    init {
        this.name = name
        this.email = e
        this.age = a
    }
}

class Student13 {
    var name : String = ""
    var email : String = ""
    var age : Int

    init {
        name = "kotlin"
        email = "k@g.com"
        age = 10
    }
}

private class Student12 {
    var name : String = ""
    var email : String = ""
    var age : Int = 0
}