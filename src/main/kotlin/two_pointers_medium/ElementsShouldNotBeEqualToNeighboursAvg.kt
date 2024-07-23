package two_pointers_medium

fun rearrangeArray(nums: IntArray): IntArray {
    nums.sort()
    var left = 0
    var right = nums.size - 1
    val res = mutableListOf<Int>()

    while (left < right) {
        res.add(nums[left])
        res.add(nums[right])
        left++
        right--
    }
    if(left == right){
        res.add(nums[left])
    }
    return  res.toIntArray()
}