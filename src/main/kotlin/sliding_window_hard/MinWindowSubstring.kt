package sliding_window_hard

fun minWindow(s: String, t: String): String {
    if(t.isEmpty()){
        return ""
    }
    val countT = mutableMapOf<Char,Int>()
    val window = mutableMapOf<Char,Int>()
    for(i in t.indices){
        countT[t[i]] = countT.getOrDefault(t[i], 0) + 1
    }
    var have = 0
    val need = countT.size
    var res = listOf(-1,-1)
    var len = Int.MAX_VALUE
    var l =0
    for(r in s.indices){
        val c = s[r]
        window[c] = window.getOrDefault(c, 0) + 1
        if(c in countT && window[c] == countT[c]){
            have ++

        }
        while(have == need){
            if((r-l) + 1 < len){
                res = listOf(l,r)
                len = (r-l) + 1
            }
            window[s[l]] = window.getOrDefault(s[l], 0) - 1
            if(s[l] in countT && window[s[l]]!! < countT[s[l]]!!){
                have --
            }
            l++
        }
    }
    val l1 = res[0]
    val r1 = res[1]
    return  if(len != Int.MAX_VALUE){
        s.substring(l1..r1)
    }else
        ""

}
