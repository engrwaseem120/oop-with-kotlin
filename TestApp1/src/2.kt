fun main(args: Array<String>)
{
    //=========== 08 April 2018 =================================

    //For Online KOTLIN language use site : try.kotlinlang.org
    //For Console, use IntelliJ Idea for KOTLIN
    //For KOTLIN, Download JDK (Java Development Kit) and JVM (Java Virtual Machine)

    //Programming Advantages -> Automation, Information Sharing (Facebook), Machine Instructions

    //Interpreter Language -> Syntactically mistake not identified

    //Compile Language -> Syntax (Language Rules), Security check, C++ can access memory address directly

    //KOTLIN converted to ByteCode (JS -> JavaScript) which is compiled by JVM (Java Virtual Machine) into Machine Language

    //JAVA converted to ByteCode (JS -> JavaScript) which is compiled by JVM (Java Virtual Machine) into Machine Language

    //JAVA -> Right Once -> Run Everywhere

    //LINUX, MAC -> ByteCode when code executed through JVM

    //KOTLIN -> Web, Server Side
    //JAVA -> Client, Server Side

    //Interpreter -> Run line by line and executed

    //Variable -> store temporary data/information

    //In KOTLIN, all datatypes are object datatype while in C#, datatypes are Primitive and Object

    //In KOTLIN, when statement is used instead of switch statement

    var age = 10

    when (age)
    {
        10 -> println("age is 10")
        20 -> {
            println("age is 20")
        }
        else -> println("age is not known")
    }

    //KOTLIN Datatypes

    //All below datatypes are Literal

    //Integer (4 bytes in memory)
    var intType : Int = 327483742
    println(intType)

    //Double (8 bytes in memory)
    var doubleType : Double = 10.22
    println(doubleType)

    //Long (8 bytes in memory)
    var longDataType : Long = 1009383749274972336
    println(longDataType)

    //Float (4 bytes in memory)
    var floatDataType : Float = 32.3247f
    println(floatDataType)

    //Short
    var shortDataType : Short = 12342
    println(shortDataType)

    //Byte
    var byteDataType : Byte = 123
    println(byteDataType)

    //Char (2 bytes in memory)
    var charDataType : Char = 'A'
    println(charDataType)

    //String
    var stringDataType : String = "ABC"
    println(stringDataType)

    //Boolean
    var booleanDataType : Boolean = true
    println(booleanDataType)

    //KOTLIN is Type Inference means once datatype of a variable is set then datatype of that variable can not be changed
    var abc = "ABC" //String Datatype
    //abc = 10 -> can not be set to 10 (Integer Datatype)

    //Templating or Formatting
    println("$abc")

    //Datatype Conversion (CASTING)
    var intValue : Int = 10
    println(intValue)

    var stringValue : String = intValue.toString()
    println(stringValue)

    var byteValue : Byte = 100
    println(byteValue)

    var doubleValue : Double = byteValue.toDouble()
    println(doubleValue)

    //Check Datatype
    var intValue1 : Int = 32
    println(intValue1)

    var nullableInt : Int? = 2
    println(nullableInt)

    var nullableInt1 : Int? = null
    println(nullableInt1)

    nullableInt = null
    println(nullableInt)

    //can not add intValue1 and nullableInt because of nullableInt
    //not possible (intValue1 + nullableInt)
    var sum = nullableInt?.plus(intValue1)
    println(sum)

    sum = nullableInt?.plus(nullableInt1?: 0)
    println(sum)

    sum = (nullableInt?:0).plus(nullableInt1?: 0)
    println(sum)

    nullableInt = 2
    sum = nullableInt?.plus(intValue1)
    println(sum)

    nullableInt1 = 3

    sum = nullableInt?.plus(nullableInt1?: 0)
    println(sum)

    sum = (nullableInt?:0).plus(nullableInt1?: 0)
    println(sum)

    //Variable having DataType can change its DataType
    var pqr : Any = 10

    pqr = "PQR"

    pqr = 'R'

    //DATATYPE COMPARISON
    var xyz : Any = 59

    when(xyz)
    {
        is String -> println("$xyz is String")
        is Int -> println("$xyz is Integer")
        else -> println("$xyz is not mentioned DataType")
    }

    xyz = "XYZ"

    when(xyz)
    {
        is String -> println("$xyz is String")
        is Int -> println("$xyz is Integer")
        else -> println("$xyz is not mentioned DataType")
    }

    xyz = 'Z'

    when(xyz)
    {
        is String -> println("$xyz is String")
        is Int -> println("$xyz is Integer")
        else -> println("$xyz is not mentioned DataType")
    }

    //Using Range in WHEN statement
    var stu = 10

    when(stu)
    {
        10,30 -> println("stu is 10 or 30")
        else -> println("stu is not 10 or 30")
    }

    stu = 31

    when(stu)
    {
        !in 10..30 -> println("stu is not in 10 to 30")
        else -> println("stu is in 10 to 30")
    }

    when(stu)
    {
        in 10..50 -> println("stu is in 10 to 50")
        else -> println("stu is not in 10 to 50")
    }

    var jkl : String = "JKL"

    when(jkl)
    {
        "JKL","HELLO" -> println("jkl is JKL or HELLO")
        else -> println("jkl is not JKL or HELLO")
    }

    var rst : String = "RST"
    var fgh : String = "FGH"

    when
    {
        rst in "RST" -> println("rst is RST")
        else -> println("rst is not RST")
    }

    when(fgh)
    {
        "FGH" -> println("fgh is FGH")
        else -> println("fgh is not FGH")
    }

    //WHILE LOOP
    var num = 1

    while(num < 10)
    {
        println("Value of num is $num")
        num++
    }

    //DO-WHILE LOOP
    var loopValue = 1

    do
    {
        println("Value of loopVAlue is $loopValue")
        loopValue++
    }
    while (loopValue < 10)
}