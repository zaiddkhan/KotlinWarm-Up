package arrays_easy

class NumArray( nums: IntArray) {

    val numsArr = nums
    fun sumRange(left: Int, right: Int): Int {
       return numsArr.slice(left..right).sum()
    }

}

//optimised way.
//val prefix = IntArray(nums.size)
//
//init {
//    var sum = 0
//    for((i,v) in nums.withIndex()) {
//        sum += v
//        prefix[i] = sum
//    }
//}
//
//fun sumRange(left: Int, right: Int): Int {
//    val prefixR = prefix[right]
//    val prefixL = if(left == 0) 0 else prefix[left - 1]
//    return prefixR - prefixL
//}
