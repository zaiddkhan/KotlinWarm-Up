package sliding_window_medium

import kotlin.math.abs


fun equalSubstring(s: String, t: String, maxCost: Int): Int {
    var l = 0
    var sum = 0
    var res = 1
    for(r in s.indices){
        sum += abs( s[r].code - t[r].code)
        if(sum > maxCost){
            sum -= abs( s[l].code - t[l].code)
            l ++
        }

        res = maxOf(res, (r-l)+1)

    }
    return res

}
