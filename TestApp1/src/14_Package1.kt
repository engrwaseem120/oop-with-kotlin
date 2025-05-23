//=========== 08 July 2018 =================================

//package is same as namespace
//in C#, it will be as
//namespace SolutionName.ProjectName.FolderName
package pkg1

//in C#, it will be as
//using pkg2
//using package's name to use class in this assembly
import pkg2.PackageClass2

fun main(args: Array<String>) {

    println("Calling and initializing 'PackageClass2' class of different package by object name 'packageClass2'")
    val packageClass2 = PackageClass2()

    packageClass2.internatlVar=3
    packageClass2.publicVar=3


    println("calling and setting members of class 'PackageClass2'")
    println("internal variable 'internalVar' of class 'PackageClass2' set to value '${packageClass2.internatlVar}'")
    println("public variable 'publicVar' of class 'PackageClass2' set to value '${packageClass2.publicVar}'")
}