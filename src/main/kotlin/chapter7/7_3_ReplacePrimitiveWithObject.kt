package chapter7

const val sampleData =
    "office, country, telephone\n" +
            "Chicago, USA, +1 312 373 1000\n" +
            "Beijing, China, +86 4008 900 505\n" +
            "Bangalore, India, +91 80 4064 9570\n" +
            "Porto Alegre, Brazil, +55 51 3079 3550\n" +
            "Chennai, India, +91 44 660 44766"

fun acquireData(csvData: String): List<String> {
    val lines = csvData.split("\n")
    val result = mutableListOf<String>()
    val loopItems = lines.drop(1)
    for (line in loopItems) {
        if (line.trim() == "") continue
        val record = line.split(",")
        if (record[1].trim() == "India") {
            result.add("city: ${record[0].trim()}, phone: ${record[2].trim()}")
        }
    }

    return result
}