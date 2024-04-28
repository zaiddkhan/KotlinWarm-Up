package arrays_medium

fun maxProfit(prices: IntArray): Int {
    val maxProfits = mutableMapOf<Int,Int>()
    for(i in 0 until prices.size - 1){
        if(prices[i] < prices[i+1]){
            var max = 0
            max = maxOf(max,prices[i+1] - prices[i])
            maxProfits[i] = max
        }
    }
    return maxProfits.values.sum()
}