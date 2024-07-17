package two_pointers_easy

fun sortArrayByParity(nums: IntArray): IntArray {
    var l = 0
    var r = nums.size -1
    while(l <= r){
        if(nums[l] % 2 != 0 && nums[r] % 2 == 0){
            val temp = nums[l]
            nums[l] = nums[r]
            nums[r] = temp
            l++
            r--
        }else if(nums[l] % 2 == 0){
            l++
        }else if(nums[r] % 2 != 0){
            r--
        }
    }
    return nums
}