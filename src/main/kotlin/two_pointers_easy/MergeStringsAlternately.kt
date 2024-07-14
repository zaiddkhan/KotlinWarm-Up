package two_pointers_easy

fun mergeAlternately(word1: String, word2: String): String {
    val nums = maxOf(word1.length, word2.length)
    var res = ""
    for (i in 0 .. nums-1) {
        if(i <= word1.length -1){
            res += word1[i]
        }
        if(i <= word2.length-1){
            res += word2[i]
        }
    }
    return res
}