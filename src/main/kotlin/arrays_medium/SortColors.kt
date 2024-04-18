package arrays_medium

import arrays_easy.quicksort

fun sortColors(nums: IntArray): IntArray {

   var low = 0
   var high = nums.size-1
   var pointer = 0

   while(pointer <= high){
      when(nums[pointer]){
         0 -> {
            swap(low,pointer,nums)
            low++
            pointer++
         }
         1 -> {
            pointer++
         }
         2 -> {
            swap(high,pointer,nums)
            high--
         }
      }
   }
   return intArrayOf()
}
private fun swap(i: Int, j: Int, nums: IntArray){
   val temp = nums[i]
   nums[i] = nums[j]
   nums[j] = temp
}