fun main(args : Array<String>)
{
    //=========== 29 April 2018 =================================

    //LABEL
    //Label is used to move Execution at certain statement during Process
    //here label@ shows that execution will start from here when send by @label
    //name label is not specific
    //any word can be used e.g : loop@ - @loop

    //with 'continue'
    label@ for (a in 1..5)
    {
        println("first loop $a")

        for (b in 1..5){

            println(" before inner loop $b")

            if (b == 2){
                //@label will send execution to label@
                //all below statements are ignored
                continue@label
            }

            println(" after inner loop $b")
        }

        println("outer body of loop $a")
    }

    //with 'break'
    //break will stop first loop as well
    loop@ for (a in 1..5)
    {
        println("first loop $a")

        for (b in 1..5){

            println(" before inner loop $b")

            if (b == 2){
                //@label will send execution to label@
                //all below statements are ignored
                break@loop
            }

            println(" after inner loop $b")
        }

        println("outer body of loop $a")
    }

    //Type 1
    var integerArray : IntArray = intArrayOf(1,2,3,4,5)

    //array reading with index
    for((index, value) in integerArray.withIndex())
    {
        println("Value at Index $index is $value")
    }

    //Type 2
    var integerArray1 : Array<Int> = arrayOf(1,2,3,4,5)

    for((index, value) in integerArray1.withIndex())
    {
        println("Value at Index $index is $value")
    }

    //Type 3
    //init set the default value if index value is not set
    var myArray = Array(10,init = {100})

    //set value at 0 index
    myArray.set(0,90)

    //set value at 5 index
    myArray.set(5,20)

    for (a in myArray){
        println("array value $a")
    }

    for ((a,v) in myArray.withIndex()){
        println("index $a  value $v")
    }

    //STRINGS
    var s:String ="kotlin"

    //\t used for Tab space
    println("$s\tabc")

    //\n used for New Line (Enter)
    println("$s\n Hello")

    ///""" are used to written in same format on Console
    val text = """
Tell me and I forget.
    |Teach me and I remember.
Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()    //trimMargin removes Pipe and Tab Space before Pipe present inside Text

    println(text)

    //specify marginPrefix to mention character from which margin Trim end
    var marginTestValue = """
        >Tell me and I forget
        >Teach""".trimMargin(marginPrefix = ">")

    println(marginTestValue)

    //CONTINUE in Loop
    var a=0

    while(a<10)  //Loop starting statement
    {
        println("value of a = $a (before increment)")
        a++
        //2..6 means (a >= 2 && a < 7)
        if (a in 2..6){
            //continue statement will ignore execution of below steps and move execution to the loop starting statement
            continue
        }

        println("value of a = $a (after increment)")
    }

    //BREAK in Loop
    var b=0

    while (b<10)
    {
        println("value of b = $b (before increment)")
        b++

        if(b == 4)
        {
            //break statement will stop loop execution
            break
        }

        println("value of b = $b (after increment)")
    }
}