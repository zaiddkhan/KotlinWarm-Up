package two_pointers_medium

fun removeDuplicates(nums: IntArray): Int {
        val n = nums.size
        if(n <= 2) return n
        var j = 2
        for( i in 2.. n-1){
            if(nums[i] != nums[j-2]){
                nums[j] = nums[i]
                j++
            }
        }
        return j

}