package codewars

fun chooseBestSum(t: Int, k: Int, ls: List<Int>): Int {
    fun calcBest(startFrom: Int, accumulated: Int, k: Int): Int {
        if (ls.size - startFrom < k) return -1
        if (accumulated > t) return -1
        if (k == 0) return accumulated
        return calcBest(startFrom + 1, accumulated + ls[startFrom], k - 1)
                .coerceAtLeast(calcBest(startFrom + 1, accumulated, k))
    }
    return calcBest(0, 0, k)

}
fun <T> List<T>.combinations(n: Int): List<List<T>> =
        this.foldIndexed(listOf())
        { i, acc, e ->
            acc + if (n > 1) {
                this.drop(i + 1)
                        .combinations(n - 1)
                        .map { it + e }
            } else listOf(listOf(e))
        }