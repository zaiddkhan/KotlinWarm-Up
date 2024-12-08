package dp_medium

fun new21Game(n: Int, k: Int, maxPts: Int): Double {
    if (k == 0 || n >= k + maxPts - 1) return 1.0

    val dp = DoubleArray(n + 1)
    dp[0] = 1.0
    var windowSum = 1.0
    var result = 0.0

    for (i in 1..n) {
        dp[i] = windowSum / maxPts
        if (i < k) {
            windowSum += dp[i]
        } else {
            result += dp[i]
        }
        if (i >= maxPts) {
            windowSum -= dp[i - maxPts]
        }
    }

    return result
}