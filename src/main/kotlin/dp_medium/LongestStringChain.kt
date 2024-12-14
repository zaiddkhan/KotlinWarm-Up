package dp_medium

fun longestStrChain(words: Array<String>): Int {
    // Sort words by length in descending order
    words.sortByDescending { it.length }

    // Map each word to its index for quick access
    val wordIndex = words.mapIndexed { index, s -> s to index }.toMap()

    // Memoization map for storing the longest chain starting from a word
    val dp = mutableMapOf<Int, Int>()

    fun dfs(index: Int): Int {
        // If already computed, return the value
        if (index in dp) {
            return dp[index]!!
        }

        var res = 1 // Minimum chain length is 1 (the word itself)
        val word = words[index]

        // Generate all possible predecessors by removing one letter
        for (i in word.indices) {
            val pred = word.substring(0, i) + word.substring(i + 1)
            // If the predecessor exists, calculate its chain length
            if (pred in wordIndex) {
                res = maxOf(res, 1 + dfs(wordIndex[pred]!!))
            }
        }

        // Store the result in dp
        dp[index] = res
        return res
    }

    // Compute the longest chain for every word
    var maxChain = 0
    for (i in words.indices) {
        maxChain = maxOf(maxChain, dfs(i))
    }
    return maxChain
}
