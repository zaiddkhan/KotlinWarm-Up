package sliding_window_easy

fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
    var count = 0
    for(i in 0.. arr.size - k){
        val arr2 = arr.toList().subList(i  , i + k )
        if(arr2.sum() >= threshold ){
            count++
        }

    }
    return count
}