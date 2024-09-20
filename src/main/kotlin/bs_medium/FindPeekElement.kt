package bs_medium

fun findPeakElement(nums: IntArray): Int {
    val max = nums.max() ?: 0
    var l = 0
    var r = nums.size - 1
    while (l <= r) {
        val mid = l + (r - l) / 2
        if(nums[mid] == max){
            return mid
        }else if(nums[mid+1] > nums[mid-1]){
            l = mid + 1
        }else if(nums[mid-1] > nums[mid+1]){
            r = mid - 1
        }else {
            l = mid + 1
        }

    }
    return l
}