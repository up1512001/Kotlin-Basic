//fun main(){
//    val names = arrayOf("Utsav","Patel","abc")
//    for(name in names){
//        println(name)
//    }
//    names.forEach { println(it) }
//    forEach function iterate throught array and that iterator is 'it'

//    range
//    for(i in 0..4){
//        print("$i ")
//    }
//    println("End of Basic range")
//    for(i in 0..8 step 2){
//        print("$i ")
//    }
//    println("End of Step range")
//    for(i in 3 downTo 0){
//        print("$i ")
//    }
//    println("End of downTo range")

//    range in if conditions
//    val x = 30
//    if(x in 0..5){
//        println("x is in range of 0 to 5 ->$x")
//    }else{
//        println("x is not in range of 0 to 5 ->$x")
//    }
    // not in range (!in)
//    if (x !in 0..5){
//        print("Not in range $x")
//    }

//    List demo
//    val names = listOf("Utsav","Patel","xyz","pqr")
//    names.forEach(){
//        println(it)
//    }
//    print(names[0])  "Using indexing to retrieve values"
//    names[0] = "apq" -> this gives error because above list is immutable

//    creating mutable list
//    val names = mutableListOf("Utsav","Patel","xyz","pqr")
//    val names = mutableListOf<String>("Utsav","Patel","xyz","pqr")
//    names[0] = "UTSAV"
//    print(names[0])

    // function operation
//    print(operation(23,15))

//    function greetings
//    greetings("Utsav")
//    greetings()
//    name variable support
//    greetings(name = "Patel",greet = "Good Morning")

    // high order functions
//    val output = operation1(4,5, { a, b ->
//        println("Adding $a and $b")
//        val temp1 = a*a
//        val temp2 = b*b
//        temp1 + temp2
//    })
//    println(output)

//}

// function operation
//fun operation(a:Int , b:Int) : Int{
//    return a+b
//}
// reducing code
//fun operation(a:Int,b:Int) : Int = a+b

// function greetings
//fun greetings(greet:String = "Good Night"){
//    println("Hello $greet")
//}
//fun greetings(greet:String="Good Night" ,name:String="Utsav"){
//    println("Hello $name, $greet")
//}

// higher order functions
//fun operation1(a:Int,b:Int,operate:(Int,Int)->Int):Int {
//    return operate(a,b)
//}

//   oops
//fun main(){
//    val p1 = Person("Utsav")
//    println(p1.name)
//}
////class Person(_name:String){
////    val name : String
////    init {
////        name = _name
////    }
////}
//// above and below both are same
//class Person(val name:String)

// filter and map
//fun main(){
//    val list = listOf<Int>(1,2,5,3,7,8,9)
//    val newList = list.filter({
//        it %2 == 0
//    }).map {
//        it*it
//    }.forEach ({
//        print("$it ")
//    })
//    println("New List End...")
//    list.forEach { print("$it ") }
//    println("List End...")
//}

// let usage
//fun main(){
//    val name : String? = "Utsav"
////    if(name != null){
////        print(name)
////    }
//    name?.let {
//        print(name)
//    }
//}

// access specifier
fun main(){
    val p1 = p("Utsav Patel")
    print(p1.name)
}
private class p(val name:String)