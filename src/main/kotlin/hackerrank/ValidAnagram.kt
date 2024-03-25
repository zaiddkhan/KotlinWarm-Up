package hackerrank

fun isAnagram(s: String, t: String): Boolean {
    val sArray = createArray(s)
    val tArray = createArray(t)
    for(i in sArray.indices){
        if(sArray[i]!= 0){
            if(sArray[i] > tArray[i])
                return false
        }
        if(tArray[i] > sArray[i]){
            return false
        }
    }
    return true
}

fun createArray(c : String) : List<Int> {
    val  chars = MutableList(26) {
        0
    }
    c.forEach {char ->
        chars[char - 'a'] += 1
    }
    return chars
}

fun getConcatenation(nums : IntArray) : IntArray {
    val ans = nums+nums
    return ans
}