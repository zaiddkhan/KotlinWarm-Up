package sliding_window_medium

fun minFlips(s: String): Int {
    val n = s.length
    val ss = s + s
    var diff1 = 0
    var diff2 = 0
    var res = n

    // Calculate initial differences for the first window of length n
    for (i in 0 until n) {
        if (ss[i] != if (i % 2 == 0) '0' else '1') diff1++
        if (ss[i] != if (i % 2 == 0) '1' else '0') diff2++
    }
    res = minOf(diff1, diff2)

    // Slide the window and update differences
    for (i in n until 2 * n) {
        if (ss[i - n] != if ((i - n) % 2 == 0) '0' else '1') diff1--
        if (ss[i - n] != if ((i - n) % 2 == 0) '1' else '0') diff2--
        if (ss[i] != if (i % 2 == 0) '0' else '1') diff1++
        if (ss[i] != if (i % 2 == 0) '1' else '0') diff2++
        res = minOf(res, diff1, diff2)
    }

    return res
}