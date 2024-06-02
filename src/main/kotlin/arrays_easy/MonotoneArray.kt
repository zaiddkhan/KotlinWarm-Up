package arrays_easy

import kotlin.math.abs

fun isMonotonic(nums: IntArray): Boolean {
    var isInAsc : Boolean? = null
    for(i in 0 until  nums.size-1){
        if(isInAsc == null){
            if(nums[i+1] > nums[i]){
                isInAsc = true
            }else if(nums[i+1] < nums[i]){
                isInAsc = false
            }
        }else{
            if(isInAsc!!){
                if(nums[i+1] < nums[i]){
                    return false
                }
            }else {
                if(nums[i+1] > nums[i]){
                    return false
                }
            }
        }

    }
    return true
}