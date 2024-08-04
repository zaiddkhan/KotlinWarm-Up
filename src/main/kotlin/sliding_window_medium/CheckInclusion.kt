package sliding_window_medium

fun checkInclusion(s1: String, s2: String): Boolean {
    val len1 = s1.length
    val len2 = s2.length
    if (len1 > len2) return false

    val s1Map = mutableMapOf<Char,Int>()
    for (i in s1.indices) {
        s1Map[s1[i]] = s1Map.getOrDefault(s1[i], 0) + 1
    }
    val s2Map = mutableMapOf<Char,Int>()

    for(i in s2.indices) {
        s2Map[s2[i]] = s2Map.getOrDefault(s2[i], 0) + 1
        if(i >= len1){
            if(s2Map[s2[i]] == 1){
                s2Map.remove(s2[i])
            }else{
                s2Map.getOrDefault(s2[i], 0) - 1
            }
        }
        if(s1Map == s2Map)
            return true
    }
    return false
}