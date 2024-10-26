package dp_medium

fun coinChange(coins: IntArray, amount: Int): Int {
    val dp = MutableList(amount+1) { Int.MAX_VALUE }
    dp[0] = 0
    for (i in 1..amount+1) {
        for (c in coins) {
            if(i - c >= 0){
                dp[i] = minOf(dp[i],1+dp[i - c])

            }
        }
    }
    return if( dp[amount] != Int.MAX_VALUE) dp[amount] else -1
}