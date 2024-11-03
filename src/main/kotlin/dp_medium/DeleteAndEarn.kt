package dp_medium

fun deleteAndEarn(nums: IntArray): Int {
    val count = mutableMapOf<Int,Int>()
    nums.forEach {
        if(count[it] == null){
            count[it] = 1
        }else{
            count[it] = count[it]!! + 1
        }
    }
    val sorted = nums.toSortedSet().toList()
    var earn1 = 0
    var earn2 = 0
    for(i in 0..(sorted.size-1)){
        var currEarn  =nums[i] * sorted[nums[i]]!!
        if(i > 0 && sorted[i] == sorted[i-1]+1){
            val temp = earn2
            earn2 = maxOf(currEarn+earn1,earn2)
            earn1 = temp
        }else{

            val temp = earn2
            earn2 = currEarn+earn2
            earn1 = temp


        }
    }
    return earn2
}