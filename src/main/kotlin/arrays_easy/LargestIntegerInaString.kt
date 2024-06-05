package arrays_easy

import kotlin.math.max


fun largestGoodInteger(num: String): String {
    if(num.length < 3){
        return  ""
    }
    var goodNumber = mutableListOf<String>()
    for(i in 0..num.length-3){
        var isGoodNumber = true
        val number = num.substring(i..i+2)
        for(i in 0..number.length-2){
            if(number[i] != number[i+1]){
                isGoodNumber = false
            }
        }
        if(isGoodNumber){
            goodNumber.add(number)
        }
    }
    if(goodNumber.isEmpty()){
        return  ""
    }
    var maxNumIndex = 0
    println(goodNumber)
    goodNumber.forEach {
        if(it.toInt() > goodNumber[maxNumIndex].toInt()){
            maxNumIndex = goodNumber.indexOf(it)
        }
    }


    return goodNumber[maxNumIndex]
}