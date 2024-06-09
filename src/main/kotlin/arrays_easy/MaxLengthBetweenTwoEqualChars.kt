package arrays_easy


fun maxLengthBetweenEqualCharacters(s: String): Int {
    var max = -1
    s.forEach { char ->
       val first=  s.indexOfFirst{
            it == char
        }
       val last =  s.indexOfLast {
            it == char
        }
        if(first == last && first != s.length -1){
            max = maxOf(max, -1)
        }else {
            max = maxOf((last - first)-1, max)
        }

    }
    return max
}