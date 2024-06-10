package arrays_easy

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val sett = mutableSetOf<Int>()
    sett.addAll(nums1.toList())
    val res = mutableListOf<Int>()
    nums2.forEach {
        if(sett.contains(it)){
            res.add(it)
            sett.remove(it)
        }
    }
    return res.toIntArray()
}