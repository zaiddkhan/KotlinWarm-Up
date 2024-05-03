package arrays_medium

fun countPalindromicSubsequence(s: String): Int {
    val left = HashSet<Char>()
    val right = IntArray(26)
    var res = HashSet<Pair<Char, Char>>() // inner to outer pair, where they form the palindrome outer-inner-outer

    for(c in s) right[c - 'a']++

    for(i in s.indices) {
        if(right[s[i] - 'a'] > 0 ) right[s[i] - 'a']--
        for(j in 0 until 26) {
            val c = 'a'.plus(j)
            if(c in left && right[c - 'a'] > 0) {
                res.add(s[i] to c)
            }
        }
        left.add(s[i])
    }
    return res.size
}