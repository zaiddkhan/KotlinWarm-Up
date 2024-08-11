package sliding_window_medium

import kotlin.math.abs
fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
    val startIn = arr.binarySearch(x).let { if (it < 0) -it - 1 else it }
    var l = startIn - 1
    var r = startIn
    val res = mutableListOf<Int>()

    while (res.size < k) {
        if (l < 0) {
            res.add(arr[r])
            r++
        } else if (r >= arr.size) {
            res.add(arr[l])
            l--
        } else if (abs(arr[l] - x) < abs(arr[r] - x)) {
            res.add(arr[l])
            l--
        } else if (abs(arr[l] - x) > abs(arr[r] - x)) {
            res.add(arr[r])
            r++
        } else {
            if (arr[l] <= arr[r]) {
                res.add(arr[l])
                l--
            } else {
                res.add(arr[r])
                r++
            }
        }
    }

    return res.sorted()
}
