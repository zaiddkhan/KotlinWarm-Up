package dp_medium

fun numDecodings(s: String): Int {
    val dp = mutableMapOf<Int, Int>()
    dp[s.length] = 1  // Base case: An empty string has 1 way to decode

    fun dfs(i: Int): Int {
        if (i in dp) return dp[i]!!
        if (s[i] == '0') return 0  // No valid decoding starts with '0'

        var res = dfs(i + 1)  // Decode the single digit

        // Check if a valid two-digit decoding is possible
        if (i + 1 < s.length && (s[i] == '1' || (s[i] == '2' && s[i + 1] in '0'..'6'))) {
            res += dfs(i + 2)
        }

        dp[i] = res  // Memoize the result for this index
        return res
    }

    return dfs(0)
}
