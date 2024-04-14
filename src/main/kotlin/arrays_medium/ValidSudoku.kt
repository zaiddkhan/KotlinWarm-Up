package arrays_medium

import codewars.multiplyDigits

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rows = MutableList(9, {
        mutableSetOf<Char>()
    })
    val column = MutableList(9,{
        mutableSetOf<Char>()
    })
    val grid = MutableList(9,{
        mutableSetOf<Char>()
    })


    for(i in 0 until board.size){
        for (j in 0 until board[0].size){
            if(board[i][j] != '.') {
                if (rows[i].add(board[i][j])) {
                    rows[i] = (rows[i] + board[i][j]).toMutableSet()
                }else{
                    return false
                }
                if(column[j].add(board[i][j])){
                    column[j] = (column[j] + board[i][j]).toMutableSet()
                }else{
                    return false
                }

                val matrixRowIndex = i/ 3
                val matrixColumnIndex = j / 3


                if(grid[(matrixRowIndex*3) + matrixColumnIndex].add(board[i][j])){
                    grid[(matrixRowIndex*3) + matrixColumnIndex] =
                            (grid[(matrixRowIndex*3) + matrixColumnIndex] + board[i][j]).toMutableSet()
                }else{
                    return false
                }

            }


        }


    }
    return true
}