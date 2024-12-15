package dp_medium
fun knightDialer(n: Int): Int {
    if (n == 1) return 10
    val mod = 1_000_000_007
    val jumps = listOf(
        listOf(4, 6),
        listOf(6, 8),
        listOf(7, 9),
        listOf(4, 8),
        listOf(3, 9, 0),
        listOf(),
        listOf(1, 7, 0),
        listOf(2, 6),
        listOf(1, 3),
        listOf(2, 4),
    )

    var dp = MutableList(10) { 1L } // Base case for length 1, use Long to prevent overflow
    for (step in 1 until n) { // Run for n-1 steps
        val nextDp = MutableList(10) { 0L }
        for (digit in 0 until 10) {
            for (jump in jumps[digit]) {
                nextDp[jump] = (nextDp[jump] + dp[digit]) % mod
            }
        }
        dp = nextDp
    }

    return dp.fold(0L) { acc, count -> (acc + count) % mod }.toInt()
}