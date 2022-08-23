package chapter7

class Person(
    val name: String,
    val officeAreaCode: String,
    val officeNumber: String,
    val telephoneNumber: TelephoneNumber
) {
    fun getTelephoneNumber() = telephoneNumber.toString()
}

class TelephoneNumber(
    val areaCode: String,
    val number: String
) {
    fun getTelephoneNumber() = "($areaCode) $number"

    override fun toString(): String {
        return "($areaCode) $number"
    }
}
