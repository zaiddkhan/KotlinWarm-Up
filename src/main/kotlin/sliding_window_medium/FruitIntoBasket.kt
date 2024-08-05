package sliding_window_medium

fun totalFruit(fruits: IntArray): Int {
    var res = 0
    val count = mutableMapOf<Int,Int>()
    var l = 0
    var total = 0
    for(i in 0..fruits.lastIndex) {
        count[fruits[i]] = count.getOrDefault(fruits[i],0)+1
        total += 1
        println(count)

        while (count.size > 2) {
            count[fruits[l]] = count[fruits[l]]!! - 1
            total -= 1
            if (count[fruits[l]] == 0) {
                count.remove(fruits[l])
            }
            l++
        }
        res = maxOf(total,res)
    }
    return res
}
