fun hello(){
    println("hello")
}

fun sayHello(name: String){
    println("Hello $name")
}

// blm
fun hiHello(greeting: String = "Hi", name: String){
    println("$greeting $name")
}

fun penjumlahan(x: Int, y: Int): Int{
    return x + y
}

fun perkalian(x: Int, y: Int): Int = x * y

fun main(){
    hello()

    val a = "Latif"
    sayHello(a)
    hiHello("goood",a)

    penjumlahan(7,6)
    println(penjumlahan(7,6))

    perkalian(4,5)
    println(perkalian(4,5))
}