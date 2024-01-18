package hackerrank


fun caesarCipher(s: String, k: Int): String {
    var ans = ""
    val aphs = "abcdefghijklmnopqrstuvwxyz"
    val rotation = k %26
    val rotatedArray =  aphs.slice(rotation until aphs.length) +aphs.slice(0 until rotation)

    s.forEach{
        if(it.isLetter()) {
            val index = aphs.indexOf(it.lowercase())
            val replacedChar = rotatedArray[index]
            ans += if (it.isUpperCase()) replacedChar.uppercase() else replacedChar.lowercase()
        }
        else
            ans += it
    }
    return ans

}
