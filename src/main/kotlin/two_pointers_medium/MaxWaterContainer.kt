package two_pointers_medium
fun maxArea(heights: IntArray): Int {
    var l = 0
    var r = heights.size-1
    var res = 0

    while (l < r){
        val containerSize = r-l
        val area = containerSize * minOf(heights[r],heights[l])

        res = maxOf(res,area)

        if(heights[l] > heights[r]){
            r--
        }else
            l++
    }
    return res

}