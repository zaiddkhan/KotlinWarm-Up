package dp_medium

fun mostPoints(questions: Array<IntArray>): Long {
    val dp = MutableList(questions.size) { 0L }
    for(i in questions.size -1 downTo  0){
        if(i == questions.lastIndex || i == 0){
            dp[i] = questions[i][0].toLong()
        }else{
            val n = questions[i][1]
            val nextSolvable = if(i+n+1 <= questions.size-1)
                dp[i+n+1] else 0
            dp[i] = maxOf(dp[i+1],nextSolvable)
        }
    }
    return dp.max()
}