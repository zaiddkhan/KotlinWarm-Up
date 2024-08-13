package sliding_window_medium


fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    var res = 0
    for(l in nums.indices){
        var r = l
        var currProduct = nums[l]
        if(currProduct < k){
            res ++
        }
        while(r < nums.size-1 &&currProduct < k){
            r++
            currProduct *= nums[r]
            if(currProduct < k){
                res ++
            }
        }
    }
    return res

}