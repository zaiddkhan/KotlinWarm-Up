package arrays_easy

import kotlin.math.abs
import kotlin.math.min

fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {

    var count = 0
    for(i in 0 .. tickets.size -1){
        if(i <= k){
            count += minOf(tickets[i],tickets[k])
        }else{
            count += min(tickets[i],tickets[k]-1)

        }
    }


    return count
}