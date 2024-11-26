package dp_medium

fun findNumberOfLIS(nums: IntArray): Int {
    val dp = mutableMapOf<Int,Pair<Int,Int>>()
    var lenLIS = 0
    var res = 0

    for(i in nums.size - 1 downTo 0) {
        var maxLen = 1
        var maxCount = 1
        for(j in i + 1 until nums.size) {
            if(nums[j] > nums[i]) {
                val cc = dp[j]!!
                val length = cc.first
                val count = cc.second
                if(length + 1 > maxLen){
                    maxLen = length + 1
                    maxCount = count
                }else if(length + 1 == maxLen){
                    maxCount += count
                }
            }
        }
        if(maxLen > lenLIS){
            lenLIS = maxLen
            res = maxCount
        }else if(maxLen == lenLIS){
            res += maxCount
        }
        dp[i] = Pair(maxLen,maxCount)
    }

    return res
}