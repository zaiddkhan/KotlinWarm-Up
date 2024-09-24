package bs_medium

import arrays_easy.isValid
import kotlin.math.abs
import kotlin.math.pow

fun minimizeMax(nums: IntArray, p: Int): Int {
    nums.sort()

    fun isValidNum(num: Long): Boolean {
        var i =0
        var count = 0
        while(i < nums.size - 1){
            if(abs(nums[i] - nums[i + 1]) <= num){
                count++
                i+= 2
            }else{
                i++
            }
            if(count == p)
                return true
        }
        return false
    }

    if(p == 0) return 0
    var l = 0L
    var r = 10.0.pow(9).toLong()
    var res = 10.0.pow(9).toLong()

    while(l <= r){
        val mid = l + (r - l) / 2

        if (isValidNum(mid)){
            res = mid
            r = mid - 1
        }else
            l = mid + 1
    }
    return res.toInt()
}

