package arrays_easy

fun pivotIndex(nums: IntArray): Int {
        nums.forEachIndexed { index, i ->
            val sumLeft = nums.slice(0 until index).sum()
            val sumRight = nums.slice(index+1 until nums.size).sum()
            if(sumRight == sumLeft){
                return index
            }
        }
    return -1
}

//alt solution
//class Solution {
//    fun pivotIndex(nums: IntArray): Int {
//        var leftSum = 0
//        var rightSum = 0
//        for(num in nums) rightSum += num
//        for(i in nums.indices){
//            if(leftSum == rightSum - nums[i] - leftSum) return i
//            leftSum += nums[i]
//        }
//        return -1
//    }
//}