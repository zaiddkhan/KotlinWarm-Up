package hackerrank

fun twoSum(nums: IntArray, target: Int): IntArray {
    val indexes : HashMap<Int,Int> = HashMap()
    for(i in nums.indices){
        val num = nums[i]
        val diff = target - num
        if(indexes.containsKey(diff)){
            return  intArrayOf(indexes[diff]!!,i)
        }
        indexes[num] = i
    }
    return intArrayOf()
}