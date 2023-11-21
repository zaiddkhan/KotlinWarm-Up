import java.math.BigInteger

fun lastDigit(base: BigInteger, exponent: BigInteger): Int {
    var basee = base
    var exponentt = exponent
    var result = BigInteger.ONE
    while (exponentt.signum() > 0) {
        if (exponentt.testBit(0)) result = result.multiply(basee)
        basee = basee.multiply(basee)
        exponentt = exponentt.shiftRight(1)

    }
    return result.toString().takeLast(1).toInt()
}