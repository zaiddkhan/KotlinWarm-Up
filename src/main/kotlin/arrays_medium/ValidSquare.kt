package arrays_medium

import kotlin.math.abs
import kotlin.math.sqrt
import kotlin.math.pow

fun validSquare(p1: IntArray, p2: IntArray, p3: IntArray, p4: IntArray): Boolean {
    val sides = mutableListOf<IntArray>(p1,p2,p3,p4)
    val mapp = mutableMapOf<Double,Int>()
    sides.forEach {curr ->
        sides.forEach {
            if(!it.contentEquals(curr)){

                val dist = calcDistance(curr[0],it[0],curr[1],it[1])
                if(mapp[dist] == null){
                    mapp[dist] = 1
                }else{
                    mapp[dist] = mapp[dist]!! + 1
                }

            }
        }
    }
    if(mapp.keys.size != 2 || mapp.isEmpty()){
        return false
    }
    mapp.values.forEach{
        if(it != 4 && it != 8){
            return false
        }
    }

    return true
}

fun calcDistance(x1 : Int,x2 : Int,y1 :Int,y2 : Int) : Double{
    val dx = (x2 - x1).toDouble()
    val dy = (y2 - y1).toDouble()
    val ans =  sqrt(dx.pow(2) + dy.pow(2))
    return ans
}