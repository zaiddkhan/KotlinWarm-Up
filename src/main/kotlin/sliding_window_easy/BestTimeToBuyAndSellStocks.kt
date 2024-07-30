package sliding_window_easy

fun maxProfit(prices: IntArray): Int {
    if(prices.isEmpty() || prices.size == 1) return 0
    var max = 0
    var min = prices[0]

    for(i in prices.indices) {
        min = minOf(min, prices[i])
        max = maxOf(max, prices[i] - min)
    }
    return max
}