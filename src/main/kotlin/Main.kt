import arrays_easy.*
import arrays_medium.isValidSudoku
import arrays_medium.productExceptSelf
import arrays_medium.topKFrequent
import hackerrank.*
import java.util.Calendar


fun main(args : Array<String>){


    println(
            isValidSudoku(
                    arrayOf(
                            charArrayOf('.', '.', '.', '2', '.', '.', '.', '.', '.'),
                            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '4'),
                            charArrayOf('.', '.', '.', '8', '.', '.', '.', '.', '.'),
                            charArrayOf('.', '4', '.', '.', '.', '.', '.', '.', '8'),
                            charArrayOf('8', '.', '1', '.', '.', '.', '.', '.', '.'),
                            charArrayOf('5', '.', '.', '.', '.', '.', '.', '.', '.'),
                            charArrayOf('.', '.', '2', '.', '.', '.', '.', '.', '.'),
                            charArrayOf('.', '.', '.', '.', '.', '.', '.', '5', '.'),
                            charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.')
                    )
            )
    )

}


