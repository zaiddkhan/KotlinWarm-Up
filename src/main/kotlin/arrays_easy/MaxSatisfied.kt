package arrays_easy

import kotlin.math.max
import kotlin.math.min

fun maxSatisfied(customers: IntArray, grumpy: IntArray, minutes: Int): Int {
    var max = 0
    for (i in 0 until customers.size - minutes + 1) {


        val sub = customers.slice(i..i + minutes - 1)

        var total = 0
        sub.forEachIndexed { index, num ->

            if (i == 0 && grumpy[index] == 1) {
                total += sub[index]
            } else if (i != 0 && grumpy[i + index] == 1) {
                total += sub[index]
            }

        }
        max = max(max, total)
    }


    return customers.filterIndexed { index, i ->
        grumpy[index] == 0
    }.sum() + max
}
