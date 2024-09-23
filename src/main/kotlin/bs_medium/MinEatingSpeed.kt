package bs_medium

fun minEatingSpeed(piles: IntArray, h: Int): Int {


    var l = 1

    var r = piles.max()
    var res = r
    while (l <= r) {
        val mid = l + (r - l) / 2
        var hours = 0
        for(p in piles){
            val div = Math.ceil(p.toDouble() / mid.toDouble()).toInt()
            hours += div
        }
        if(hours <= h){
            res = minOf(res, mid)
            r = mid - 1
        }else{
            l = mid + 1
        }
    }
    return res
}