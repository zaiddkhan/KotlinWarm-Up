package arrays_medium

fun largestPerimeter(nums: IntArray): Long {
    val sortedArr = nums.sorted()
    var perr = 0L
    for(i in 1 until  sortedArr.size){
        val smaller = sortedArr.subList(0,i)
        val larger = sortedArr.subList(i+1,sortedArr.size-1)
        val elments = larger.filter {
          it >  smaller.sum()
        }.map {
            it.toLong()
        }
        var maxPerr = 0L
        elments.forEach {
            maxPerr = maxOf(maxPerr,smaller.sum()+it)
        }
        perr = maxOf(perr,maxPerr)
    }
    return perr
}