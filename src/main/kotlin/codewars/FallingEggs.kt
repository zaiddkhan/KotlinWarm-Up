package codewars

import java.math.BigInteger

fun height(n: BigInteger, m: BigInteger): BigInteger {
  //  val dp = Array(n.toInt() + 1) { IntArray(m.toInt() + 1) }
    val dp = Array(n.toInt()) { Array<BigInteger>(m.toInt()) { BigInteger.ZERO } }

    for (i in 1..m.toInt()) {
        // Iterate through the number of eggs (j) from 1 to n.
        for (j in 1..n.toInt()) {
            // Calculate the value at dp[j][i] using dynamic programming.
            // This value represents the maximum number of floors you can check
            // with j eggs and i tries.
            dp[j][i] = dp[j - 1][i - 1] + dp[j][i - 1] + BigInteger("1")

            // If the current value exceeds or equals the number of tries (m),
            // it means you can determine the target floor within m tries.
            // In this case, return j, which represents the maximum height.
            if (dp[j][i] >= m) {
                return BigInteger.valueOf(j.toLong())
            }
        }
    }

    // If you complete all iterations and haven't returned inside the loop,
    // it means you can determine the target floor up to the given n eggs.
    return BigInteger.valueOf(n.toLong())
}
