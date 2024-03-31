package codewars

fun decodeMorse(code: String): String {

    val MorseCode = mutableMapOf<String,String>()
    MorseCode["...."] = "H"
    MorseCode["."] = "E"
    MorseCode["-.--"] = "Y"
    MorseCode[".---"] = "J"
    MorseCode["..-"] = "U"
    MorseCode["-.."] = "D"
    var spaceCount = 0
    var lastIndex = 0
    var ans = ""

    code.forEachIndexed{ index, c ->

        if(c == ' '){
            spaceCount++
        }else{
            if(spaceCount == 1){
                val word = code.substring(lastIndex,index)
                lastIndex = index
                ans += MorseCode[word.trim()] ?: ""

            }else if(spaceCount>1) {
                val word = code.substring(lastIndex,index)
                lastIndex = index
                ans += "${MorseCode[word.trim()]} "
            }
            spaceCount = 0
        }

    }
    val last = code.length
    val subs = code.substring(lastIndex,last)
    if(!subs.isNullOrEmpty()){
        ans += MorseCode[subs.trim()]
    }
    return ans

}