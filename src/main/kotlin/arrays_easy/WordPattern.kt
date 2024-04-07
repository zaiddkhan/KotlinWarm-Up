package arrays_easy

fun wordPattern(pattern: String, s: String): Boolean {
    if(pattern.length != s.split(" ").size)
        return false

    val ans= mutableMapOf<Char,String>()
    pattern.toCharArray().zip(s.split(" ")).forEach { pair ->
        if(ans.containsValue(pair.second) || ans.contains(pair.first)){
            val previousKey = ans.keys.find {
                ans[it] == pair.second
            }
            if(previousKey != pair.first)
                return false

        }
        ans[pair.first] = pair.second
    }

    return true
}