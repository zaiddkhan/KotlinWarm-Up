package bs_medium

fun maximumRemovals(s: String, p: String, removable: IntArray): Int {


    val removed = mutableSetOf<Int>()
    fun isSub(s : String,sub : String) : Boolean {
        var i1 = 0
        var i2 = 0

        while(i1 < s.length && i2 < sub.length) {
            if(i1 in removed || s[i1] != sub[i2]) {
                i1++
                continue
            }
            i1++
            i2++
        }
        return i2 == sub.length
    }

    var res = 0
    var l = 0
    var r = removable.lastIndex
    while(l <= r){
        val mid = l + (r - l) / 2
        removed.removeAll(removed)

        removed.addAll(removable.slice(0..mid))
        if(isSub(s,p)){
            res = maxOf(res,mid+1)
            l = mid + 1
        }else{
            r= mid-1

        }
    }
    return res
}