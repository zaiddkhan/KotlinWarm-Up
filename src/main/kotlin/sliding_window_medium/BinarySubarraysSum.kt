package sliding_window_medium


fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
    var res = 0
    for(l in nums.indices){
        var r = l
        var currSum = nums[r]
        if(currSum == goal){
            res++
        }
        while(r < nums.size-1&&currSum <= goal ){

            r++
            currSum += nums[r]
            if(currSum == goal){
                res++
            }

        }
    }
    return res
}