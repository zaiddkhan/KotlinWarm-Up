package arrays_easy


fun maxProductDifference(nums: IntArray): Int {
    val sorted = nums.sorted()
    val pair1 = sorted[0] * sorted[1]
    val pair2 = sorted[sorted.size-1] * sorted[sorted.size-2]

    return pair2 - pair1
}