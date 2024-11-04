package dp_medium

fun numSquares(n: Int): Int {
    val dp = MutableList<Int>(n+1) { n }
    dp[0] = 0
    for(i in 1..n){
        for(s in 1..i){
            val sqaure = s * s
            if(i - sqaure < 0){
                break
            }
            dp[i] = minOf(dp[i],1+ dp[i - sqaure])
        }
    }
    return dp[n]

}