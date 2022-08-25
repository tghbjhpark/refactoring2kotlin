package chapter10

class Bird(
    val type: String,
    val name: String,
    val numOfCoconuts: Int,
    val voltage: Int,
    val isNailed: Boolean
) {
    fun plumage(): String =
        when (type) {
            "유럽 제비" -> "보통이다"
            "아프리칸 제비" -> if (numOfCoconuts > 2) "지쳤다" else "보통이다"
            "노르웨이 파랑 앵무" -> if (voltage > 100) "그을렸다" else "예쁘다"
            else -> "알 수 없다"
        }

    fun airSpeedVelocity(): Int? =
        when (type) {
            "유럽 제비" -> 35
            "아프리칸 제비" -> 40 - 2 * numOfCoconuts
            "노르웨이 파랑 앵무" -> if (isNailed) 0 else 10 + voltage / 10
            else -> null
        }
}

fun plumages(birds: List<Bird>): List<String> =
    birds.map { "${it.name}, ${plumage(it)}" }

fun speed(birds: List<Bird>): List<String> =
    birds.map { "${it.name}, ${airSpeedVelocity(it)}" }

fun plumage(bird: Bird): String = bird.plumage()

fun airSpeedVelocity(bird: Bird): Int? = bird.airSpeedVelocity()
