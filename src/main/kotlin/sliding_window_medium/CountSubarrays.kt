package sliding_window_medium

fun countSubarrays(nums: IntArray, k: Int): Long {
    var maxCount = 0
    val num = nums.max()
    var l = 0
    var res = 0L

    for(r in nums.indices){
        if(nums[r] ==num ){
            maxCount++
        }

        while (maxCount == k){
            if(nums[l] == num){
                maxCount--
            }
            l+=1

        }
        res += l




    }
    return res
}