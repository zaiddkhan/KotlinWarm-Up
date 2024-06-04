package arrays_easy

fun countCharacters(words: Array<String>, chars: String): Int {
    val charMap = mutableMapOf<Char,Int>()
    chars.forEach {
       if( charMap[it] != null) charMap[it] = charMap[it]!! + 1
        else charMap[it] = 1
    }
    var res = 0
    words.forEach {
        val tempMap = mutableMapOf<Char,Int>()

        var canFormed = true
        it.forEach {
            if(tempMap[it] != null) tempMap[it]= tempMap[it]!! + 1
            else tempMap[it] = 1
            if(it !in charMap || tempMap[it]!! > charMap[it]!!){
                canFormed = false

            }
        }
        if(canFormed){
            res += it.length
        }


    }
    return  res
}