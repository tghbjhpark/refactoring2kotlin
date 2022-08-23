package chapter7

class Person(
    val name: String,
    val officeAreaCode: String,
    val officeNumber: String,
    val telephoneNumber: TelephoneNumber
) {
    fun getTelephoneNumber() = "($officeAreaCode) $officeNumber"
}

class TelephoneNumber()
