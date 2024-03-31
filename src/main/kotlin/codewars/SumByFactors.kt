package codewars

import kotlin.math.sqrt


/**
* link to the question : https://www.codewars.com/kata/54d496788776e49e6b00052f/train/kotlin
 */
fun sumOfDivided(n : IntArray) : String {
    var answer = mutableListOf<String>()
    val primes = mutableMapOf<Int,Int>()
    for(i in n) {
        run {
        (1 ..i).forEach {div ->
                if (div.isPrime() && i % div == 0) {
                    primes[div] = i
                    return@run
                }
            }
        }
    }
    val sum = n.sum()
    if(sum == 0){

    }else {
        (1..sum).forEach { div ->
            if (div.isPrime() && sum % div == 0) {
                primes[div] = sum
                return@forEach
            }
        }
    }
    val sortedMap = primes.toSortedMap()
    sortedMap.forEach { (key, value) ->
        answer.add("($key $value)")
    }

    return answer.joinToString(separator ="")
}
fun Int.isPrime() : Boolean {
    if (this < 2) {
        return false
    }

    if (this == 2) {
        return true
    }

    if (this % 2 == 0) {
        return false
    }
    val sqrt = sqrt(this.toDouble()).toInt()

    for (i in 3..sqrt step 2) {
        if (this % i == 0) {
            return false
        }
    }

    return true
}