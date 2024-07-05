package arrays_medium

import java.util.Stack
import kotlin.math.abs

fun findMaxLength(nums: IntArray): Int {

    var numZero = 0
    var numOne = 0
    var max = 0
    val mapp = mutableMapOf<Int,Int>()

    nums.forEachIndexed { index, i ->
        if(i == 0){
            numZero++
        }else{
            numOne++
        }
        if(mapp[numOne - numZero] == null){
            mapp[numOne - numZero] = index
        }
        if(numZero == numOne){
            max = numZero + numOne
        }else{
            val index2 = mapp[numOne-numZero]!!
            max = maxOf(max,index-index2)
        }

    }

    return max

}