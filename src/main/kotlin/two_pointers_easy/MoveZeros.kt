package two_pointers_easy

fun moveZeroes(nums: IntArray): Unit {
    var j = 0
    for(i in nums.indices) {
        if (nums[i] != 0) {
            nums[j] = nums[i]
            j++
        }
    }
    for(i in j..nums.lastIndex) {
        nums[i] = 0
    }
}