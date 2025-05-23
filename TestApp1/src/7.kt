fun main(args : Array<String>)
{
    //=========== 13 May 2018 =================================

    //Property

    //setting value of property
    //value of property can be set only in 'field'
    name = "DEF"

    //getting value of property
    //value of property can be accessed through 'field'
    println(name)

    //Extension
    //Extension methods and properties which can be used same as toString method
    //Extension methods and properties are called from objects
    //Extension methods and properties can be made for Built-in (String,Int) and Custom classes

    //Extension method
    var abc : String = "ABC"

    //calling extension method
    abc.stringExtensionMethod()

    //println(this) -> this statement will print value of object from which extension method is called
    abc.printThis()

    //Change value of object through extension method
    abc = abc.removeLastChar()
    println("Value of object after changing object's value through Extension method : $abc")

    //Extension property
    var def = "PQR"

    //Value of property can be set (UVW)
    def.extensionProperty = "UVW"

    //but returned value of property is actual value of object (PQR)
    println("Getting value of Extension property : ${def.extensionProperty}")


    //Extension on List
    val integerArray = intArrayOf(11, 2, 42, 5, 2)

    //Printing Array values
    for (i in integerArray) {
        println("Value in integerArray :  $i")
    }

    val swappedIntegerArray = integerArray.swap(0, 1)

    //Printing Array values after swapping in Extension method
    for (i in swappedIntegerArray) {
        println("Value in swppedIntegerArray : $i")
    }


    //INFIX NOTATION
    //Functions marked with the infix keyword can also be called
    //using the infix notation (omitting the dot and the parentheses for the call).
    //Infix functions must satisfy the following requirements:
    //a) They must be member functions or extension functions
    //b) They must have a single parameter
    //c) The parameter must not accept variable number of arguments and must have no default value.
    var a = 12

    println("Value of a : $a")

    //use infix method, but value of 'a' doesn't change
    println("Getting value using infix method : ${a.infixAdd(13)}")
    println("Value of a : $a")

    //using infix method as keyword, but value of 'a' doesn't change
    println("Using infix method as keyword : ${a infixAdd 10}")
    println("Value of a : $a")

    //using infix with Built-in methods

    //Built-in method -> div (for division), but value of 'a' doesn't change
    println("Value using built-in method div(division) : ${a.div(4)}")
    println("Value of a : $a")

    //infix Built-in method (keyword operator can be used with built-in infix method)
    //plus (for division), but value of 'a' doesn't change
    println("Value using built-in infix method plus : ${a.plus(9)}")
    println("Value of a : $a")

    var value1 = "abc"
    var value2 = "def"

    //infix Built-in method (keyword operator can be used with built-in infix method
    //minus (for subtraction), but variables value doesn't change

    //with sign(-)
    println("Value using infix minus method : ${value1 - value2}")
    println("Value1 : $value1 and Value 2 : $value2")

    //with infix method name (minus)
    println("Value using infix -(minus sign) method : ${value2 - value1}")
    println("Value1 : $value1 and Value 2 : $value2")
}

//Property
var name = ""
    get() {
        return "Returned value of Property : $field"
    }
    set(value) {
        field = "$value 00000"
    }

//Extension property
var String.extensionProperty:String
    get() {
        return this
    }
    set(value) {
        println("Setting value of Extension Property : $value")
    }

fun String.stringExtensionMethod()
{
    println("stringExtensionMethod called")
}

fun String.printThis()
{
    println("Value of object : $this")
}

fun String.removeLastChar():String{
    return this.subSequence(0, this.length - 1).toString()
}

fun IntArray.swap(index1: Int, index2: Int): IntArray {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
    return this
}

infix fun Int.infixAdd(b:Int):Int{
    return this + b
}

infix operator fun Int.plus(b:Int):Int{
    return this - b
}

infix operator fun String.minus(b:String):String{
    return this + b
}