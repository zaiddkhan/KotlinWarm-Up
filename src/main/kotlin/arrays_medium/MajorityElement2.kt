package arrays_medium

fun majorityElement(nums: IntArray): List<Int> {
    val max = nums.size / 3
    val mapp = mutableMapOf<Int,Int>()
    nums.forEach {
        if(mapp[it] == null){
            mapp[it] = 1

        }else{
            mapp[it] = mapp[it]!! + 1
        }
    }
    return mapp.entries.filter{
        it.value > max
    }.map {
        it.key
    }
}