package dp_medium

fun combinationSum4(nums: IntArray, target: Int): Int {
    val dp = mutableMapOf<Int, Int>()
    dp[0] = 1
    for(i in 1..target+1){
        dp[i] = 0
        for(j in nums){
            dp[i] = dp.getOrDefault(i,0) + dp.getOrDefault(i-j,0)
        }
    }
    return dp[target]?:0
}