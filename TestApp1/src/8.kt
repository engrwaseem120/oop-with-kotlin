fun main(args : Array<String>)
{
    //=========== 20 May 2018 =================================

    //HighOrder
    val myArray = intArrayOf(12, 23, 123, 43, 12334, 23)
    val myInt = 12

    //declaring Lambda function
    val myLambdaFunction1: () -> Unit = { println("I am Lambda function") }
    val myLambdaFunction2: () -> Unit = { println("I am new Lambda function") }

    //calling Lambda function
    myLambdaFunction1()

    //High Order function
    //High order functions have the ability to pass a function as an argument or use it as the return value.
    //function passed as argument in High order functions can be used inside high order functions
    highOrderFunction(myInt, myArray, myLambdaFunction1)
    highOrderFunction(myInt, myArray, myLambdaFunction2)

    //Sending Lambda function directly as argument
    highOrderFunction(34, intArrayOf(23, 23, 123)) { println("I am Lambda function sending as argument directly") }

    //Sending Argument based 0Lambda function directly into high order function's argument
    highOrderFunction2 { number -> println("Number : $number")
        number.toString() }


    //Extension Property
    var name = "ABC"
    println("Value of name before calling extension property : $name")
    println("Value of name calling extension property : ${name.stringPrefix}")
    println("Value of name after calling extension property : $name")

    //Extension Method (val) constant property
    var xyz = "XYZ"
    var abc = "ABC"

    var def = 12
    println("Value of def : $def")

    //we can use values in Extension method
    //but we can't change value of object through which extension method is called
    println("Value of def calling Extension method : ${def.myPlus(10)}")
    println("Value of def after calling Extension method : $def")

    //calling extension method through string variable
    xyz.myFunction()

    println("Value of abc : $abc")
    println("Getting value through Extension method after performing action on abc : ${abc.getHalfLength()}")

    //Changing Array Data in Function
    var myarray = intArrayOf(2,3,4,1,5,2,6,8,9,12)

    print("Array values : ")

    for (i in myarray) {
        print(i)
    }

    println()
    println("Altering array inside method and get new array from method")

    //for ((index,value) in myarray.withIndex())
    //array.withIndex set index in index variable and its value in value value variable
    val arrayFun = getAlteredArray(myarray)

    print("New Array values : ")

    for (i in arrayFun) {
        print(i)
    }

    println()
    println("Old array values after altering inside method")

    //getAlteredArray change data of old array as well because old array is used inside method directly
    print("Old Array values : ")

    for (i in myarray) {
        print("$i")
    }

    println()
    println("Old array values using map")
    print("Old Array values : ")

    //map is used to perform certain action on each value of array, but map doesn't not change array values
    for (i in myarray.map { n -> n * 2  }) {
        print("$i")
    }

    println()
    println("Old array after using map")
    print("Old Array values : ")

    for (i in myarray) {
        print("$i")
    }

    println()
    println("Old array using forEach property of Array")
    print("Old Array values : ")

    //forEach property of array is as applying foreach loop on array in C#
    myarray.forEach {
        //it -> default keyword which contains value of array element
        print(it)
    }

    println()

    //Extension Method (var) variable property
    println("Value of varProperty : $varProperty")

    varProperty = "ABC";

    println("Changed Value of varProperty : $varProperty")

    //INFIX Function
    var b = 33

    //calling infix minus(-) function of file 7.kt
    println("Values abs and xyz used by operator minus(-) : ${"abs " -  "xyz"}")

    //calling infix plus(+) function of file 7.kt
    println("Values $b and 10 used by operator plus : ${b plus 10}")

    //calling infix add(+) function
    println("Values $b and 22 used by operator add : ${b add 22}")

    var g = 1
    var h = 2
    var m = "m"
    var n = "n"

    //calling plus(+) function for string variables
    println("Values $m and $n used by operator plus(+) : ${ m + n }")

    //calling plus(+) function for integer variables
    println("Values $g and $h used by operator plus(+) : ${ g + h }")


    //High Order Loop
    val intArrayOf = intArrayOf(223, 23, 23, 123, 13)

    //Lambda function which will multiply passed integer value by 2
    val multiplyOperationFun : (Int) -> Unit = {
        number -> var num = number * 2
        println("Value after performing operation in Lambda function (Multiply by 2) : $num")
    }

    //Lambda function which will add passed integer value by 2
    val plusOperationFun : (Int) -> Unit = { number ->
        var num = number + 2
        println("Value after performing operation in Lambda function (Increased by 2) : $num")
    }

    println("Calling function")

    myFun(intArrayOf, multiplyOperationFun)

    println("Calling function")

    myFun(intArrayOf, plusOperationFun)

    println("Calling function")

    //using Lambda function directly in Function 'myFun' arguments
    myFun(intArrayOf, { number ->
        var num = number - 2
        println("Value after performing operation in Lambda function (Decreased by 2) : $num")
    })

    //initialization of constant function 'myFun' by 'myFun2' function
    val myFun = myFun2(intArrayOf, { number ->
        number / 2
    })

    print("Array Values separted by space : ")

    //printing Array values
    for (i in intArrayOf) {
        print("$i ")
    }

    println()

    //new array received from constant function ''myFun'
    val array = myFun()

    //printing new array values received from function
    print("New Array Values (divided by 2) separated by space : ")

    for (i in array) {
        print("$i ")
    }
}

fun myFun(a: IntArray, operation: (Int) -> Unit) {
    for (i in a) {
        println("Value passed in Lambda function : $i")
        //calling Lambda function 'operator' which is passed in parameter
        operation(i)
    }
}

fun myFun2(a: IntArray, operation: (Int) -> Int): () -> Array<Int> {

    var myArray = Array<Int>(a.size) { 0 }

    for ((index, value) in a.withIndex()) {

        //calling Lambda function 'operator' which is passed in parameter
        val returnValue = operation(value)

        myArray[index] = returnValue
    }

    val retunArrayFun: () -> Array<Int> = { myArray }

    return retunArrayFun
}

infix fun Int.add(a:Int):Int{
    return this + a
}

var varProperty : String = ""
    set(value) {
        field = "pqr $value"
    }
    get() {
        return "$field ghi"
    }

fun getAlteredArray (myarray : IntArray ) : IntArray {
    for ((index,value) in myarray.withIndex()) {
        myarray[index] = value + 2
    }
    return myarray
}

fun String.myFunction() {
    println(this)
}

fun String.getHalfLength() : Int {
    return this.length / 2
}
fun Int.myPlus(abc : Int ) : Int{
    return this + abc
}

val String.stringPrefix:String
    get() {
        return this + " xyz"
    }

//myFunction: () -> Unit (Lambda function)
fun highOrderFunction(a: Int, myIntArray: IntArray, myFunction: () -> Unit ) {
    println("highOrderFunction : Value of Integer parameter 'a' $a")
    println("highOrderFunction : Value of IntegerArray parameter 'myIntArray' $myIntArray")
    println("highOrderFunction : Value of Lambda Function parameter 'myFunction' $myFunction")
    myFunction()
}

//myFunction: (Int) -> String (Lambda function)
fun highOrderFunction2(myFunction: (Int) -> String) {
    myFunction(12)
    myFunction(16)
}