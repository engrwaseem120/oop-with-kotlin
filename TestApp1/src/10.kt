fun main(args : Array<String>)
{
    //=========== 03 June 2018 =================================

    //HIGH ORDER FUNCTION
    println("Calling High Order Function whose Lambda function have no implementation in body")

    highOrderFunction10( { } )

    println("Calling High Order Function")

    highOrderFunction10{ println("Lambda Funtion 1") }

    println("Calling High Order Function")

    highOrderFunction11(12,21, { println("Lambda Function 2") })

    //highOrderFunction12() return reference of Lambda function
    //highOrderFunction13() returns a String
    val returnedValue = highOrderFunction13(highOrderFunction12())
    println("Returned value : $returnedValue")


    var lambdaFunction : ( Int , Int ) -> Int = { a,b ->
        println("Value in Lambda function parameter a : $a")
        println("Value in Lambda function parameter b : $b")
        var c=a+b;
        c
    }

    println("Calling Lambda function")
    var returnValue= lambdaFunction(2,3)
    println("Value received from Lambda function : $returnValue")

    println("Calling Lambda function")
    println("Value received from Lambda function : ${lambdaFunction(5,6)}")
    highOrderFunction14(10,lambdaFunction)

    //sending Lambda function directly in function argument
    highOrderFunction14(22, { x,y -> x-y })

    val function15Reference = function15()
    val lambdaFunctionReference = lambdaFunction16()
    println("Calling normal function through Reference variable")
    println("Value returned from Reference variable of normal function : $function15Reference")
    println("Calling Lambda function through Reference variable")
    lambdaFunctionReference()

    //Lambda Function
    val f : ( a : Int ) -> Unit = {
        println("Lambda Function 1")
        println("Value received in parameter of Lambda Function : $it")
        println("Value received in parameter of Lambda Function increased by 10 : ${it + 10}")
    }

    var intVariable = 10

    println("Calling High Order function")

    highOrderFunction17(intVariable , f)

    println("Calling High Order function")

    highOrderFunction17(10,{
        println("Lambda Function 2")
        println("Value received in parameter of Lambda Function : $it")
        println("Value received in parameter of Lambda Function increased by 30 : ${it + 30}")
    })

    //ODD function
    fun isOdd(x: Int) = x % 2 != 0

    var myList = listOf(1,2,3,4,5,6,7,8,9)

    print("Values in Array :")

    myList.forEach {
        print(" $it")
    }

    println()

    //filter function
    val filter = myList.filter(::isOdd)

    print("Odd Values in Array :")

    filter.forEach {
        print(" $it")
    }

    println()
    println()

    highOrderFunction18 {
        println("Value of Integer by which Extension Lamda is called : $this")
        val sum = this.plus(19)
        println("Value of Integer increased by 19 by which Extension Lamda is called : $sum")
    }

    highOrderFunction19 { b : String ->
        println("Value received in Lambda function parameter : $b")
        println("Value of Integer by which Extension Lamda is called : $this")
        val sum = this.plus(25)
        println("Value of Integer increased by 25 by which Extension Lamda is called : $sum")
    }
}

fun highOrderFunction19(fName: Int.(String) -> Unit) {
    println("Calling Integer Extension Lambda function passed in High Oder function parameter")
    fName(20, "Param Value 1")
    println("Calling Integer Extension Lambda function passed in High Oder function parameter")
    18.fName("Param Value 2")
}

fun highOrderFunction18( fName : Int.() -> Unit ) {
    println("Calling Integer Extension Lambda function passed in High Oder function parameter")
    fName(12)
    println("Calling Integer Extension Lambda function passed in High Oder function parameter")
    2.fName()
}

fun highOrderFunction17( a : Int , fName : (Int) -> Unit ) {
    println("Value received in High Order function : $a")
    println("Calling Lambda function received in HighOrder function parameter")
    fName(a + 10)
}

fun function15() : Int {
    return 3
}

fun lambdaFunction16() : () -> Unit {
    val f : () -> Unit = {
        println("Lamda function")
    }

    return f
}

fun highOrderFunction14( a : Int , function : ( Int , Int ) -> Int ) {
    println("Calling Lambda function in High Order function")
    var value= function(a,a)
    println("Value received from Lambda function in High Order function : $value")
}

//highOrderFunction12 return a refrence to Lambda function
fun highOrderFunction12() : (Int, Int) -> Int {
    //returns only a refernce of lambda it get executed
    return { a, b ->
        println("Value passed in function parameter 'a' : $a")
        println("Value passed in function parameter 'b' : $b")
        //Lambda function Return
        a + b
    }
}
//highOrderFunction13 receive Lambda function and returns a String
fun highOrderFunction13(lambdaFunction : (Int, Int) -> Int): String {
    //lambdaFunction(2,10) return addition of two variables
    var returnVAlue = lambdaFunction(2, 10)
    return returnVAlue.toString()
}

fun highOrderFunction10 ( functionName : () -> Unit ) {
    println("Calling Lambda Function in High Order Function")
    functionName()
}

fun  highOrderFunction11( a : Int , b:Int , functionName : () -> Unit ) {
    println("Parameter 'a' value passed in High Order function parameter : $a")
    println("Parameter 'b' value passed in High Order function parameter : $b")
    println("Calling Lambda Function in High Order Function")
    functionName()
}