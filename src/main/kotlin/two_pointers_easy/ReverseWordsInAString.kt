package two_pointers_easy

fun reverseWords(s: String): String {
    var start = 0
    val charr = s.toCharArray()
    var end = 0
    for(i in s.indices){
        if(s[i] == ' '){
            reverse(charr,start, end = i-1)
            start = i+1

        }
    }
    reverse(charr,start,s.length-1)
    return String(charr)

}

fun reverse(s: CharArray, start : Int, end : Int){
    var l = start
    var r = end
    while(l <= r){
        val temp=  s[l]
        s[l] = s[r]
        s[r] = temp
        l++
        r--
    }
}