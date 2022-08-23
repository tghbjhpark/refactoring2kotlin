package chapter6

fun readingsOutsideRange(station: Station, range: Range): List<Reading> {
    return station.readings.filter {
        !range.contains(it.temp)
    }
}

data class Range(
    val min: Int,
    val max: Int
) {
    fun contains(value: Int) = value in min..max
}

data class Station(
    val name: String,
    val readings: List<Reading>
)

data class Reading(
    val temp: Int,
    val time: String
)

// Caller
data class OperatingPlan(
    val temperatureFloor: Int,
    val temperatureCeiling: Int
)

fun main() {
    val operatingPlan = OperatingPlan(24, 27)
    val range = Range(operatingPlan.temperatureFloor, operatingPlan.temperatureCeiling)
    val alerts = readingsOutsideRange(station, range)
}

val station = Station(
    name = "ZB1",
    readings = listOf(
        Reading(47, "2016-11-10 09:10"),
        Reading(53, "2016-11-10 09:20"),
        Reading(58, "2016-11-10 09:30"),
        Reading(53, "2016-11-10 09:40"),
        Reading(51, "2016-11-10 09:50")
    )
)