package dp_medium

fun bestTeamScore(scores: IntArray, ages: IntArray): Int {
    val list = ages.zip(scores).sortedWith(compareBy({ it.first }, { it.second }))
    val n = scores.size
    val dp = IntArray(n)
    var max = 0
    for (i in 0 until n) {
        val currentScore = list[i].second
        dp[i] = currentScore

        for (j in 0 until i) {
            if (list[j].second <= currentScore) {
                dp[i] = Math.max(dp[i], dp[j] + currentScore)
            }
        }

        max = Math.max(max, dp[i])
    }
    return max
}