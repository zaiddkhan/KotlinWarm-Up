package hackerrank

fun romanToInt(s: String): Int {
    val romanValues = hashMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (i in s.length - 1 downTo 0) {
        val currentSymbol = s[i]
        val currentValue = romanValues[currentSymbol] ?: 0

        if (currentValue < prevValue) {
            result -= currentValue
        } else {
            result += currentValue
        }

        prevValue = currentValue
    }

    return result
}