package arrays_medium

class NumMatrix(matrix: Array<IntArray>) {

    private val matrx = matrix
    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        var sum = 0
        for(i in col1 .. col2){
            for(j in row1 .. row2){
                sum += matrx[j][i]
            }
        }
        return sum
    }

}