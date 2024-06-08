package arrays_easy

import kotlin.math.min


fun minOperations(s: String): Int {
    val zeroOne = mutableListOf<String>()
    val oneZero = mutableListOf<String>()

    s.forEachIndexed { index, c ->
        if(index % 2==0){
            zeroOne.add("0")
            oneZero.add("1")
        }else{
            zeroOne.add("1")
            oneZero.add("0")
        }

    }
    var diffOne = 0
    var diffTwo = 0
    s.forEachIndexed { index,it ->
        if(zeroOne[index] != it.toString()){
            diffOne++
        }
        if(oneZero[index] != it.toString()){
            diffTwo++
        }
    }
    return min(diffTwo,diffOne)

}