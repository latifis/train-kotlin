fun main(){

    println("====== SQUARE ======")
    for (i in 1..5) {
        for(i in 1..5){
            print("* ")
        }
        println()
    }
    println("====== TRIANGLE ======")

    for (i in 1..5) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }

}