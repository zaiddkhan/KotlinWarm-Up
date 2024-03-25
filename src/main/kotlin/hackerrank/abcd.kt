package hackerrank

fun containsDuplicate(nums: IntArray): Boolean {
    return nums.distinct() == nums.sorted()
}
