package dp_medium

fun minimumTotal(triangle: List<List<Int>>): Int {
    val dp = MutableList(triangle.size + 1) { 0 }
    for(row in triangle.size -1 downTo 0) {
        triangle[row].forEachIndexed { index, value ->
            dp[index] = value + minOf(dp[index], dp[index + 1])


        }
    }
    return dp[0]
}