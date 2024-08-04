package sliding_window_medium

fun maxFrequency(nums: IntArray, k: Int): Int {
    nums.sort()
    var left = 0L
    var total = 0L
    var result = 1L

    for (right in nums.indices) {
        total += nums[right]

        while (nums[right] * (right - left + 1) > total + k) {
            total -= nums[left.toInt()].toLong()
            left++
        }

        result = maxOf(result, right - left + 1)
    }

    return result.toInt()
}