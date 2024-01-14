package hackerrank

fun migratoryBirds(arr: Array<Int>): Int {
    val mapped = mutableMapOf<Int,Int>()

    arr.sorted().forEachIndexed{ index,num ->
        mapped[num] = mapped[num]?.plus(1) ?: 1
    }
    return  mapped.entries
            .maxWith(compareBy({ it.value }, { -it.key }))?.key ?: 0
}
