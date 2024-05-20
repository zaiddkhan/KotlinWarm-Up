package memoizations

fun canSum(targetSum : Int, numbers : List<Int>,map : MutableMap<Int,Boolean>) : Boolean {
    if(map[targetSum] != null) return map[targetSum]!!
    if(targetSum < 0) return false
    if(targetSum == 0) return true
    for(num in numbers){
        map[targetSum] = canSum(targetSum-num,numbers, map)
       if(map[targetSum]!!)
           return true
    }
    return false
}