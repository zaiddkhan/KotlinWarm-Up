package dp_medium


fun maxProduct(nums: IntArray): Int {
    var res = nums.max()
    var currMin = 1
    var currMax = 1
    for (i in nums) {
        if(i == 0){
            currMin = 1

            currMax = 1
            continue
        }
        var temp =0
        temp = currMax*i
        currMax = maxOf(i* currMin, i*currMax,i)
        currMin = minOf(i* currMin, temp,i)
        res = maxOf(res,currMax)
    }
    return res
}
