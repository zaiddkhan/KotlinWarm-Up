

    fun replaceElements(arr: IntArray): IntArray {
        arr.forEachIndexed { index, i ->
             if(index == arr.size - 1) {
                 arr[index] = -1
             }else {
                 arr[index] =(arr.slice(index +1 until arr.size).max())
             }
        }
        return arr
    }

    //a more optimal solution
//    val res = IntArray(arr.size)
//    var max = -1
//
//    arr.reversed().forEachIndexed { i, value ->
//        res[i] = max
//        max = maxOf(max, value)
//    }
//    return res.reversed().toIntArray()
