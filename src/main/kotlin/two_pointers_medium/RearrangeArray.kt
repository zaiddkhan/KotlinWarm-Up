package two_pointers_medium

fun rearrangeeArray(nums: IntArray): IntArray {

    val (pos,neg) = nums.partition {
        it >  0
    }
    val res = mutableListOf<Int>()
    for(i in pos.indices){
        res.add(pos[i])
        res.add(neg[i])
    }

    return res.toIntArray()

}