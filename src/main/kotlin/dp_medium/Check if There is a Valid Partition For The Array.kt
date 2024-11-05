package dp_medium

fun validPartition(nums: IntArray): Boolean {
    if (nums.size < 2) return false // Ensure the array has at least 2 elements

    val dp = BooleanArray(nums.size)
    dp[1] = nums[0] == nums[1] // Check if the first two elements form a valid pair

    if (nums.size > 2) {
        dp[2] = (nums[0] == nums[1] && nums[1] == nums[2]) || // Check if first three elements are equal
                (nums[0] + 1 == nums[1] && nums[1] + 1 == nums[2]) // Check if first three elements are consecutive
    }

    for (i in 3 until nums.size) {
        // Check for valid pair ending at i
        if (nums[i] == nums[i - 1] && dp[i - 2]) {
            dp[i] = true
        }
        // Check for valid triplet ending at i
        if ((nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2] ||
                    nums[i - 2] + 1 == nums[i - 1] && nums[i - 1] + 1 == nums[i]) && dp[i - 3]) {
            dp[i] = true
        }
    }

    return dp[nums.lastIndex]
}
