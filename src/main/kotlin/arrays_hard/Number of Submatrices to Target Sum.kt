package arrays_hard

import arrays_medium.permute
import kotlin.math.min

fun numSubmatrixSumTarget(matrix: Array<IntArray>, target: Int): Int {
    val rows = matrix.size
    val cols = matrix[0].size
    var res = 0

    // Compute the 2D prefix sum array
    val subMatrix = Array(rows) { IntArray(cols) }
    for (r in 0 until rows) {
        for (c in 0 until cols) {
            val top = if (r > 0) subMatrix[r - 1][c] else 0
            val left = if (c > 0) subMatrix[r][c - 1] else 0
            val topLeft = if (r > 0 && c > 0) subMatrix[r - 1][c - 1] else 0
            subMatrix[r][c] = matrix[r][c] + top + left - topLeft
        }
    }

    // Iterate over all pairs of rows
    for (r1 in 0 until rows) {
        for (r2 in r1 until rows) {
            val mapp = mutableMapOf<Int, Int>()
            mapp[0] = 1
            for (c in 0 until cols) {
                val currSum = subMatrix[r2][c] - if (r1 > 0) subMatrix[r1 - 1][c] else 0
                val diff = currSum - target
                if (mapp.containsKey(diff)) {
                    res += mapp[diff]!!
                }
                mapp[currSum] = mapp.getOrDefault(currSum, 0) + 1
            }
        }
    }

    return res
}
