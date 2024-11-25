package dp_medium

fun integerBreak(n: Int): Int {
    val dp = mutableMapOf<Int,Int>()
    dp[1] = 1
    for(i in 2..n){
        dp[i] = if(i == n) 0 else n
        for(j in 1..n){
           val new = dp[j]?.times(dp[i-j]!!) ?: 0
            dp[i]  = maxOf(dp[i]!!, new)

        }
    }
    return dp[n]!!
}