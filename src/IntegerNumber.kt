import kotlin.jvm.javaClass

fun main() {

    // Integer Number
    val a: Byte = 127
    val b: Short = 32767
    val c: Int = 2147483647
    val d: Long = 9222337203685775807

    println("a = $a, tipe : ${a.javaClass.simpleName}")
    println("b = $b, tipe : ${b.javaClass.simpleName}")
    println("c = $c, tipe : ${c.javaClass.simpleName}")
    println("d = $d, tipe : ${d.javaClass.simpleName}")


    // Floating

    val e: Float = 1.2F
    val f: Double = 1.2

    println("e = $e, tipe : ${e.javaClass.simpleName}")
    println("f = $f, tipe : ${f.javaClass.simpleName}")
}