//class Person {
//    var firstName = ""
//    var middleName: String? = null
//    var lastName = ""
//}

//class Person(
//    firstNameInput: String,
//    middleNameInput: String? = null,
//    lastNameInput: String,
//) {
//    var firstName = firstNameInput
//    var middleName: String? = middleNameInput
//    var lastName = lastNameInput
//}

//class Person(
//    val firstName: String,
//    val middleName: String? = null,
//    val lastName: String,
//){
//    fun greetings(greeting: String){
//        println("$greeting $firstName $lastName")
//    }
//}

class Person(
    val firstName: String,
    val middleName: String? = null,
    val lastName: String,
){
    fun greetings(greeting: String){
        println("$greeting $firstName $lastName")
    }

    fun greetings(greeting: String, message: String){
        println("$greeting $firstName $lastName $message")
    }
}



