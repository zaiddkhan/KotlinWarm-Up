package arrays_easy

fun maxScore(s: String): Int {
    var max = 0
    for (i in 0..s.length-2){
        val left = s.substring(0..i)
        val right = s.substring(i+1..s.length-1)
        println("$left  $right" )
        val count = left.count {
            it == '0'
        } + right.count {
            it == '1'
        }
        max = maxOf(count,max)
    }
    return max
}