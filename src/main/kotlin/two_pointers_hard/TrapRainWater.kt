package two_pointers_hard

fun trap(height: IntArray): Int {
    val leftMax = MutableList(height.size) { -1 }
    val rightMax = MutableList(height.size) { -1 }
    var lMax = height[0]
    var rMax = height[height.size-1]
    var res = 0
    for (i in 0 until  height.size - 1 ){
        if(height[i] > lMax) {
            lMax = height[i]

        }
        leftMax[i+1] = lMax

    }
    for(i in (rightMax.size - 1) downTo 1){
        if(height[i] > rMax){
            rMax = height[i]
        }
        rightMax[i-1] = rMax
    }
    for( i in 1 until height.size-1){
        res += (minOf(leftMax[i], rightMax[i]) - height[i]).coerceAtLeast(0)
    }
    return res
}
