package stack_medium

fun dailyTemperatures(temperatures: IntArray): IntArray {
    val ans = ArrayDeque<Int>()
    ans.add(0)
    val res = MutableList(temperatures.size) { 0 }
    for ( i in 1..temperatures.size-1){
        val x = temperatures[i]
        while(ans.isNotEmpty() && temperatures[ans.last()] < x){
            res[ans.last()] = i - ans.last()
            ans.removeLast()
        }
        ans.addLast(i)
    }
    while (ans.isNotEmpty()) {
        res[ans.removeLast()] = 0
    }
    return res.toIntArray()
}