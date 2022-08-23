package chapter7

class Person(
    val name: String,
    val telephoneNumber: TelephoneNumber
) {
    fun getTelephoneNumber() = telephoneNumber.toString()
}

class TelephoneNumber(
    val areaCode: String,
    val number: String
) {
    override fun toString(): String {
        return "($areaCode) $number"
    }
}
