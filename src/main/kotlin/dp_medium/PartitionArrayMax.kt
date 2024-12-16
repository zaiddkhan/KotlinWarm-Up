package dp_medium

fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
    val dp = MutableList(k) { 0 }
    dp[0] = arr[0]
    for (i in 1 until arr.size) {
        var currMax = 0
        var maxAti = 0
        for (j in i downTo i-k){
            if(j < 0)
                break;
            currMax = maxOf(currMax, arr[j])
            val window = i - j + 1
            val currSum = currMax * window
            val subSum = if(j > 0) dp[(j-1) % k] else dp.last()
            maxAti = maxOf(maxAti, subSum+currSum)

        }

        dp[i%k] = maxAti
    }
    return dp[(arr.lastIndex) % k]

}