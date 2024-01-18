package hackerrank

fun countingSort(arr: Array<Int>): Array<Int> {
    val res = Array(100){0}
    arr.forEach { i ->
        res[i] += 1
    }

    return res

}