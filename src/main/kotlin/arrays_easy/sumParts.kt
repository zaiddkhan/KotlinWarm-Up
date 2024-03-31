package arrays_easy
fun sumParts(ls: IntArray): IntArray {
    if (ls.isEmpty()) {
        return intArrayOf(0)
    }

    val result = IntArray(ls.size + 1)
    var sum = ls.sum()
    result[0] = sum

    for (i in 1 until ls.size + 1) {
        sum -= ls[i - 1]
        result[i] = sum
    }

    return result
}
