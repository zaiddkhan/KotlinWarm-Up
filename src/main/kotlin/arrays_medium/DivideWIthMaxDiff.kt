package arrays_medium

fun divideArray(nums: IntArray, k: Int): Array<IntArray> {
    val numss = nums.sorted()
    val size = numss.size / 3

    val res = mutableListOf<IntArray>()

    for(i in numss.indices step  3){

        if(i <= numss.size - 3){
            val sub = numss.subList(i,i+3)
            if(sub.isNotEmpty() && sub.last()- sub.first()<= k){
                res.add(sub.toIntArray())
            }else{
                return arrayOf()
            }
        }
    }
    return  res.toTypedArray()
}