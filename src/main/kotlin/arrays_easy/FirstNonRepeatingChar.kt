package arrays_easy

fun firstUniqChar(s: String): Int {
    val mapp = mutableMapOf<Char,Int>()
    s.forEach {
        if(mapp[it] == null){
            mapp[it] = 1
        }else{
            mapp[it] = mapp[it]!! + 1
        }
    }
    mapp.entries.forEach { map ->
        if(map.value == 1){
            return s.indexOfFirst {
                it == map.key
            }
        }
    }
    return -1
}