fun main(args : Array<String>)
{
    //=========== 08 July 2018 =================================

    //INHERITANCE
    //Class can be inherited as
    //a) class Student1() : Human() {}
    //b) class Teacher1 : Human()
    //'open' keyword indicates virtual member which can be overridden in child class
    //'override' keyword indicates overriding parent class's member in child class


    var human11 = Human()

    var student11 : Student1 = Student1()

    var teacher11 : Teacher1 = Teacher1("Teacher1")

    //Parent class's object can be initialized by Child class but
    //Child class's object can not be initialized by Parent class
    var teacher12 : Human = Teacher1("Teacher1")

    var teacher21 : Teacher2 = Teacher2()

    //when Parent Class's Method or property is called through below object
    //then if method or property is override in Child's class
    //then overridden method or property is called else Parent class's method or property is called
    var teacher22 : Human = Teacher2()

    println("Parent Class : Human")
    println("Child Class : Student1, Teacher1, Teacher2")

    println("Human object's name : ${human11.name}")
    println("Student1 object's name : ${student11.name}")
    println("Teacher1 object's name : ${teacher11.name}")
    println("Human object's initialized by Teacher1 class then name : ${teacher12.name}")
    println("Teacher2 object's name : ${teacher21.name}")
    println("Human object's initialized by Teacher2 class then name : ${teacher22.name}")

    //-------------------------------------------------------------

    println()

    var human = Human()
    println("'name' called by 'human' Human class object : ${human.name}")

    var student12 : Human = Student1()
    println("'name' called by 'student12' Human class object initialized by Student1 class : ${student12.name}")

    var teacher23 : Human = Teacher2()
    println("'name' called by 'teacher23' Human class object initialized by Teacher2 class : ${teacher23.name}")

    //'st1' store reference of 'student12' object
    //Reference will store Memory path of object
    var st1 = student12 as Student1
    println("'name' called by 'st1' Human class object initialized by Student1 " +
            "class then casted into Student1 class using 'as' keyword : ${st1.name}")

    //Below casting of Human (Parent) class object initialized with Teacher2 (Child) class
    // to another Student1 (Child) class
    //will raise Runtime Exception not Compile time error
    //var st3 = teacher23 as Student1

    //'st2' store reference of 'st1' object
    var st2 = st1
    println("'name' called by 'st2' initialized by object 'st1' : ${st2.name}")

    //As 'st1' and 'st2' have reference of 'student12'
    //so, object values of 'st1' and 'st2' also changed with below statement
    student12.name = "Kotlin"
    println("'name' of object 'student12' set to '${student12.name}'")
    println("'name' of object 'st1' : '${st1.name}'")
    println("'name' of object 'st2' : '${st2.name}'")

    //------------------------------------------------------------

    println()

    val demoClass1 = demonstrationClass1()

    //can not call 'name' as it is private member of class 'demonstrationClass1'
    //demoClass1.name

    demoClass1.age = "10"
    println("'age' of class demonstrationClass1's object 'demoClass1' : ${demoClass1.age}")
    println("'age' of class demonstrationClass1's object 'demoClass1' received " +
            "from method 'getAge' : ${demoClass1.getAge()}")

    //can not call 'email' as it is protected member of class 'demonstrationClass1'
    //demoClass1.email

    val demoClass21 = demonstrationClass2()

    //can not call 'name' from child class 'demoClass21' object
    //as it is private member of parent class 'demonstrationClass1'
    //demoClass21.name

    demoClass21.age = "20"
    println("'age' of class demonstrationClass2's object 'demoClass21' : ${demoClass21.age}")
    println("'age' of class demonstrationClass2's object 'demoClass21' received " +
            "from method 'getAge' : ${demoClass21.getAge()}")

    //can not call 'email' from child class 'demoClass21' object
    //as it is protected member of parent class 'demonstrationClass1'
    //demoClass21.email
    println("'email' of class demonstrationClass2's object 'demoClass21' received " +
            "from method 'getEmail1' : ${demoClass21.getEmail1()}")

    val demoClass22 = demonstrationClass2("email address 1")

    demoClass22.age = "30"
    println("'age' of class demonstrationClass2's object 'demoClass22' : ${demoClass22.age}")
    println("'age' of class demonstrationClass2's object 'demoClass22' received " +
            "from method 'getAge' : ${demoClass22.getAge()}")
    println("'email' of class demonstrationClass2's object 'demoClass22' received " +
            "from method 'getEmail1' : ${demoClass22.getEmail1()}")

    val demoClass23 = demonstrationClass2("40","email address 2")

    println("'age' of class demonstrationClass2's object 'demoClass23' : ${demoClass23.age}")
    println("'age' of class demonstrationClass2's object 'demoClass23' received " +
            "from method 'getAge' : ${demoClass23.getAge()}")
    println("'email' of class demonstrationClass2's object 'demoClass23' received " +
            "from method 'getEmail1' : ${demoClass23.getEmail1()}")

    //-------------------------------------------

    println()

    //REFERENCE TYPE vs VALUE TYPE

    println("Class is ReferenceType")

    var object1 = ReferenceClass()
    object1.name = "object 1"
    println("'name' of object1 : ${object1.name}")

    var object2 = ReferenceClass()
    object2.name = "object 2"
    println("'name' of object2 : ${object2.name}")

    //we can not use clone in below statement
    var object3= object1

    println("object3 initialized by object1")
    object3.name = "object 3"
    println("'name' of object3 : ${object3.name}")

    println("'name' of object1 : ${object1.name}")
    println("'name' of object2 : ${object2.name}")

    println("Int is ValueType")
    var a : Int = 5
    println(" a = $a")

    var b : Int = a
    println(" b initialized by a : b = $b")

    b = 6
    println("b changed by value $b")

    println("a = $a")

    println("String is ValueType")
    var c : String = "ABC"
    println(" c = $c")

    var d : String = c
    println(" d initialized by c : d = $d")

    d = "d"
    println("d changed by value $d")

    println("c = $c")



    println("Array is ReferenceType")
    var array1= arrayListOf<Int>(1,2,4,43)
    println("array1 : $array1")

    var array2 = array1

    println(" array2 initialized by array1 : array2 = $array2")

    array2.add(3)

    println("array2 after adding new element : $array2")
    println("array1 : $array1")

    //clone method will only copy
    var array3 = array2.clone()

    println("array3 clone by array2 : array3 = $array3")

    array2.add(10)

    println("array2 after adding new element : $array2")
    println("array3 : $array3")
}

class ReferenceClass() {
    var name:String=""
}

private open class demonstrationClass1 {
    private var name = ""
    internal var age = ""
    protected var email = ""

    fun getAge() : String {
        return age
    }
}

private class demonstrationClass2() : demonstrationClass1() {
    constructor( e : String) : this() {
        email = e
    }

    constructor(a : String, e : String) : this() {
        age = a
        email = e
    }

    fun getEmail1() : String {
        return email
    }
}

open class Human {
    open var name : String = "Human"
}

class Student1() : Human() {
    override var name : String = "Student"
}

class Teacher1(name : String) : Human()

class Teacher2 : Human(){
    override var name : String = "Teacher2"
}