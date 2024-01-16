package hackerrank

fun lonelyinteger(a: Array<Int>): Int {
    val mapped = mutableMapOf<Int,Int>()
    a.forEach {
       mapped[it] = mapped.get(it)?.plus(1) ?: 1
    }

    println(a.groupingBy {
        it
    }.eachCount())



    return mapped.keys.first{
        mapped[it] == 1
    }
}
