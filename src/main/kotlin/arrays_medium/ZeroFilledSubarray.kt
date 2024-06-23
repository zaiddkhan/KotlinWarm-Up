package arrays_medium

fun zeroFilledSubarray(nums: IntArray): Long {
    var l = 0L
    var r =0L
    var res = 0L
    if(nums.size == 1) {
        if(nums[0] ==0) return 1 else return 0
    }
    for(i in 1..nums.size-1){

        if(nums[i] == 0 && nums[i-1] ==0){
            r = i.toLong()
        }else if(nums[0] == 0 && i == 1){
            res += 1
        }else if(nums[i] == 0 && nums[i-1] != 0 && i<nums.size-1 && nums[i+1] != 0){
            res += 1
        }else if(i == nums.size-1 && nums[i-1] != 0 && nums[i] == 0){
            res += 1
        }
        else if(nums[i] == 0){
            r = i.toLong()
            l =i.toLong()
        }  else if(r > l){
            val size = (r + 1) - l
            res += size * (size + 1) / 2
            r = i.toLong()
            l = i.toLong()

        }


    }


    if(r > l){
        val size = (r + 1) - l
        print(size)
        res += size * (size + 1) / 2

    }
    return res
}