package arrays_medium

fun interchangeableRectangles(rectangles: Array<IntArray>): Long {
    val aspectRatioCount = mutableMapOf<Pair<Int, Int>, Int>()

    for (rectangle in rectangles) {
        val width = rectangle[0]
        val height = rectangle[1]
        val gcd = gcd(width, height)
        val normalizedWidth = width / gcd
        val normalizedHeight = height / gcd
        val key = Pair(normalizedWidth, normalizedHeight)

        aspectRatioCount[key] = aspectRatioCount.getOrDefault(key, 0) + 1
    }

    var numberOfPairs: Long = 0
    for ((_, count) in aspectRatioCount) {
        if (count > 1) {
            numberOfPairs += count.toLong() * (count - 1) / 2
        }
    }

    return numberOfPairs
}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
