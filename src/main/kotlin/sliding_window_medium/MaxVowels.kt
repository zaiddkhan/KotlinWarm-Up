package sliding_window_medium


fun maxVowels(s: String, k: Int): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    var l =0
    var r = 0
    var num = 0
    var res = 0
    while(r < k-1){
        if(vowels.contains(s[r])){
            num++
        }
        r++

    }
    res = maxOf(num, res)

    while(r < s.length){

        if(vowels.contains(s[r])){
            num++
            res = maxOf(num, res)
        }
        if(vowels.contains(s[l])){
            num--
        }
        r++
        l++
        res = maxOf(num, res)
    }

    return res
}