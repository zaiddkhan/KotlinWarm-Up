package hackerrank

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {


    //idiomatic way
//    val size = arr.size
//    val sumLeft = (0 until size).sumBy { arr[it][it] }
//    val sumRight = arr.indices.sumBy { arr[it][size - 1 - it] }
    var sumLeft =0
    var sumRight = 0

    for(i in 0 until arr.size) {
       sumLeft += arr[i][i]
    }
    for(i in  arr.size-1 downTo   0) {
        for(j in arr.indices){
            if(i + j == arr.size-1){
                sumRight += arr[j][i]
            }

        }
    }
    return (abs(sumLeft-sumRight))
}
