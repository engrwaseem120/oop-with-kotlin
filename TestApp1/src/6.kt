fun main(args : Array<String>)
{
    //=========== 06 May 2018 =================================

    //FUNCTION (fun)
    //By default, method ReturnType is VOID (Unit)

    //Types of Function

    //a) Void
    //'Unit' keyword is used for Void Function instead of 'void'
    //Void function will not return any value
    voidFunction()

    //b) ReturnType
    //In Return Type function, it is required to return a value of dataType mentioned in return type of Function
    println("ReturnType FUNCTION returned value : ${returnTypeFunction()}")

    //Types of Function Parameters
    //a) Parameterized Function
    //Give values as Parameter arguments in Function
    //It is required to give parameter when calling function
    parameterizedFunction(1)

    //b) Default Parameter Function
    //It is not required to give parameter when calling function
    //If we don't give value in parameter then value given in parameter declaration will be considered as its default value
    defaultParameterFunction()
    defaultParameterFunction(40)

    //method parameter vararg
    val arrayOf = arrayOf("p", "q", "r", "s", "t")

    //method parameter having declaration vararg instead of var
    //will accept list of arguments as well as array but of declared data type
    varArgsMethodString("a","b",*arrayOf,"c", "d",b = 10)
    varArgsMethodInt(1,89348,49234)

    //Loop for continue
    for(i in 1..5)
    {
        if(i == 3)
        {
            //when value of i is 3, then continue will stop below code execution and
            //send cursor back to for statement line and loop execution continue
            continue
        }

        println("continue Loop value : $i")
    }

    //Loop for break
    for(i in 1..5)
    {
        if(i == 3)
        {
            //when value of i is 3, then break will stop loop execution
            break
        }

        println("break Loop value : $i")
    }

    //Breaking Outer Loop by the condition of Inner Loop by using Label
    name@ for (i in 1..5)
    {
        println("Outer Loop $i")

        for (a in 1..5)
        {
            if (a == 3)
            {
                //this break statement will break not only inner loop
                //but also outer loop
                //because of label @name
                break@name
            }

            println("Inner Loop $a")
        }
    }

    println("After Loop")

    //Loop for return
    for(i in 1..5)
    {
        if(i == 3)
        {
            //when value of i is 3, then return will stop not only loop execution but also below execution of main method
            return
        }

        println("break Loop value : $i")
    }

    //this statement will not execute because above loop's return statement will stop main method execution
    println("After return loop")
}

fun voidFunction()
{
    println("VOID FUNCTION")
}

fun returnTypeFunction() : Int
{
    return 10
}

fun parameterizedFunction(a : Int)
{
    println("Argument value of Parameterized Function is $a")
}

fun defaultParameterFunction(b : Int = 10)
{
    println("Argument value of Default Parameter Function is $b")
}

fun varArgsMethodString(vararg a : String, b :Int)
{
    for (i in a) {

        println("Value of a is $i")
    }

    println("Value of b is $b")
}

fun varArgsMethodInt(vararg c : Int)
{
    for (i in c) {

        println("Value of c is $i")
    }
}