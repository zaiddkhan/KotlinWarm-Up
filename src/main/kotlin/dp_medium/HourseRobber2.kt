package dp_medium

fun rob(nums: IntArray): Int {



   return maxOf(nums[0], helper(nums.drop(1)), helper(nums.dropLast(1)))

}

fun helper(nums: List<Int>): Int {
    var rob1 = 0
    var rob2 = 0
    for(n in nums){
        val newRob = maxOf(rob1+n,rob2)
        rob1 = rob2
        rob2 = newRob
    }
    return rob2
}