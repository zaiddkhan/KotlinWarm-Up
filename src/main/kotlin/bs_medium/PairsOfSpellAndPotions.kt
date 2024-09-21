package bs_medium

fun successfulPairs(spells: IntArray, potions: IntArray, success: Long): IntArray {
    val sortPotions = potions.sorted()
    var count = 0
    val res = mutableListOf<Int>()
    spells.forEachIndexed { index, i ->
        var l =  0
        var r = sortPotions.lastIndex
        while (l <= r) {
            val mid = l + (r - l) / 2
            val mul = spells[index].toLong() * sortPotions[mid].toLong()
            if(mul < success){
                l = mid + 1
            }
            if(mul >= success){
                count += (r-mid)+1
                r = mid-1
            }
        }
        res.add(count)
        count = 0
    }
    return res.toIntArray()
}