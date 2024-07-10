package arrays_hard

fun firstMissingPositive(nums: IntArray): Int {
    val mapp = mutableMapOf<Int,Int>()
    for(i in 1..nums.size-1){
        mapp[i] = 0
    }

    for( i in nums.indices){
        if(mapp[nums[i]] == null){
            mapp[nums[i]] = 1
        }
    }
    val res = mapp.entries.find {
        it.value == 0
    }?.let {
        it.key
    } ?: nums.size
    return res
}