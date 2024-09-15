package bs_easy

import kotlin.math.abs

fun sortedSquares(nums: IntArray): IntArray {
    var l = (nums.size /2)
    var r = l+  1
    var res = mutableListOf<Int>()
    while( l >= 0 && r < nums.size){
        val lSquare = abs(nums[l]) * abs(nums[l])
        val rSquare = abs(nums[r] * abs(nums[r]))
        if(lSquare < rSquare){
            res.add(lSquare)
            l--
        }else if(rSquare< lSquare){
            res.add(rSquare)
            r++
        }else{
            res.add(lSquare)
            res.add(rSquare)
            l--
            r++
        }
    }
    println("$r $l")
    if(l != -1){
        for(i in l downTo 0){
            val ss = abs(nums[i]) * abs(nums[i])
            res.add(ss)
        }
    }
    if(r != nums.size){
        for(i in r..nums.size-1){
            val ss = abs(nums[i]) * abs(nums[i])
            res.add(ss)
        }
    }
    println("$r $l")


    return res.sorted().toIntArray()
}