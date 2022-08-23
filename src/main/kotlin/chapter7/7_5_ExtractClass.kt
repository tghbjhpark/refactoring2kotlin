package chapter7

class Person(
    val name: String,
    val officeAreaCode: String,
    val officeNumber: String
) {
    fun getTelephoneNumber() = "($officeAreaCode) $officeNumber"
}
