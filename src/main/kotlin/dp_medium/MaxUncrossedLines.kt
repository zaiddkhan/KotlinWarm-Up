package dp_medium

fun maxUncrossedLines(nums1: IntArray, nums2: IntArray): Int {

    val dp = MutableList(nums2.size + 1) { MutableList(nums1.size + 1) { 0 } }
    for (i in 0 until nums2.size) { // Loop over nums2 indices
        for (j in 0 until nums1.size) { // Loop over nums1 indices
            if (nums2[i] == nums1[j]) {
                dp[i + 1][j + 1] = 1 + dp[i][j]
            } else {
                dp[i + 1][j + 1] = maxOf(
                    dp[i][j + 1],
                    dp[i + 1][j]
                )
            }
        }
    }
    return dp[nums2.size][nums1.size]

}