package arrays_medium

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val res = mutableMapOf<Int,Int>()
    nums.forEach {
        res[it] = res[it]?.plus(1) ?: 1
    }
    if(res.values.size == 1){
        return intArrayOf(res.entries.first().key ?: 0)
    }else{
        return res.keys.sortedBy {
            res[it]
        }.reversed().take(k).toIntArray()

    }
}

//alternate better solution


fun main() {
    val nums = intArrayOf(1, 1, 1, 1, 2, 2, 3)
}

//fun topKFrequent(nums: IntArray, k: Int): IntArray {
//    val res = mutableListOf<Int>()
//
//    val count = hashMapOf<Int, Int>()
//
//    val freq = MutableList<MutableList<Int>>(nums.size + 1) {
//        mutableListOf()
//    }
//
//    for (n in nums) {
//        count[n] = count.getOrDefault(n, 0) + 1
//    }
//
//    for ((n, c) in count) {
//        freq[c].add(n)
//    }
//
//    for (i in freq.size - 1 downTo 0) {
//        for (n in freq[i]) {
//            res.add(n)
//            if (res.size == k) {
//                return res.toIntArray()
//            }
//        }
//    }
//
//    return intArrayOf()
//}
