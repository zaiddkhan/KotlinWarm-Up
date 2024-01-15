package hackerrank

fun miniMaxSum(arr: Array<Int>): Unit {
    // Convert array elements to Long for calculations
    val longArr = arr.map { it.toLong() }

    // Sort the array in ascending order
    val sortedArr = longArr.sorted()

    // Calculate the minimum sum (excluding the smallest element)
    val minSum = sortedArr.slice(0 until 4).sum()

    // Calculate the maximum sum (excluding the largest element)
    val maxSum = sortedArr.slice(1 until 5).sum()
    println("$minSum $maxSum")
}