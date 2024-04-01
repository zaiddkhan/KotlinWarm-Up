package arrays_easy

fun isIsomorphic(s: String, t: String): Boolean {
    val charMapping = mutableMapOf<Char,Char>()
    if(s.length != t.length)
        return false

    for(i in s.indices){

            if(!charMapping.keys.contains(s[i]) && !charMapping.values.contains(t[i])){
                charMapping[s[i]] = t[i]
            }else {
                if (charMapping[s[i]] != t[i]){
                    return false
                }
            }

    }
    return true
}