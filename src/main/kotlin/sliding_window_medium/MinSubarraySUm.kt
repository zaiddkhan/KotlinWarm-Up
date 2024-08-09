package sliding_window_medium

fun minSubArrayLen(target: Int, nums: IntArray): Int {


    var res = 0
    for(l in 0..nums.size-1){
        var r = l
        var currSum = 0
        while(r < nums.size){
            currSum += nums[r]
            if(currSum >= target){
                res = if(res == 0) (r-l)+1 else minOf(res,(r-l)+1)
                break
            }
            r++
        }

    }
    return res
}