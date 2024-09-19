package bs_medium

fun shipWithinDays(weights: IntArray, days: Int): Int {
    var l = weights.max()
    var r = weights.sum()
    var res = 0
    fun canShip(num: Int): Boolean {
        var ships = 1
        var currCap = num
        for(w in weights){
            if(currCap - w < 0){
                ships += 1
                currCap = num
            }
            currCap -= w
        }
        return ships <= days
    }
    while (l <= r) {
        val mid = l + (r - l) / 2
        if(canShip(mid)){
            res = minOf(res,mid)
            r = mid-1
        }else{
            l = mid+1
        }
    }
    return res
}