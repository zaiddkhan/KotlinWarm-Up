package arrays_easy

fun getRow(rowIndex: Int): List<Int> {
    var res = listOf(1)
    for(i in 0..rowIndex-1){
        val newRow = MutableList(res.size+1){
            0
        }
        for(j in 0 .. res.size-1){
            newRow[j] += res[j]
            newRow[j+1] += res[j]

        }
        res = newRow
    }
    return res
}