package dp_medium

fun largestDivisibleSubset(nums: IntArray): List<Int> {
    nums.sort()
    val dp = MutableList<MutableList<Int>>(nums.size) {
        mutableListOf()
    }
    nums.forEachIndexed { index, i ->
        dp[index] = mutableListOf(i)
    }
    var res = mutableListOf<Int>()

    for(i in nums.lastIndex downTo  0 ) {
        for(j in i+1 until nums.size) {
            if(nums[j] % nums[i] == 0){
                val temp = listOf(nums[i]) + dp[j]
                dp[i] = if(temp.size > dp[i].size) temp.toMutableList() else dp[i]
            }
        }
        res = if(dp[i].size > res.size) dp[i] else res
    }

    return res
}