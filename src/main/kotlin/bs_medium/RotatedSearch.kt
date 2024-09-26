package bs_medium

fun search(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.lastIndex
    while (l <= r) {
        val mid = l + (r - l) / 2
        if(nums[mid] == target) return mid
        if(nums[mid] >= nums[l]) {
            if(target > nums[mid] || target < nums[l]) {
                l = mid +1
            }
            else {
                r = mid - 1
            }
        }
        else {
            if(target < nums[mid] || target > nums[r]) {
                r = mid - 1
            }else{
                l = mid + 1
            }
        }

    }
    return -1
}