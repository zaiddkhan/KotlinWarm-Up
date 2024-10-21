package dp_medium

fun longestPalindrome(s: String): String {
    var res = ""
    var resLen = 0
    for( i in s.indices) {
        var r = i
        var l = i
        while(l>= 0 && r < s.length && s[l] == s[r]) {

            if(r - l +1 > resLen){
                res = s.substring(l,r+1)
                resLen = r - l +1
            }
            l--
            r++

        }
        l = i
        r = i+1
        while(l >= 0 && r < s.length && s[l] == s[r]){
            if(r - l +1 > resLen){
                res = s.substring(l,r+1)
                resLen = r - l +1
            }
            l--
            r++
        }
    }
    return res
}