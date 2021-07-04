// we can define variable with var and val key words.

// variable defined out side of main and in same file are called TOP LEVEL variables

val x : String = "Hello"
var y : String = "hi"

fun main() {
    val name : String = "Utsav"
//    name = "patel" -> gives error because we can not modify {val} variable
    print(name+"\n")

    var n : String = "Patel"
    print(n+"\n")
    n = "Utsav Patel"
    println(n+"\n")

    println(x)
    println(y)
    y = "hii"
    println(y)

//    by default variable type is null but if you
//    have explicitly define it then you could not
//    assign null value to it
//    var a : String = null -> gives error
//    if we want that then we need to add ? after defined type

    var a : String? = "hello ?"
    println(a)
    a = null
    println(a)
//    above will not generate error


}