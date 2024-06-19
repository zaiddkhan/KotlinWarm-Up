package arrays_easy

import java.math.BigInteger

fun arraySign(nums: IntArray): Int {

    val bigIntegerArray: Array<BigInteger> = nums.map { it.toBigInteger() }.toTypedArray()


    val res = bigIntegerArray.reduce { acc, i ->
        println("$acc $i")
        i * acc
    }
    return (res.compareTo(BigInteger.ZERO))


}