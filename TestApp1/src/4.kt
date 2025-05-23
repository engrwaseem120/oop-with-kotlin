import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main(args  : Array<String>)
{
    //=========== 22 April 2018 =================================

    //var -> mutable (Objects having Setter and Getter)
    //val -> immutable (Objects having only Getter)
    //In KOTLIN, default constructors without argument is not available we have to explicitly define constructor with argument
    //By default, Access modifier of Class's fields and methods are PUBLIC
    //CLASS Constructor
    val defaultConstructorObject = ClassWithConstructors()

    //SET Property
    defaultConstructorObject.length = 10
    defaultConstructorObject.width = 10
    defaultConstructorObject.height = 10

    //GET Property
    println("Object is Square = ${defaultConstructorObject.isSquare}")

    //Parameterized Constructor
    val parameterizedConstructorsObject1 = ClassWithConstructors(10,10,10)

    //GET Property
    println("Object is Square = ${parameterizedConstructorsObject1.isSquare}")

    //ARRAY

    //TYPE 1
    //Integer Array of Length 5
    var integerArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    for (a in integerArray)
    {
        println("Element of Integer Array by Type 1 is $a")
    }

    //TYPE 2
    //Integer Array of Length 3 with default value 2
    //If any element is not initialized for a particular index
    //If call that uninitialized element by its index
    //Then instead of raising 'Object reference exception'
    //Default value 2 will appear
    integerArray = Array<Int>(3) { i-> 2}
    integerArray[0] = 4
    integerArray[2] = 6

    for (b in integerArray)
    {
        println("Element of Integer Array by Type 2 is $b")
    }

    println("Array value called by Index and its default value ${integerArray[1]} appeared")

    //TYPE 3
    var integerArray1 = intArrayOf(6,7,8,9,10)

    for (c in integerArray1)
    {
        println("Element of Integer Array by Type 3 is $c")
    }

    //To get Length of Array
    println("Length of Integer Array by Type 3 is ${integerArray1.size}")

    //HASHMAP
    //here Int is Key and String is Value
    var hashMap = HashMap<Int, String>()
    hashMap.put(1,"ABC")
    hashMap.put(2,"DEF")
    //or
    hashMap[3] = "GHI"
    hashMap[4] = "JKL"

    for ((key, value) in hashMap)
    {
        println("HashMap => Key = $key ; Value = $value ")
    }

    //How to get value by Key from HashMap
    println("Value in HashMap for Key = 3 is ${hashMap.get(3)}")

    //Another way to get value by Key from HashMap
    println("Value in HashMap for Key = 2 is ${hashMap[2]}")

    //Remove Item from HashMap by Key
    hashMap.remove(1)

    for ((key, value) in hashMap)
    {
        println("HashMap => Key = $key ; Value = $value ")
    }

    //Check whether Key exists in HashMap
    println("Key 3 exist in HashMap : ${hashMap.containsKey(3)}")
    println("Key 7 exist in HashMap : ${hashMap.containsKey(7)}")

    //SETOF is a collection object
    var myIntegerSet = setOf<Int>(1,2,3,4,5)

    //Print all elements separated by Comma enclosed in Square Bracket e.g : [1, 2, 3, 4, 5]
    println(myIntegerSet)

    for (a in myIntegerSet)
    {
        println("Value in my Integer Set is $a")
    }

    //HASHSET
    var myHashSet = hashSetOf<Double>(1.5,2.5,3.5)
    myHashSet.add(109.5)

    for (b in myHashSet)
    {
        println("Value in myHashSet is $b")
    }

    //ARRAYLIST

    //Type 1
    var stringArrayList : ArrayList<String> = ArrayList<String>()

    stringArrayList.add("A")
    stringArrayList.add("B")
    stringArrayList.add("C")
    stringArrayList.add("D")
    stringArrayList.add("E")

    //Check whether particular element exist in ArrayList
    println("D exists in String ArrayList ${"D" in stringArrayList}")

    for(a in stringArrayList)
    {
        println("Element of String DataType ArrayList is $a")
    }

    var anyArrayList = ArrayList<Any>()

    anyArrayList.add("A")
    anyArrayList.add(1)
    anyArrayList.add(1.2)

    for (b in anyArrayList)
    {
        println("Element of Any DataType ArrayList is $b")
    }

    //Type 2
    var arrayList1 = arrayListOf<Int>(4,5,6,7,8)

    //Add Element
    arrayList1.add(9)

    //Add Element at particular Index, before below statement Last Index of arrayList1 is 5
    //So below statement add new element in Last
    arrayList1.add(6,10)

    //Before below statement, Element (6) is already present at index (2)
    //But below statement, replace existing element (6) by new element (11) and shifted all below index (2) elements
    //downwards, so all below elements indexes changed and increased by 1
    arrayList1.add(2,11)

    for(a in arrayList1)
    {
        println("Element in ArrayList by Type 2 is $a")
    }

    //Remove by Element Value
    arrayList1.remove(7)

    //Remove by Element Index
    arrayList1.removeAt(4)

    for(a in arrayList1)
    {
        println("New Element in ArrayList by Type 2 is $a")
    }

    //EXCEPTION HANDLING
    val scanner = Scanner(System.`in`)

    try
    {
        println("Before Exception")
        println("Please enter Integer value : ")
        var scannerValue = scanner.nextInt()

        println("Entered Integer Value is $scannerValue")

        println("After Exception")
    }
    catch (ex : Exception)
    {
        println("Invalid Value Entered")
        ex.printStackTrace()
    }

    //ARITHMETIC EXCEPTION
    try {
        10/0
    }
    catch (ex : Exception)
    {
        println("Arithmetic Exception")
    }
    finally {
        println("finally code run")
    }
}

class ClassWithConstructors
{
    private var LengthValue : Int = 0
    private var WidthValue : Int = 0
    private var HeightValue : Int = 0

    var length : Int = 0
        set(lengthValue) {
            LengthValue = lengthValue
    }

    var width : Int = 0
        set(widthValue) {
            WidthValue = widthValue
        }
    var height : Int = 0
        set(heightValue) {
            HeightValue = heightValue
        }

    var isSquare : Boolean = false
    get() {
        if (LengthValue == WidthValue) {
            if (WidthValue == HeightValue) {
                return true
            }
        }
        return false
    }

    constructor()
    {

    }

    constructor(Length : Int, Width : Int,  Height : Int)
    {
        LengthValue = Length
        WidthValue = Width
        HeightValue = Height
    }
}