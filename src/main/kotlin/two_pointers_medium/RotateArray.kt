package two_pointers_medium

fun rotate(nums: IntArray, k: Int): Unit {
    var l = 0
    var r = nums.size - 1

    while (l < r) {
        nums[l] = nums[r]
        l++
        r--
    }

    l = 0
    r = k-1
    while (l < r) {
        nums[l] = nums[r]
        l++
        r--
    }

    l= k
    r = nums.size -1
    while (l < r) {
        nums[l] = nums[r]
        l++
        r--
    }

}