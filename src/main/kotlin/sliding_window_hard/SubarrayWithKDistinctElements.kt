package sliding_window_hard

fun subarraysWithKDistinct(nums: IntArray, k: Int): Int {

    val mapp = mutableMapOf<Int,Int>()
    var res = 0
    var leftFar = 0
    var leftNear = 0
    for(r in 0..nums.lastIndex) {
        mapp[nums[r]] = mapp.getOrDefault(nums[r], 0)+1

        while(mapp.size > k){
            mapp[nums[leftNear]] = mapp.getOrDefault(nums[leftNear], 0)-1
            if(mapp[nums[leftNear]] == 0){
                mapp.remove(nums[leftNear])
            }
            leftNear++
            leftFar=leftNear
        }

        while(mapp[nums[leftNear] ]!! > 1){
            mapp[nums[leftNear]] = mapp.getOrDefault(nums[leftNear], 0) - 1
            leftNear++
        }
        if(mapp.size ==k){
            res += leftNear - leftFar +1

        }
    }

    return res

}
