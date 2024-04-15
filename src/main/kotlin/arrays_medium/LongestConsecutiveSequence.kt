package arrays_medium

import kotlin.math.max
import kotlin.math.sign

fun longestConsecutive(nums: IntArray): Int {
    if(nums.isEmpty())
        return 0
    var maxCount =1
    var tempCount = 1
    val sortedArr = nums.sorted()
    println(sortedArr)
    sortedArr.forEachIndexed { index, i ->
        if( index in 0 until sortedArr.size -1 && ((sortedArr[index+1] - sortedArr[index] == 1)) ){
            tempCount++
        }else if(index in 0 until sortedArr.size -1  && sortedArr[index+1] - sortedArr[index] == 0){

        }else{
            maxCount = max(maxCount,tempCount)
            tempCount= 1
        }
    }
    return maxCount
}