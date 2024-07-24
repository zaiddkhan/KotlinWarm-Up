package two_pointers_medium

import java.lang.Math.pow
import kotlin.math.pow

fun kthGrammar(n: Int, k: Int): Int {
    var right = 2.0.pow(n.toDouble()).toInt() -1
    var left = 0
    var curr = 0
    var mid = 0
    for( i in 1..n-1){
        mid = (left + right) / 2
        if(k <= mid){
            right = mid
        }else{
            left = mid + 1
            curr = if(curr == 0) 1 else 0
        }
    }
    return curr


}