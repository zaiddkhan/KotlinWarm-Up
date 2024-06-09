package arrays_easy

fun findErrorNums(nums: IntArray): IntArray {
    val mapp = mutableMapOf<Int,Int>()
    val res = mutableListOf<Int>()
    nums.forEach {
        if(mapp[it] == null){
            mapp[it] = 1
        }else{
            mapp[it] = mapp[it]!! +1
        }
    }
    mapp.entries.forEach {
        if(it.value == 2 )
        res.add(it.key)
    }
    (1..nums.size).forEach {
        if(!nums.contains(it)){
            res.add(it)
        }
    }
    return res.toIntArray()
}