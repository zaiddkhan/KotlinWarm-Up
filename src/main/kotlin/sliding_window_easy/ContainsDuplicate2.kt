package sliding_window_easy

import kotlin.math.abs


fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val mapp = mutableMapOf<Int,Int>()

    for (i in nums.indices) {
        if(mapp.containsKey(nums[i])) {
            if( abs(mapp[nums[i]]!! - i) <= k)
                return true
            else
                mapp[nums[i]] = i
        }else{
            mapp[nums[i]] = i
        }
    }
    return false
}