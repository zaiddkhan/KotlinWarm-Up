package arrays_easy

fun numIdenticalPairs(nums: IntArray): Int {
    var pairs = 0
    for(i in 0 until nums.size){
        for(j in i+1 until nums.size){
            if(nums[i] == nums[j]){
                pairs++
            }
        }
    }
    return pairs
}