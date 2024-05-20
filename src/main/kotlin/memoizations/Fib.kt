package memoizations

fun getFib(num : Int,mutableMap: MutableMap<Int,Int>) : Int {
     if(mutableMap[num] != null) return mutableMap[num]!!
    if(num == 1)  return  1
    if(num == 2) return  1
     mutableMap[num] = getFib(num-1,mutableMap) + getFib(num-2,mutableMap)
    return mutableMap[num]!!

}