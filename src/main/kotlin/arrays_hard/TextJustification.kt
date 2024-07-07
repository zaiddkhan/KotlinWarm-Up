package arrays_hard

fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
    val res = mutableListOf<String>()
    var currRow = 1
    val word = mutableListOf<String>()
    words.forEach {
        val newWordLength = word.joinToString("").length + it.length
        val numberOfSpaces = maxWidth - newWordLength
        if((newWordLength)<= maxWidth && numberOfSpaces > word.size -1){
            word.add(it)
        }else{

            val len = maxWidth - word.joinToString("").length
            var excessiveSpace = 0
            var ans = ""
            if(word.size == 1){
                excessiveSpace = maxWidth - word[0].length
            }
            else if(len % (word.size -1) != 0 ){
               excessiveSpace = (len % (word.size-1))
           }
            val numberOfSpace = if(word.size > 1) (len / (word.size-1)) else 0

            for (s in word.indices) {
                if(excessiveSpace > 0){
                    if(word.size == 1){
                        ans += word[0]
                        ans += "".padStart(numberOfSpace+excessiveSpace,' ')
                    }else {
                        ans += (word[s])
                        ans += "".padStart(numberOfSpace + 1, ' ')
                        excessiveSpace--
                    }
                }else{
                    ans += word[s]
                    if(word.lastIndex != s)
                        ans += "".padStart(numberOfSpace, ' ')
                }
            }

            res.add(ans)
            currRow++
            word.removeAll(word)
            word.add(it)
        }

    }
    if(word.isNotEmpty()){
        if(word.size == 1){
            val numberOfSpaces = maxWidth - word[0].length
            res.add(word.joinToString("").padEnd(numberOfSpaces+word[0].length,' '))
        }else{

            val lastLine = word.joinToString(" ").padEnd(maxWidth,' ')
            res.add(lastLine)

        }
    }

    res.forEach {
        println(it.length)
    }
    return res


}