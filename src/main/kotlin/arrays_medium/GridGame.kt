package arrays_medium

import memoizations.gridTraveller

fun gridGame(grid: Array<IntArray>,map : MutableMap<String,Int>): Long {
    val n = grid[0].size
    val topPrefix = LongArray(n)
    val botPrefix = LongArray(n)

    for (i in 0 until n) {
        topPrefix[i] = grid[0][i].toLong()
        botPrefix[i] = grid[1][i].toLong()
        if (i > 0 ) {
            topPrefix[i] += topPrefix[i - 1]
            botPrefix[i] += botPrefix[i - 1]
        }
    }

    var result = Long.MAX_VALUE
    for(i in 0 until  n){
        val robTop = topPrefix[n-1] - topPrefix[i]
        val rob2bot = if (i > 0) botPrefix[i - 1] else 0L

        val rob2take = maxOf(
                robTop,

        )

        result = minOf(
                result,
                rob2take
        )

    }
return result

//    var nums = 0
//    if()
//    val maxNums = grid
}