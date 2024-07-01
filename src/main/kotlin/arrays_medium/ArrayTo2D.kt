package arrays_medium

fun findMatrix(nums: IntArray): List<List<Int>> {
    val mapp = mutableMapOf<Int,Int>()
    val res = mutableListOf<MutableList<Int>>()
    for(i in nums.indices){
        if(mapp[nums[i]] == null){
            if(res.isEmpty()){
                res.add(mutableListOf<Int>())
                res[0].add(nums[i])
            }else{
                res[0].add(nums[i])
            }
            mapp[nums[i]] = 0
        }else{
            val index = mapp[nums[i]]!! + 1
            if(index > res.size - 1){
                res.add(mutableListOf<Int>())
                res[index].add(nums[i])
            }else
                res[index].add(nums[i])
            mapp[nums[i]] = mapp[nums[i]]!! +1
        }
    }
    return res
}