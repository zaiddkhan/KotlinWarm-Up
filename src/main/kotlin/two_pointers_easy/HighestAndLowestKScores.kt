package two_pointers_easy


fun minimumDifference(nums: IntArray, k: Int): Int {

        val sorterdd= nums.sorted()
    var minn = sorterdd.last() - sorterdd.first()

    for(i in 0 .. nums.size-1   ){
        if(i < nums.size-1) {
            val l = sorterdd[i]
            val k = sorterdd[i + k - 1]
            minn = minOf(minn, k - l)
        }

    }


    return minn
}