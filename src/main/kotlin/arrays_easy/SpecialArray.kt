package arrays_easy


fun specialArray(nums: IntArray): Int {
    for(i in 0..nums.size){
        var count = 0
        for(j in 0..nums.size-1){
            if(nums[j] >= i){
                count++
            }
        }
        if(count == i) return i


    }

    return -1
}