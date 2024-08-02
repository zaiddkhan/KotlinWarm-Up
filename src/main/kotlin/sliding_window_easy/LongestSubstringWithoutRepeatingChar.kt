package sliding_window_easy


fun lengthOfLongestSubstring(s: String): Int {
    if(s.length ==1) return 1
    var newL = ""
    var max = 0
    for(i in 0..s.length - 1) {

        for (j in i..s.length - 1) {

            if(!newL.contains(s[j])){
                newL += s[j]
            }else{
                max = maxOf(max, newL.length)
                newL = ""
                //    newL += s[j]
                break
            }
        }


    }

    return  maxOf(max, newL.length)

}
