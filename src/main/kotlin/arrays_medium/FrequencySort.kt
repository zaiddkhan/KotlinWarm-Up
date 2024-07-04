package arrays_medium

fun frequencySort(s: String): String {
    val mapp = mutableMapOf<Char,Int>()
    var key = ""
    s.forEach {
        if(mapp[it] == null){
            mapp[it] = 1
        }else{
            mapp[it] = mapp[it]!! +1
        }

    }
    val list = mapp.entries.sortedByDescending {
        it.value
    }.map {mapp ->
       (1..mapp.value).forEach {
            key += mapp.key
        }
    }
    return list.joinToString("")
}