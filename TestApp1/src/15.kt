fun main(args : Array<String>)
{
    //=========== 15 July 2018 =================================

    //ABSTRACTION

    //ABSTRACT Class (e.g : abstractClass)
    //a) We can declare a Simple function with body in abstract class (e.g : function1 in abstractClass)
    //b) We cannot declare a Simple function without body in abstract class
    //c) We can declare an Open (Virtual) function with body in abstract class (e.g : function3 in abstractClass)
    //d) We can declare an Open (Virtual) function without body in abstract class (e.g : function4 in abstractClass)
    //e) We can declare an Abstract function without body in abstract class (e.g : abstractFunction1 in abstractClass)
    //f) We can not declare an Abstract function without body in abstract class
    //e) We can declare an Abstract and Open function in abstract class (e.g : abstractFunction2 in abstractClass)

    //Class inherited by abstract class (e.g : InheritedClass)
    //a) Abstract functions are required to define
    //b) we can't override Simple function in Inherited class
    //c) we can override Simple Open function in Inherited class

    //We can't create an instance or object of Abstract class
    //so defining a simple function which is not open (virtual) in abstract class is useless
    // (e.g : function1 in abstractClass)

    var inheritedClass : InheritedClass = InheritedClass()

    //We can call all functions (abstract class as well as inherited class functions)
    //by the instance of Inherited class
    inheritedClass.function1()
    inheritedClass.function3()
    inheritedClass.function4()
    inheritedClass.function5()
    inheritedClass.abstractFunction1()
    inheritedClass.abstractFunction2()

    //'super' (in C#, 'base') keyword is used to call base class function in overridden function body of child class
    //super.functionName() (in C#, base.FunctionName())

    //in Kotlin, Class is 'sealed' by default, to make a class inheritable
    //we need to use keyword 'open' with class (e.g : Vehicle)

    println()

    println("Creating class 'Workshop' object 'workshop'")
    var workshop = Workshop("Kotlin Workshop")
    workshop.welcomeCutomer()

    println("object 'vehicleCar' of class 'Vehicle' (base class) initialized by class 'Car1' (child class) ")
    var vehicleCar : Vehicle = Car1 ("Mehran", "Suzuki","White")
    vehicleCar.service()

    println("Creating class 'Truck' object 'truck'")
    var truck = Truck ("Mazda", "Ford","Black")
    truck.service()

    println("Creating class 'Car1' object 'car'")
    var car = Car1 ("Corolla", "Suzuki","White")
    car.service()

    println("Creating class 'SportsCar' object 'spcar'")
    var spcar = SportsCar("A8", "Audi","Black")
    spcar.service()

    println("Calling methods from 'workshop' object")
    workshop.doCarService(car)
    workshop.doTruckService(truck)
    workshop.doCarService(car)
    workshop.doVehicleService(truck)
    workshop.doVehicleService(spcar)
    workshop.doVehicleService(vehicleCar)
}

open class Vehicle (var name : String, var brand : String, var color : String ) {

    open fun service(){
        println("'service' method of 'Vehicle' class is calling")
    }
}

open  class Car1 (name: String, brand: String, color: String) : Vehicle (name, brand, color) {

    override fun service(){
        println("'service' method of 'Car1' class is calling")
    }
}

class Truck (name: String, brand: String, color: String) : Vehicle(name, brand, color) {

    override fun service() {
        println("calling base class 'Vehicle' method 'service'")
        //calling Base class function
        super.service()

        println("'service' method of 'Truck' class is calling")
    }
}

class SportsCar (name: String, brand: String, color: String) : Car1 (name, brand, color) {

}

class Workshop(var workshopName : String ) {

    fun welcomeCutomer(){
        println("Welcome to $workshopName")
    }

    fun doCarService( c : Car1 ) {
        println("calling class 'Car1' method 'service' from class 'workShop' method 'doCarService''")
        c.service()
        println("${c.name} is Cleaning")
    }

    fun doTruckService( t: Truck){
        println("calling class 'Truck' method 'service' from class 'workShop' method 'doTruckService''")
        t.service()
        println("${t.name} is Cleaning")
    }

    fun doVehicleService(v : Vehicle){
        println("calling class 'Vehicle' method 'service' from class 'workShop' method 'doVehicleService''")
        v.service()
        println("${v.name} is Cleaning")
    }
}

abstract class abstractClass {

    fun function1() { println("Simple function defined in Abstract class") }
    open fun function3(){ println("Simple Open (Virtual) function defined in Abstract class") }
    open fun function4(){ println("Simple Open (Virtual) function defined in Abstract class") }
    abstract fun abstractFunction1()
    open abstract  fun abstractFunction2()
}

class InheritedClass : abstractClass() {
    override fun abstractFunction1() {
        println("Abstract function overridden in inherited class")
    }

    override fun abstractFunction2() {
        println("Abstract and Open function overridden in inherited class")
    }

    override fun function3() {
        println("Simple Open function overridden in inherited class")
    }

    fun function5() { println("Simple function defined in Inherited class") }
}