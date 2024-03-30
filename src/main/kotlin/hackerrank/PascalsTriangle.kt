package hackerrank

fun generate(numRows: Int): List<List<Int>> {
    val res : MutableList<MutableList<Int>> = mutableListOf()
    for(i in 1..numRows){
        val prevList = if(i-1 ==0) emptyList() else res[i-2]
        val list = mutableListOf<Int>()
        val size = i
        for(i in 0 until size){
            if(i ==0 || i == size -1){
                list.add(1)
            }else {

                list.add(i,(if (prevList.size == 1 || prevList.isEmpty()) 1 else prevList[i - 1] + prevList[i]))
            }
        }
        res.add(list)


    }
    return res
}

/*
* Cool "idiomatic" Kotlin solution, making use of Kotlins functions
*/

//fun generate(numRows: Int) = mutableListOf<List<Int>>(listOf(1)).apply {
//        for(row in 1 until numRows)
//            add(listOf(1) + this[row-1].windowed(2).map { it.sum()} + listOf(1))
//    }
