package arrays_medium

import kotlin.math.pow
import kotlin.math.round

fun sequentialDigits(low: Int, high: Int): List<Int> {
    val res = mutableListOf<Int>()

    val listt = listOf(1,2,3,4,5,6,7,8,9)
    for(i in low.toString().length..high.toString().length){
        for(j in listt.indices){
            if(j <= listt.size - i) {
                val sub1 = listt.subList(j, j + i)
                val num = sub1.joinToString("").toInt()
                if(num > high){
                    return res
                }
                if(num in (low + 1) .. high){
                    res.add(num)
                }
            }
        }
    }
    return res
}