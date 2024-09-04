package stack_medium

fun find132pattern(nums: IntArray): Boolean {
    val stack = ArrayDeque<Int>()
    var second = Int.MIN_VALUE

    for (i in nums.size - 1 downTo 0) {
        if (nums[i] < second) {
            return true
        }
        while (stack.isNotEmpty() && nums[i] > stack.last()) {
            second = stack.removeLast()
        }
        stack.addLast(nums[i])
    }

    return false
}