package bs_medium

fun searchRange(nums: IntArray, target: Int): IntArray {




    fun binSearch(nums: IntArray, target: Int,leftBias : Boolean): Int {
        var l = 0
        var r = nums.size - 1
        var i = -1
        while(l <= r){
            val mid = l + (r - l) / 2
            if(target > nums[mid]){
                l = mid+1
            }else if(target < nums[mid]){
                r = mid-1
            }else{
                i = mid
                if(leftBias){
                    r = mid - 1
                }else{
                    l = mid + 1
                }
            }
        }
        return i
    }
    val left = binSearch(nums, target,true)
    val right = binSearch(nums, target,false)
    return intArrayOf(left,right)
}

