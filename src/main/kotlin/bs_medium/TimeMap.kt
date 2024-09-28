package bs_medium

import stack_medium.removeDuplicates

class TimeMap() {

    val mapp = mutableMapOf<String,List<Pair<Int,String>>>()
    fun set(key: String, value: String, timestamp: Int) {
        if(mapp[key] == null) {
            val pair = Pair(timestamp, value)
            mapp[key] = listOf(pair)
        }else{
            val pair = Pair(timestamp, value)
            mapp[key] = mapp[key]!! + listOf(pair)
        }
    }

    fun get(key: String, timestamp: Int): String {
        val lisst = mapp[key] ?: emptyList()
        var l = 0
        var r = lisst.size - 1
        var res = ""
        while (l <= r) {
            val mid = l + (r - l) / 2
            if(lisst[mid].first <= timestamp){
                l = mid + 1
                res = lisst[mid].second
            }else {
                 r = mid - 1
            }
        }
        return res
    }

}