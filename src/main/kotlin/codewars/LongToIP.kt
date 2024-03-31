package codewars

import kotlin.math.pow

fun longToIP(ip : UInt){
    var add = ip
    val ipAddress = mutableListOf<String>()
    var iteration = 1
    var octet = 0
    while(add > 0u){
        if(iteration == 9) {
            ipAddress.add(octet.toString())
            octet = 0
            iteration = 1
        }
        octet += (2f.pow(iteration-1) * (add % 2u).toFloat()).toInt()
        add /= 2u
        iteration += 1
    }
    if(octet > 0) ipAddress.add(octet.toString())

    if(ipAddress.size != 4) {
        for(i in 1..4 - ipAddress.size){
            ipAddress.add("0")
        }
    }
    println(ipAddress.reversed().joinToString("."))


    /**
     * Solutions :
     *
     * 1. fun longToIP(x: UInt) = (0..24 step 8).map { x shr it and 255u }.reversed().joinToString(".")
     *
     * 2. fun longToIP(ip: UInt): String {
     *     return ip.toString(radix = 2).padStart(32, '0').chunked(8).map { it.toInt(radix = 2) }.joinToString(".")
     * }
     */
}