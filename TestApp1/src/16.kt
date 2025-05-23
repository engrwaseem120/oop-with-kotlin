fun main(args : Array<String>)
{
    //=========== 29 July 2018 =================================

    //ABSTRACTION

    println("object 'laptop' class 'Laptop'")
    var laptop = Laptop("T43", 12, 200.0)

    laptop.viewItemName()
    println(laptop.getItemPrice())
    println(laptop.brand)
    println(laptop.id)
    println(laptop.type)
    println(laptop.buyItem(12))
    println(laptop.sellItem())

    var mobile = Mobile("Moto", 22, 220.0)
    mobile.viewItemName()
    println(mobile.getItemPrice())
    println(mobile.brand)
    println(mobile.id)
    println(mobile.type)
    println(mobile.buyItem(12))
    println(mobile.sellItem())
    println(mobile.model)

    //property
    var mobile2 : InventoryItem = Mobile("Samsung", 30, 250.0)
    mobile2.viewItemName()
    println(mobile2.getItemPrice())
    println(mobile2.brand)
    println(mobile2.id)
    println(mobile2.type)
    println(mobile2.buyItem(12))
    println(mobile2.sellItem())

    //we can't access 'model' property of class 'Mobile' through object 'mobile2'
    //because 'mobile2' is object of class 'InventoryItem'
    //while 'model' property is declared in 'Mobile' class

    println()

    //DATA CLASS
    var dataClassObject1=dataClass1("kotlin",5)
    var classObject1 = class1("java",20)

    //in Data class, built-in toString method provides constructor implementation
    //while simple class, built-in toString method behaviour is different
    //we can override built-in method toString in class
    println(dataClassObject1.toString())
    println(classObject1.toString())

    //built-in equal method of class compares class object for the object provided in argument
    //we can override built-in method 'equals' in class
    var dataClassObject2=dataClassObject1
    println(dataClassObject1.equals(dataClassObject2))
    println(classObject1.equals(dataClassObject2))

    println()

    //INTERFACE
    //Kotlin doesn't support multiple class inheritance
    //Interface behaviour is much similar as Abstract class
    //major difference between Interface and Abstract class is that
    //We can create object or instance of Interface by Class inherited by that interface
    //but we cannot create object of Abstract class
    var threeDimInterfaceObject : IThreeDimension = Box(3,9,11)
    println(threeDimInterfaceObject.getVolume())

    //we can't access method 'getArea' of interface 'ITwoDimension' although
    //class 'Box' is inherited by 'ITwoDimension' similarly
    //we can't access method 'draw' of abstract class 'Geometry' although
    //class 'Box' is inherited by 'Geometry'
}

abstract class Geometry (var length: Int, var width: Int) {
    abstract fun draw()
}

interface ITwoDimension {
    var area: Int
    fun showArea(): Int //abstract function
    fun demoFunction() {
        println("this is a 2d demo function")
    }
}

interface IThreeDimension {
    fun getVolume(): Int
}

class Square(length: Int, width: Int) : Geometry(length, width), ITwoDimension {
    override var area: Int = 0

    override fun showArea(): Int {
        return length * width
    }

    override fun draw() {
        println("draw square")
    }
}

class Box(var height: Int, length: Int, width: Int) : Geometry(length, width), ITwoDimension, IThreeDimension {
    override var area: Int = 0
    override fun showArea(): Int {
        return length * width
    }

    override fun getVolume(): Int {
        return length * width * height
    }

    override fun draw() {
        println("draw Box")
    }
}

data class dataClass1 (var name : String, var age : Int )
{

}

class class1 (var name : String, var age : Int )
{

}

abstract class InventoryItem (var name: String, var id: Int, var price: Double) {

    //Abstract property
    abstract var brand: String
    var type : String = "Inventory Type"

    //Parameterized Abstract method
    abstract fun buyItem(id : Int)
    abstract fun sellItem()

    //Abstruct mehtod with ReturnType
    abstract fun getItemPrice() : Double

    fun viewItemName() {
        println("Inventory name is $name")
    }
}

class Mobile(name: String, id: Int, price: Double) : InventoryItem(name, id, price) {

    var model : String = "Mobile model"

    override fun getItemPrice() : Double {
        return price
    }

    override var brand: String = "Mobile Brand"

    override fun sellItem() {
        println("Mobile sold")
    }

    override fun buyItem(id: Int) {
        println("Mobile purchased")
    }
}

class Laptop (name: String, id: Int, price: Double) : InventoryItem (name, id, price) {

    override fun getItemPrice(): Double {
        return price
    }

    override var brand: String = "Laptop Brand"

    override fun sellItem() {
        println("Laptop sold")
    }

    override fun buyItem(id: Int) =  println("Laptop purchased")
}