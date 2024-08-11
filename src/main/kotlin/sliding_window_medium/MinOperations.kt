package sliding_window_medium

fun minOperations(nums: IntArray, x: Int): Int {
    val target = nums.sum() - x
    if (target < 0) return -1 // x is greater than the sum of the array

    var maxLength = -1
    var currentSum = 0
    var left = 0

    for (right in nums.indices) {
        currentSum += nums[right]

        while (currentSum > target) {
            currentSum -= nums[left]
            left++
        }

        if (currentSum == target) {
            maxLength = maxOf(maxLength, right - left + 1)
        }
    }

    return if (maxLength == -1) -1 else nums.size - maxLength
}
