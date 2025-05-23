fun main(args : Array<String>)
{
    //=========== 11 June 2018 =================================

    //CLASS and OBJECTS
    var student : Student = Student()

    student.age = 16
    student.name = "Kotlin"
    student.email = "abc@g.com"
    student.fatherName = "Java"

    println("Student name is ${student.name}")
    println("Student email is ${student.email}")
    println("Student age is ${student.age}")
    println("Student's father name is ${student.fatherName}")

    //-------------------------------------------
    println()

    var std1 = Student()
    var std2 = Student()

    std1.name = "java"
    std2.name = "Kotlin"

    println("std1 name is ${std1.name}")
    println("std2 name is ${std2.name}")

    //------------------------------------

    println()

    //CONSTRUCTOR
    //it can be defined with keyword, example : init {}

    var myDemoObject= demoClass ("Kotlin")

    println("Value of class's field 'name' set through constructor parameter : ${myDemoObject.name}")

    //-------------------------------------

    println()

    //Constructor can be defined as
    //constructor( name : String) : this() {}
    var myDemoObject2 = DemoClass1(12)

    var myList=ArrayList<DemoClass1>()

    println("Initializing object 1")
    myList.add(DemoClass1("kotlin","abc@g.com"))
    println("Initializing object 2")
    myList.add(DemoClass1("kotlin1","a@g.com"))
    println("Initializing object 3")
    myList.add(DemoClass1("kotlin2","abc@gmail.com"))
    println("Initializing object 4")
    myList.add(DemoClass1(13))
    println("Initializing object 5")
    myList.add(DemoClass1(50, 80))
    println("Initializing object 6")
    myList.add(DemoClass1(10, "pqr@yahoo.com"))

    println()
    println("Loop on objects added")
    for (i in myList) {
        println("Values in object 1 : name = ${i.name} , email = ${i.email}")
    }
}

class DemoClass1() {
    var name : String = ""
    var email : String = ""

    //Constructor
    constructor( name : String , email : String ) : this() {
        println("Constructor1 with Params String and String and their values : name = $name, email = $email")
        this.name = name
        this.email = email
    }

    constructor( age : Int ) : this() {
        println("Constructor2 with Params Int and their values : age = $age")
    }

    constructor( age1 : Int , age2 : Int ) : this() {
        println("Constructor3 with Params Int and Int and their values : age1 = $age1, age2 = $age2")
    }

    constructor( age1 : Int , email : String ) : this() {
        println("Constructor4 with Params Int and String and their values : age1 = $age1, email = $email")
    }
}

class demoClass( n : String ) {
    var name= n

    //Constructor
    init {
        println("Called Class Constructor")
        println("Value passed in Constructor parameter : $n")
    }
}

class Student {
    var name : String = ""
    var age : Int = 0
    var fatherName : String = ""
    var email : String = ""
    var rollNumber = ""
    lateinit var dob : String
}