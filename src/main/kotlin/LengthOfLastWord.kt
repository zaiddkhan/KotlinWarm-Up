

    fun lengthOfLastWord(s: String): Int {
        val abs = listOf(1,2,3,4,5,6,7)
        abs.reduce { acc, i ->
            println("$acc  $i")
            i+1
        }
        s.reversed().trimStart().takeWhile {
            it != ' '
        }.let {
            if(it.length > 0){
               return it.trim().length
            }
        }
        return 0
    }
