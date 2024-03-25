fun main() {

    // Array
    val member: Array<Any> = arrayOf("latif", "irfan", "sya", 1)
    println(member.map { it })
    println(member.contentToString())

    // Loop
    for (name in member) {
        println(name)
    }
}