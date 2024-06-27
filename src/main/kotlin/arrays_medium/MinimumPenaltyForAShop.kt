package arrays_medium

import kotlin.math.min

fun bestClosingTime(c: String): Int {
    val n = c.length
    val prefix = IntArray (n + 1)
    val postfix = IntArray (n + 1)

    for (i in 1..n) {
        prefix[i] = prefix[i - 1] + if (c[i - 1] == 'N') 1 else 0
    }

    for (i in n - 1 downTo 0) {
        postfix[i] = postfix[i + 1] + if (c[i] == 'Y') 1 else 0
    }

    var res = Integer.MAX_VALUE
    var min = Integer.MAX_VALUE
    for (i in 0..n) {
        val pen = prefix[i] + postfix[i]
        if (pen < min) {
            min = pen
            res = i
        }
    }

    return res
}