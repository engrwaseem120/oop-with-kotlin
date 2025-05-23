fun main(args: Array<String>)
{
    //=========== 01 April 2018 =================================

    //Extension of Kotlin class (kt)

    //how to declare variable in Kotlin

    //var keyword is used to declare variable
    var abc: String = "ABC"
    var def: Int = 1
    var mno = "MNO"

    //can not declare variable with name as '1jkl'

    abc = "DEF"

    //Semi-Colon is not required at the end of statement

    //val keyword is used to declare constant variable and its value can not be changed
    val ghi:String = "GHI"

    //to print statement
    print("HELLO WORLD")

    //to print statement and send cursor to new line
    print("YES")
    println("NO")

    //IF-ELSE Condition
    if(def > 10)
    {
        println("def is greater than 10")
    }
    else if(def == 10)
    {
        println("def is equal to 10")
    }
    else
    {
        println("def is less than 10")
    }

    //Comparision operators
    var a = 10
    var b = 20

    println(a == b)
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a != b)

    //Logical Operators
    println(a > 10 && b < 20)
    println(a > 10 || b < 20)

    //Loop

    //FOR Loop
    for(i in 1..10)
    {
        println(i)
    }

    var loopLength = 20

    for(j in 1..loopLength)
    {
        println("Value of j is " + j)
    }

    for(k in 1 until loopLength)
    {
        println("Value of j is $k")
    }

    for(m in 10 downTo 1)
    {
        println("Value of j is $m")
    }

    for(n in 1..10 step 2)
    {
        println("Value of j is $n")
    }

    for(o in 10 downTo 1 step 2)
    {
        println("Value of o is $o")
    }

    //can not use step as 'step -1'
    for(p in loopLength downTo 1 step 2)
    {
        println("Value of p is $p")
    }

    //User Input
    print("Enter your Name : ")

    var name = readLine()

    println("You Enter Name : $name")

    //Parsing Variable
    print("Enter Integer Value : ")

    var integerValue = readLine()

    //!! means non-null
    var sum = integerValue!!.toInt() + 5

    print("Sum value is $sum")

    //If value is null
    var nullValue : String? = null
    //!! throw exception KotlinNullPointerException
    print(nullValue!!.length)
}