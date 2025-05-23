import java.util.*

fun main(args: Array<String>)
{
    //=========== 15 April 2018 =================================

    //METHOD
    //In KOTLIN, naming convention for method name is Camel case (e.g : simpleFunction)
    //Method Parameters are constant variables, Method Parameters can not be changed inside method
    //Method Parameters are having 'val' instead of var, by default and we can not change them to 'var'
    //If we don't define ReturnType of method then method's return type is 'void' by default
    //we can not use keyword 'void' for method's return type
    //Method parameter data type is required at the time of declaring method
    simpleFunction()
    functionWithArguments(1,"ABC")
    println("Value is ${functionWithReturnType(4)}")

    //Methods having different Method Definition Implementation
    //This type of method implementation is called EXPRESSIONS
    //Expressions can be used only for methods having return type 'void'
    //If we use 'IF' in Expressions then 'ELSE' is also required
    differentMethodDefinitionImplementation()
    sum(10,20)
    sum(30,15)

    //readLine method is used to take Input from User and this input is in Nullable String form
    // which can be converted into other DataTypes such as Integer, Double
    println("Please enter any data : ")
    var readLineInput : String? = readLine()
    println("Input through readLine is $readLineInput")

    //SCANNER
    //If you want to take Input from User in other DataTypes such as Integer, Double then use SCANNER

    //SCANNER class object
    val scanner = Scanner(System.`in`)

    println("Please enter integer value for Scanner : ")

    //For this input, it is required to get Integer value input from User else InputMismatchException thrown
    var integerValue = scanner.nextInt()

    //For this input, it is required to get Double value input from User else InputMismatchException thrown
    println("Please enter double value for Scanner : ")
    var doubleValue = scanner.nextDouble()
3
    println("Integer Value from Scanner = $integerValue")
    println("Double Value from Scanner = $doubleValue")

    //RANDOM class is used to get random values of different data types such as Integer, Double, Float

    //Random class object
    val random = Random()

    //Random Integer value
    var randomInteger = random.nextInt()
    println("Random Integer Number: $randomInteger")

    //Random Integer value up to 1000 (Send Limit value in nextInt method's Argument)
    //Only bound (limit) is allowed for Integer datatype
    randomInteger = random.nextInt(1000)
    println("Random Integer Number with Limit 1000: $randomInteger")

    //Random Double value
    var randomDouble = random.nextDouble()
    println("Random Double Number: $randomDouble")

    //Random Float value
    var randomFloat = random.nextFloat()
    println("Random Float Number: $randomFloat")

    //CLASS
    //CLASS's argument DataType is required
    //CLASS's argument can be declared without 'var' keyword
    //Class object Initialization
    val personNameObject = PersonVarName("A")
    //can not initialize PersonVarName object without Argument, so
    var personWithoutParameter = PersonWithoutParameter()

    println(personNameObject.name)

    personNameObject.name = "B"

    println(personNameObject.name)

    val personAgeObject = PersonValAge(10)

    //can't change value of 'personAgeObject.age' because age is constant variable
    println(personAgeObject.age)

    //ASSIGNMENT
    //1. Generate a random number
    //2. Take input from user
    //3. Give 3 chances, if its matched ? Exit it
    //4. If its not matched in 3 times, Print "You loose"
    //5. Show option to play again

    println("==========================================")
    println("==========================================")
    println("ASSIGNMENT")
    println("==========================================")
    println("==========================================")
    println("Generate Random Number")

    val randomObject : Random = Random()
    val randomValue : Int = randomObject.nextInt(20)

    println("Random Number Generated")

    val scannerObject = Scanner(System.`in`)

    var enteredValue : Int = 0
    var iteration = 1

    while(iteration <= 3)
    {
        println("CHANCE $iteration")
        print("Please enter an integer number from 1 to 20 : ")
        enteredValue = scannerObject.nextInt()

        if(enteredValue.equals(randomValue))
        {
            println("Your entered value $enteredValue matched with generated Random Number : YOU WIN")
        }
        else if (iteration != 3)
        {
            println("Your entered value does not matched with generated Random Number : TRY AGAIN")
            iteration++
        }
        else
        {
            println("Your entered value does not matched with generated Random Number $randomValue: YOU LOOSE")
            print("PLAY again (Y/N) : ")
            var playAgain : String? =  readLine()

            if(playAgain?.toUpperCase().equals("Y"))
            {
                iteration = 1
            }
            else
            {
                println("GAME OVER")
                break
            }
        }
    }
}

fun simpleFunction()
{
    println("Simple Function")
}

fun functionWithArguments(a : Int, b : String)
{
    println("Argument 1 = $a")
    println("Argument 2 = $b")
}

fun functionWithReturnType(a : Int) : Int
{
    return a
}

fun differentMethodDefinitionImplementation() = println("Method having Different Method Definition Implementation")

fun sum( value1 : Int, value2 : Int) =
        if (value1 > value2) { println("Value1 ($value1) is greater than Value2 ($value2)") }
        else { println("Value1 ($value1) is less than Value2 ($value2)") }

class PersonWithoutParameter()

class PersonVarName(var name : String)

class PersonValAge(val age: Int)

