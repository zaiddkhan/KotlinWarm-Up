package arrays_medium

fun minOperations(nums: IntArray): Int {

    val mapp = mutableMapOf<Int,Int>()
    nums.forEach {
        if(mapp[it] == null){
            mapp[it] = 1
        }else{
            mapp[it] = mapp[it]!! +1
        }
    }
    var res = 0
    mapp.values.forEach {
        var num = it
        while(num > 0){
            if(num - 3 > 3){
                num -= 3
                res++
            }else if(num - 2 > 0){
                num -= 2
                res++
            }else{
                return  -1
            }
        }

    }
   return res
}