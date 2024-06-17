import arrays_easy.*
import arrays_medium.*
import codewars.chooseBestSum
import hackerrank.*
import memoizations.canSum
import memoizations.getFib
import memoizations.gridTraveller
import java.util.Calendar


fun main(args : Array<String>){

    var obj = NumMatrix(arrayOf(
            intArrayOf(3, 0, 1, 4, 2),
            intArrayOf(5, 6, 3, 2, 1),
            intArrayOf(1, 2, 0, 1, 5),
            intArrayOf(4, 1, 0, 1, 7),
            intArrayOf(1, 0, 3, 0, 5)
    ))
    var param_1 = obj.sumRegion(2, 1, 4, 3)
    var param_2 = obj.sumRegion(1, 1, 2, 2)
    var param_3 = obj.sumRegion(1, 2, 2, 4)

    println(param_1)
    println(param_2)
    println(param_3)

}


