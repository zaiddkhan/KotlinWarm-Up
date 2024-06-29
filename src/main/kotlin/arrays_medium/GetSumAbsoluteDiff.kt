package arrays_medium

import kotlin.math.abs

fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
    val res = mutableListOf<Int>()
    val mapp = mutableMapOf<Pair<Int,Int>,Int>()

    nums.forEachIndexed {  ind1,num->
        var numsz = 0
        nums.forEachIndexed { ind2,i ->
            if(mapp[Pair(num,i)] != null){
                numsz += mapp[Pair(num,i)]!!
            }else{
                println("$num $i")
                val ans = abs(num-i)
                mapp[Pair(num,i)] = ans
                numsz += ans
            }




        }
        res.add(numsz)



    }
    return res.toIntArray()
}