package dp_medium

import kotlin.math.pow

fun maxSumMinProduct(nums: IntArray): Int {
    var res = 0L // Using Long to avoid overflow
    val stack = ArrayDeque<Pair<Int, Int>>()
    val prefix = mutableListOf<Long>() // Store prefix sums as Longs to avoid overflow

    prefix.add(0L)
    for (n in nums) {
        prefix.add(prefix.last() + n) // Prefix sum calculation
    }

    nums.forEachIndexed { index, value ->
        var newStart = index
        while (stack.isNotEmpty() && stack.last().second > value) {
            val (start, minVal) = stack.removeLast()
            val total = prefix[index] - prefix[start]
            res = maxOf(res, minVal * total)
            newStart = start
        }
        stack.add(Pair(newStart, value))
    }

    for ((start, minVal) in stack) {
        val total = prefix[nums.size] - prefix[start]
        res = maxOf(res, minVal * total)
    }

    return (res % (1_000_000_007)).toInt() // Ensuring result within constraints
}