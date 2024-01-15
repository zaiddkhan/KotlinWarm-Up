package hackerrank

import kotlin.math.min

fun pageCount(n: Int, p: Int): Int {

    val fromFront = p / 2
    val fromBack = (n / 2) - (p / 2)

    return minOf(fromFront, fromBack)
}