package arrays_medium.bs_hard

import sliding_window_medium.minSubArrayLen

fun splitArray(nums : IntArray,k : Int) : Int {
    var l = nums.max()
    var r = nums.sum()
    fun canSplit(largest : Int) : Boolean{
        var subArray = 0
        var currSum = 0
        for(i in nums ){
            currSum += i
            if(currSum > largest){
                subArray += 1
                currSum = i

            }
        }
        return subArray +1 <= k
    }
    var res = r
    while(l <= r) {
        val mid = l + (r - l) / 2
        if(canSplit(mid )){
            res = mid
            r = mid - 1
        }else{
            l = mid + 1
        }
    }

    return res


}