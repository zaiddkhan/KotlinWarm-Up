package sliding_window_medium


fun characterReplacement(s: String, k: Int): Int {

    var res = 0
    for(i in 'A' .. 'Z' ) {

        var count = 0
        var r = 0
        var l = 0
        while(r < s.length){
            if(i == s[r] ){
                r++
            }else if(count < k){
                count++
                r++
            }else if(s[l] == i){
                l++
            }else{
                l++
                count--
            }
            res = maxOf(res, r-l)

        }

    }
    return res

}