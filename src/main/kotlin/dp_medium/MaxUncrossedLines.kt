package dp_medium

fun maxUncrossedLines(nums1: IntArray, nums2: IntArray): Int {

    val cache = mutableMapOf<Pair<Int,Int>, Int>()

    fun dfs(i :Int,j : Int) : Int{
        if(i == nums1.size || j == nums2.size){
            return 0
        }

        if(nums1[i] == nums2[j]){
           cache[Pair(i,j)]=  1  + dfs(i+1,j+1)
        }else{
           cache[Pair(i,j)] = maxOf(dfs(i+1,j),dfs(i,j+1))

        }
        return cache[Pair(i,j)]!!

    }
    return dfs(0,0)
}