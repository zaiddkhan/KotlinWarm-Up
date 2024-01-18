package hackerrank

fun flippingMatrix(matrix: Array<Array<Int>>): Int {

    matrix.forEach {
        it.reversed().sum()
    }
    return 0

}



