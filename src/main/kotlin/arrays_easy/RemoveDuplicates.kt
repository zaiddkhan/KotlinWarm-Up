package arrays_easy

fun removeDuplicates(nums: IntArray): Int {
    nums.distinct()
    var lastIndex = -1
    for(i in nums.indices){

            nums[lastIndex+1] = nums[i]
            lastIndex = i


    }
    println(nums.toList().toString())
    return 1
}