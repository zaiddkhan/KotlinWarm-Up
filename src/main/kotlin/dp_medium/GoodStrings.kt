package dp_medium

fun countGoodStrings(low: Int, high: Int, zero: Int, one: Int): Int {
    val mod = 1_000_000_007
    val dp = mutableMapOf<Int,Int>()
    fun dfs(length : Int) : Int{
        if(length > high)
            return 0
        if(length in dp){
            return dp[length]!!
        }
        var res = if(length in (low..high)) 1 else 0
        res += dfs(length +zero) + dfs(length+one)
        dp[length] = res
        return res % mod

    }
    return dfs(0)
}