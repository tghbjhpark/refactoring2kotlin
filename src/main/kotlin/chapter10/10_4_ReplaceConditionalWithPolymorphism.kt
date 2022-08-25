package chapter10

class Bird(
    val type: String,
    val name: String,
    val numOfCoconuts: Int,
    val voltage: Int,
    val isNailed: Boolean
)

fun plumages(birds: List<Bird>): List<String> =
    birds.map { "${it.name}, ${plumage(it)}" }

fun speed(birds: List<Bird>): List<String> =
    birds.map { "${it.name}, ${airSpeedVelocity(it)}" }

fun plumage(bird: Bird): String =
    when (bird.type) {
        "유럽 제비" -> "보통이다"
        "아프리칸 제비" -> if (bird.numOfCoconuts > 2) "지쳤다" else "보통이다"
        "노르웨이 파랑 앵무" -> if (bird.voltage > 100) "그을렸다" else "예쁘다"
        else -> "알 수 없다"
    }

fun airSpeedVelocity(bird: Bird): Int? =
    when (bird.type) {
        "유럽 제비" -> 35
        "아프리칸 제비" -> 40 - 2 * bird.numOfCoconuts
        "노르웨이 파랑 앵무" -> if (bird.isNailed) 0 else 10 + bird.voltage / 10
        else -> null
    }
