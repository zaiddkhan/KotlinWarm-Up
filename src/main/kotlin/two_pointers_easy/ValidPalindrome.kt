package two_pointers_easy

fun isPalindrome2(s: String): Boolean {
    var l = 0

    val num = s.lowercase().replace("[^\\w]".toRegex(), "")

    var r = num.length - 1
    while (l <= r) {
        val char1 = num[l]
        val char2 = num[r]
        if (char1 != char2) {
            return validPalindrome(num,l,r)
        }
        l++
        r--


    }
    return true
}

fun validPalindrome(s: String,i : Int,j : Int): Boolean {
    var i = i
    var j = j
    while (i < j) {
        if (s[i] != s[j]) {
            return false;
        }
        i++;
        j--;
    }

    return true;
}