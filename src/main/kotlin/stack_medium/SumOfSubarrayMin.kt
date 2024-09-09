package stack_medium

import java.math.MathContext
import kotlin.math.pow


fun sumSubarrayMins(arr: IntArray): Int {
    val mod = 10.0.pow(9).toInt()  + 7
    var res = 0
    val stack = ArrayDeque<Pair<Int, Int>>()

    arr.forEachIndexed { i, pair ->
        while(stack.isNotEmpty() && pair < stack.last().second) {
            val pairr = stack.removeLast()
            val left = if(stack.isNotEmpty()) pairr.first - stack.last().first else pairr.first +1
            val right = i - pairr.first
            res = (res + pairr.second * left * right) % mod
        }
        stack.addLast(Pair(i,pair))


    }
    for(i in stack.indices){
        val (j,n) = stack[i]
        val left = if(i > 0 )j - stack[i-1].first else j+1
        val right = arr.size - j
        res = (res + n * left * right) % mod
    }
    return res
}