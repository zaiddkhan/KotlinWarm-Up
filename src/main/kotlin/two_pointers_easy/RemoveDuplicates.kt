package two_pointers_easy

fun removeDuplicates(nums: IntArray): Int {
    var j = 0;
    val uniques = mutableSetOf<Int>()
    for(i in 0..nums.lastIndex) {
        if(!uniques.contains(nums[i])){
            uniques.add(nums[i])
            nums[j] = nums[i]
            j++
        }
    }
    println(nums.toList())
    return j

}