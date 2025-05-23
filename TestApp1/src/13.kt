fun main(args : Array<String>)
{
    //=========== 01 July 2018 =================================

    //INHERITANCE
    //open keyword means can be overridden
    var a = A()
    var b = B()
    var c = C()
    var d = D()

    a.printNameAndEmail()
    println(b.age)
    println(b.name)
    println(c.name)
    b.printNameAndEmail()
    c.printNameAndEmail()
    d.printFatherName()
    d.printFatherName()
    d.printNameAndEmail()

    //-------------------------------
    println()

    //override field in child class
    //field name is overridden in Student17 class
    var person= Person("Kotlin","abc@g.com",19)
    var student= Student17(12,"Kotlin2","abcasds@g.com",55)
    person.printAll()
    student.printAll()

    //-----------------------------------

    println()

    //SecondaryConstructor Inheritance
    //e.g : Machine class
    var delClass = DelegateClass("kotlin", 23,"av@g.com")
    println(delClass.toString())
    var car = Car("corolla",2012,"black","honda")
    println(car.toString())
    var car1 = Car("civic","2018","black","1200","honda",122200 , "car")
    println(car1.toString())
    var machine = Machine("civic",180000,"car","honda")
    println(machine.toString())
}

open class Machine( n : String ) {
    var name = ""
    var cost = 0
    var type = ""
    var manufacturer = "not inserted"

    init {
        name = n
    }

    constructor(n: String, c: Int) : this(n) {
        this.cost = c
    }

    constructor(n: String, c: Int, type: String, manufacturer: String) : this(n, c) {
        this.type = type
        this.manufacturer = manufacturer
    }

    override fun toString(): String {
        return "Machine(name='$name', cost='$cost', type='$type' , manufacturer = $manufacturer)"
    }
}

class Car(name : String, cost : Int, type : String, manufacturer : String) :
        Machine(name,cost,type,manufacturer) {

    var model = ""
    var color = ""
    var hp = ""

    init {
        this.name = name
    }

    constructor( name : String, m : String, color : String, hp: String, manuf : String, cost : Int ,
                 ty : String) : this(name, cost, ty, manuf ) {
        this.color = color
        this.model = m
        this.hp = hp
    }

    override fun toString(): String {
        return "Car(model='$model', color='$color', hp='$hp', name = $name , manufacturer = $manufacturer)"
    }
}

class DelegateClass( name : String ) {
    var name = ""
    var age = 0
    var email = ""

    init {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, email: String) : this(name, age) {
        this.email = email
    }

    override fun toString(): String {
        return "DelegateClass(name='$name', age='$age', email='$email')"
    }
}

open class Person( open var name : String, var email : String , var age : Int) {
    open fun printAll(){
        println("Values passed in Person class's constructor : name = $name , email = $email , age = $age")
    }
}
class Student17(var rollNumber : Int, name : String , email : String , age : Int): Person(name,email, age){
    override var name="Java"
    override fun printAll() {
        println("Values passed in Student17 class's constructor : RollNumber = $rollNumber , name = $name" +
                ", email = $email , age = $age")
    }
}

class D : B() {
    var fatherName=""

    fun printFatherName() {
        println("fatherName is $fatherName")
    }
}

class C : A() {
    var id =233

    fun printId() {
        println("id is $id")
    }
}

open class B : A() {
    var age=10

    fun printAge() {
        println("age is $age")
    }
}

open class A {
    var name = "class A name"
    var email = "class A email"

    init { }

    fun printNameAndEmail() {
        println("name is $name and email is $email")
    }
}