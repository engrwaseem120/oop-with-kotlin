//=========== 08 July 2018 =================================

//package is same as namespace
package pkg2

internal class PackageClass2 {

    //variable with access modifier
    //internal access modifier member can be accessed within the project
    internal var internatlVar = 0

    //in Kotlin, access modifier is by default 'public'
    //public access modifier member can be accessed everywhere
    var publicVar = 0

    //protected access modifier member can be accessed only by Child class (inherited by PackageClass2)
    protected var protectedVar = 0

    //private access modifier member can be accessed only in this class
    private var privateVar = 0
}