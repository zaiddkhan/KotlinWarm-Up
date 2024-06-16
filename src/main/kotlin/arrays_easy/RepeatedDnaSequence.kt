package arrays_easy

fun findRepeatedDnaSequences(s: String): List<String> {
    val mapp = mutableMapOf<String,Int>()
    val res = mutableListOf<String>()
    s.forEachIndexed { index, c ->
        if(index <= s.length-10) {
            val sub = s.substring(index, index + 10)
            if (mapp[sub] != null)
                mapp[sub] = mapp[sub]!! + 1
            else
                mapp[sub] = 1
        }

    }
    mapp.entries.forEach {
        if(it.value >1){
            res.add(it.key)
        }
    }

    return res

}