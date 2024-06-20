package arrays_easy

fun findDifference(nums1: IntArray, nums2: IntArray): List<List<Int>> {
    val res = mutableListOf<MutableList<Int>>()
    val res1 = mutableListOf<Int>()
    val res2 = mutableListOf<Int>()

    nums1.forEach {
        if(!nums2.contains(it) && !res1.contains(it)){
            res1.add(it)
        }
    }
    nums2.forEach {
        if(!nums1.contains(it) && !res2.contains(it)){
            res2.add(it)
        }
    }
    res.add(res1)

    res.add(res2)
    return res


}