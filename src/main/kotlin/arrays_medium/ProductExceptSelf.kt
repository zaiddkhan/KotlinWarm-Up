package arrays_medium

fun productExceptSelf(nums: IntArray): IntArray {
    val ans = IntArray(size = nums.size)

    var prefix = 1

    for (i in 0 until nums.size) {
        ans[i] = prefix
        prefix *= nums[i]
    }

    var postfix = 1
    for (i in nums.size - 1 downTo 0) {
        ans[i] *= postfix
        postfix *= nums[i]
    }
    return ans
}