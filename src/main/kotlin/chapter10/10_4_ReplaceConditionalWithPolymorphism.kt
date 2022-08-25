package chapter10

sealed class Bird(
    val type: String,
    val name: String,
    val numOfCoconuts: Int,
    val voltage: Int,
    val isNailed: Boolean
) {
    open fun plumage(): String = "알 수 없다"

    fun airSpeedVelocity(): Int? =
        when (type) {
            "유럽 제비" -> 35
            "아프리칸 제비" -> 40 - 2 * numOfCoconuts
            "노르웨이 파랑 앵무" -> if (isNailed) 0 else 10 + voltage / 10
            else -> null
        }

    fun createBird() =
        when (type) {
            "유럽 제비" -> EuropeanSwallow(this)
            "아프리칸 제비" -> AfricanSwallow(this)
            "노르웨이 파랑 앵무" -> NorwegianBlueParrot(this)
            else -> this
        }

    class EuropeanSwallow(bird: Bird): Bird(
        bird.type, bird.name, bird.numOfCoconuts, bird.voltage, bird.isNailed
    ) {
        override fun plumage(): String = "보통이다"
    }

    class AfricanSwallow(bird: Bird): Bird(
        bird.type, bird.name, bird.numOfCoconuts, bird.voltage, bird.isNailed
    ) {
        override fun plumage(): String = if (numOfCoconuts > 2) "지쳤다" else "보통이다"
    }

    class NorwegianBlueParrot(bird: Bird): Bird(
        bird.type, bird.name, bird.numOfCoconuts, bird.voltage, bird.isNailed
    ) {
        override fun plumage(): String = if (voltage > 100) "그을렸다" else "예쁘다"
    }
}

fun plumages(birds: List<Bird>): List<String> =
    birds.map { "${it.name}, ${it.createBird().plumage()}" }

fun speed(birds: List<Bird>): List<String> =
    birds.map { "${it.name}, ${it.createBird().airSpeedVelocity()}" }
