package arrays_easy

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val res = ArrayList<Int>()
    for(i in nums.indices){
        val num = Math.abs(nums[i])
        nums[num-1] = Math.abs(nums[num-1]) * -1
    }
    for((i,v) in nums.withIndex()){
        if(v > 0) res.add(i+1)
    }
    return res
//    val allArray = mutableListOf<Int>()
//    nums.indices.forEach {
//                allArray.add(it+1)
//    }
//    val res = mutableListOf<Int>()
//    allArray.forEach {
//        if(!nums.contains(it)){
//            res.add(it)
//        }
//    }
//    return res
}