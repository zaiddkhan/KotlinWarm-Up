package two_pointers_medium


fun minCost(colors: String, neededTime: IntArray): Int {
    var total = 0
    val nums = mutableListOf<Int>()
    nums.add(neededTime[0])
    for(i in 1..colors.length-1 ) {
        if(colors[i] == colors[i-1]){
            nums.add(neededTime[i])
        }else{
            if(nums.size > 1){
                total += nums.sorted().take(nums.size - 1).sum()
            }

            nums.removeAll(nums)
            nums.add(neededTime[i])
        }
    }
    if(nums.size > 1){
        total += nums.sorted().take(nums.size - 1).sum()
    }
    return total
}