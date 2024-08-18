package sliding_window_hard


fun minOperations(nums: IntArray): Int {
    val lens = nums.size
    val sorted = nums.toSortedSet().toList()

    var res = lens
    var r = 0
    for(l in sorted.indices){
        while(r < sorted.size && sorted[r]  < sorted[l] + lens){
            r++

        }
        var window = r - l
        res = minOf(res, lens-window)

    }
    return res
}