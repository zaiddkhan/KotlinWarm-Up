package dp_medium

fun mincostTickets(days: IntArray, costs: IntArray): Int {
    val dp = mutableMapOf<Int,Int>()


    fun dfs(index : Int) : Int{
        if(index == days.size){
            return 0
        }
        if(index in dp)
            return dp[index]!!

        dp[index] = Int.MAX_VALUE
        intArrayOf(1,7,30).zip(costs).forEach {
            var j = index
            while(j in days.indices && days[j] < days[index] + it.first){
                j++
            }

            dp[index] = minOf(dp[index]!!, it.second+ dfs(j))


        }
        return dp[index]!!
    }
    return dfs(0)

}
