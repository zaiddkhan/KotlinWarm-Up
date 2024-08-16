package sliding_window_hard


fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
    val ans = IntArray(nums.size - k + 1)
    var j = 0
    val q = ArrayDeque<Int>()

    for (i in nums.indices) {
        if (q.isNotEmpty() && q.first() < i - k + 1) q.removeFirst()
        while (q.isNotEmpty() && nums[i] > nums[q.last()]) q.removeLast()
        q.addLast(i)
        if (i >= k - 1) ans[j++] = nums[q.first()]
    }
    return ans
}