package arrays_medium

fun hasAllCodes(s: String, k: Int): Boolean {
    val res = mutableSetOf<String>()
    val uniqueComb = Math.pow(2.0,k.toDouble())




    for(i in 0..s.length-k) {

        val sub = s.substring(i,i+k)

        res.add(sub)

    }


    return res.size == uniqueComb.toInt()
}