package arrays_medium

import kotlin.math.abs

fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
    val prefix = MutableList(nums.size) { 0 }
    val res = mutableListOf<Int>()
    prefix[0] = nums[0]
    for(i in 1 until nums.size){
        prefix[i] = prefix[i-1] + nums[i]
    }
    val suffix = MutableList(nums.size) { 0 }
    suffix[nums.size-1] = nums[nums.size-1]
    for(i in nums.size-2 downTo 0){
        suffix[i] = suffix[i+1] + nums[i]
    }

    val size = nums.size - 1
    for(i in 0 until nums.size){

        val prefix = if(i == 0) 0 else prefix[i-1]
        val suffix = if(i == nums.size-1) 0 else suffix[i+1]
        val sum1 = abs(prefix - (i*nums[i]))
        val sum2 = abs(suffix- (size-i)*nums[i])
        if(i ==0 ){
            println(sum1)
            println(sum2)
        }
        res.add(sum1+sum2)
    }
    return res.toIntArray()
}