package arrays_easy

fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
    var mapp = mutableMapOf<Int,Int>()
    mapp[0] = -1
    var total = 0
    nums.forEachIndexed { index, i ->
        total += i
        val r = total % k
        if(r !in mapp){
            mapp[r] = index
        }else if(index - mapp[r]!! > 1){
            return  true
        }
    }
    return false

}