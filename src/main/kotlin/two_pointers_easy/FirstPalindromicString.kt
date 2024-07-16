package two_pointers_easy

fun firstPalindrome(words: Array<String>): String {

    return words.firstOrNull {
        isPalindrome(it)
    } ?: ""


}
fun isPalindrome(word: String): Boolean {
    var l = 0
    var r = word.length - 1
    while (l <= r) {
        if(word[l] == word[r]) {

        }else
            return false

        l++
        r--
    }
    return true
}