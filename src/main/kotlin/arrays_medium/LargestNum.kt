package arrays_medium


fun largestNumber(nums: IntArray): String {
    if(nums.isEmpty()) return ""
    val strs = nums.map{ it.toString() }.sortedWith( Comparator { a,b -> (b + a).compareTo(a + b) } )
    return if(strs[0][0] == '0') "0" else strs.joinToString("")
}
fun  permute(list: List<Int>): List<List<Int>> {

    if (list.isEmpty()) return listOf(list)

    val result = mutableListOf<List<Int>>()
    val toInsert = list[0]

    for (perm in permute(list.drop(1))) {
        for (i in perm.indices + 1) {
            val newPerm = perm.toMutableList()
            newPerm.add( toInsert)
            result.add(newPerm)
        }
    }
    var max = result[0].joinToString("").toInt()
    for(res in result){
        val num  = res.joinToString("").toInt()
        if(num > max){
            max = num
        }
    }

    return result
}