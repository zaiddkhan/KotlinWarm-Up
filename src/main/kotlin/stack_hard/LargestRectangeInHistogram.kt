package stack_hard

fun largestRectangleArea(heights: IntArray): Int {
    var maxArea = 0
    val stack = ArrayDeque<Pair<Int,Int>>()
    heights.forEachIndexed { index, i ->
        var start = index
        while (stack.isNotEmpty() && stack.last().second > i) {
            val (indexx,height) =  stack.removeLast()
            maxArea = maxOf(maxArea,height*(index-indexx))
            start = indexx
        }
        stack.addLast(Pair(start,i))
    }
    stack.forEachIndexed { index, i ->
        maxArea = maxOf(maxArea,i.second*((heights.size)-i.first))
    }
    return maxArea
}