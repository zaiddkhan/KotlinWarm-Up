package codewars
object PlayPass {

    fun playPass(s: String, n: Int) {
        var answerString = ""
        val alphabets = mapOf<String,Int>(
            "A" to 1,
            "B" to 2,
            "C" to 3,
            "D" to 4,
            "E" to 5,
            "F" to 6,
            "G" to 7,
            "H" to 8,
            "I" to 9,
            "J" to 10,
            "K" to 11,
            "L" to 12,
            "M" to 13,
            "N" to 14,
            "O" to 15,
            "P" to 16,
            "Q" to 17,
            "R" to 18,
            "S" to 19,
            "T" to 20,
            "U" to 21,
            "V" to 22,
            "W" to 23,
            "X" to 24,
            "Y" to 25,
            "Z" to 26
        )


        s.all{ char ->
            if(char.isLetter()){
                val currentPosition = alphabets.getValue(char.toString())
                var newAlphabet = ""
                if(currentPosition + n > 26) {
                    val circularPosition = (currentPosition + n) - 26
                    newAlphabet = getKey(alphabets,circularPosition) ?: ""
                    answerString += newAlphabet
                }else{
                    newAlphabet = getKey(alphabets, currentPosition + n) ?: ""
                    answerString += newAlphabet
                }
            }else if(char.isDigit()) {
                val newDigit = 9-char.digitToInt()
                answerString += newDigit
            }else {
                answerString += char
            }
            return@all true
        }
        println(answerString)
        var final = ""
        val charArray = answerString.toCharArray()
        var charIndex = 0
        var isFirstLetter = false
        for(i in charArray.indices){
            if(charArray[i].isLetter()){
                if(i%2 == 0){
                    final += charArray[i].uppercaseChar()
                }else{
                    final += charArray[i].lowercaseChar()
                }
                charIndex++
            }else{
                final += charArray[i]
            }
        }
        println(final.reversed())
    }
}
fun <K, V> getKey(map: Map<K, V>, target: V): K? {
    for (key in map.keys)
    {
        if (target == map[key]) {
            return key
        }
    }
    return null
}

