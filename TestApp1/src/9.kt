fun main(args : Array<String>)
{
    //=========== 27 May 2018 =================================

    //LAMBDA function
    println("Calling funtion")

    mFunc(8, { println("Printing argument value of Lambda function : $it") })

    val myVar = "20"

    //Lamda function
    val myLambda: () -> Unit = { println("Lambda Function without Parameters") }

    println("Value of myVar : $myVar")

    println("Calling Lambda function")

    myLambda.invoke()

    //PARAMETERIZED Lambda function

    //One Parameter Lambda function
    val parameterizedLambda : ( a : Int ) -> Unit = { s -> println("Value($s) passed in One Parameter Lambda function") }

    println("Calling One Parameter Lambda function")

    parameterizedLambda(10)

    //Multi Parameter Lambda function
    val multiParameterLambda = { a: Int, b: String, c: Double ->
        println("Values passed in Multi Parameter Lambda function : a = $a , b = $b and c = $c")
    }

    multiParameterLambda(12, "ABCD", 10.0)

    //Multi Parameter Lambda function with ReturnType
    val returnTypeLambda1 : (Int, String, Double) -> String = { a, b, c ->
        println("Values passed in ReturnType Multi Parameter Lambda function : a = $a , b = $b and c = $c")
        val d = a + c
        println("Value of d (Sum of a and c) : $d")
        b
    }

    val returnedValue = returnTypeLambda1(12, "DEF", 10.1)
    println("Value returned from ReturnType Lambda function : $returnedValue")

    //One Parameter Lambda function with ReturnType
    val oneParamReturnTypeLambda : ( a : Int ) -> Int = {
        println("Parameter value ($it) in One Parameter ReturnType Lambda function increased by 222 which results : ${it+222}")

        //it is required else error will be raised
        it+222
    }

    //ReturnType Lambda function called as void function
    oneParamReturnTypeLambda(1111)

    //HIGH ORDER FUNCTION
    //A higher-order function is a function that takes functions as parameters or returns a function.
    //'it' default name of function integer parameter

    //High Order Function for Array
    funcForArray(intArrayOf(1,2,3,4), {
        println("Array Value ($it) used in Lambda function increased by 2 : ${it + 2}")
    })

    println()

    funcForArray(intArrayOf(1,2,3,4),{
        println("Array Value ($it) used in Lambda function decreased by 2 : ${it - 2}")
    })

    println()

    funcForArray(intArrayOf(1,2,3,4),{
        println("Array Value ($it) used in Lambda function multiplied by 2 : ${it * 2}")
    })

    //HIGH ORDER FUNCTION
    highOrderFunction3 ( { println("Lambda function passed in Parameter of High Order Funtion") })

    highOrderFunction4 ( { "ABC" } )

    highOrderFunction5 { it.toString() }
}

fun highOrderFunction3( fName : () -> Unit ) {
    fName()
}

fun highOrderFunction4( fName : () -> String ) {
    println("Printing value passed by Lambda function in High Order function : ${fName()}")
}

fun highOrderFunction5 ( fName : ( a : Int ) -> String ) {
    println("Printing integer value in High Order function recevied from Lambda function passed as parameter : ${fName(100)}")
}

fun funcForArray ( array : IntArray , function: (Int) -> Unit ) {
    for (i in array) {
        function(i)
    }
}

fun mFunc(a : Int , myfunc : ( b : Int ) -> Unit) {
    println("Printing argument value of function : $a")
    myfunc(a)
}