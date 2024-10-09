package bs_hard

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    var a = nums1
    var b = nums2

    // Ensure 'a' is the smaller array
    if (a.size > b.size) {
        a = nums2
        b = nums1
    }

    val total = a.size + b.size
    val half = total / 2

    var l = 0
    var r = a.size

    while (l <= r) {
        val i = (l + r) / 2  // Mid index for 'a'
        val j = half - i  // Mid index for 'b'

        // Handle out of bounds cases
        val aLeft = if (i > 0) a[i - 1] else Int.MIN_VALUE
        val aRight = if (i < a.size) a[i] else Int.MAX_VALUE
        val bLeft = if (j > 0) b[j - 1] else Int.MIN_VALUE
        val bRight = if (j < b.size) b[j] else Int.MAX_VALUE

        // Check if we have found the correct partition
        if (aLeft <= bRight && bLeft <= aRight) {
            // Odd total length
            if (total % 2 != 0) {
                return minOf(aRight, bRight).toDouble()
            }
            // Even total length
            return (maxOf(aLeft, bLeft) + minOf(aRight, bRight)) / 2.0
        } else if (aLeft > bRight) {
            r = i - 1  // Move left in 'a'
        } else {
            l = i + 1  // Move right in 'a'
        }
    }

    throw IllegalArgumentException("Input arrays are not sorted")
}