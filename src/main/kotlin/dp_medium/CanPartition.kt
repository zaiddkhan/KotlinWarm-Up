package dp_medium

fun canPartition(nums: IntArray): Boolean {
    if(nums.sum() % 2 != 0) return false
    var dp = mutableSetOf<Int>()
    dp.add(0)
    val target = nums.sum() /2
    for (i in nums.size -1  downTo 0) {
        val nextDp  = mutableSetOf<Int>()
        for(t in dp){
            nextDp .add(t + nums[i])
            nextDp.add(t)
        }
        dp = nextDp

    }
    return target in dp
}