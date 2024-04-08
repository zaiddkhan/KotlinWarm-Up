package arrays_easy

fun sortArray(nums: IntArray): IntArray {
   return quicksort(nums,0,nums.size-1)
}

fun quicksort(arr: IntArray, left: Int, right: Int) : IntArray {
    // If the first index less or equal than the last index
    if (left <= right) {
        // Create a Key/Pivot Element
        val key = arr[(left + right) / 2]

        // Create temp Variables to loop through array
        var i = left
        var j = right

        while (i <= j) {
            while (arr[i] < key)
                i++
            while (arr[j] > key)
                j--

            if (i <= j) {
                arr.swap(i, j)
                i++
                j--
            }
        }

        // Recursion to the smaller partition in the array after sorted above
        if (left < j) {
            quicksort(arr, left, j)
        }
        if (right > i) {
            quicksort(arr, i, right)
        }
    }
    return arr
}
fun  IntArray.swap(idx: Int, idy: Int) {
    val temp = this[idx]
    this[idx] = this[idy]
    this[idy] = temp
}