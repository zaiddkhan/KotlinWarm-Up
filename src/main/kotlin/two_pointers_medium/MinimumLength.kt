package two_pointers_medium

fun minimumLength(s: String): Int {
    var l =0
    var r = s.length - 1
    while (l < r && s[l] == s[r])  {
        val tmp = s[l]
        while( l<= r && s[l] == tmp){
            l++
        }
        while(l <=r && s[r] == tmp ){
            r--
        }

    }
    return (r - l + 1)
}