package hackerrank


fun plusMinus(arr: Array<Int>): Unit {
    val grouped =  arr.groupBy {
        it > 0
    }
    val numberOfPositive = grouped[true]?.size
    val numberOfNegative = grouped[false]?.filter {
        it != 0
    }?.size ?: 0
    val numberOfZeros = grouped[false]?.filter {
        it == 0
    }?.size ?: 0

    val positiveRatio = numberOfPositive?.toFloat()?.div(arr.size)?.toFloat()
    val negativeRatio = numberOfNegative?.toFloat()?.div(arr.size)?.toFloat()
    val zeroRatio = numberOfZeros?.toFloat()?.div(arr.size)?.toFloat()
    println()

    println(String.format("%08.6f",positiveRatio))
    println(String.format("%08.6f",negativeRatio))
    println(String.format("%08.6f",zeroRatio))
    println("$positiveRatio $negativeRatio $zeroRatio")


}
