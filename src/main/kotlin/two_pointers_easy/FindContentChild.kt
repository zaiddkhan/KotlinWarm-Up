package two_pointers_easy

fun findContentChildren(g: IntArray, s: IntArray): Int {
    val gSort = g.sorted()
    val sSort = s.sorted()
    var l = 0
    var r = 0
    var i = 0
    while (i < gSort.size) {
            if (r >= s.size) {
                return l
            }
            if (sSort[r] < gSort[i]) {
                r++
            } else {
                l++
                i++
                r++
            }



    }
    return l
}