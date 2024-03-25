import kotlin.math.abs
import kotlin.math.min

fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size-1

        val mid = start+end/2
        if(target<nums[mid]){
            end = mid;
        }else if(target > nums[mid]){
            start = mid;
        }
        var minSum = Integer.MAX_VALUE
    var smalledDigit = 0

        for(i in start..end){
            if(nums[i] == target){
                return i;
            }
            val currDiff = Math.abs(target-nums[i])
            println(currDiff)
            if(currDiff <= minSum){
                minSum = currDiff
                smalledDigit = nums[i]
            }
        }
        val index = nums.indexOf(smalledDigit)
         if(index == nums.lastIndex)
             return index+1
        else
           return index
    }

