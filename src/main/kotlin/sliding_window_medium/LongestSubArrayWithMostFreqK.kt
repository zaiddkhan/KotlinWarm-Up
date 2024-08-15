package sliding_window_medium

fun maxSubarrayLength(nums: IntArray, k: Int): Int {
    var res = 0
    var left = 0
    val mapp = mutableMapOf<Int, Int>()

    for (right in nums.indices) {
        mapp[nums[right]] = mapp.getOrDefault(nums[right], 0) + 1

        while (mapp[nums[right]]!! > k) {
            mapp[nums[left]] = mapp[nums[left]]!! - 1
            if (mapp[nums[left]] == 0) {
                mapp.remove(nums[left])
            }
            left++
        }

        res = maxOf(res, right - left + 1)
    }

    return res
}