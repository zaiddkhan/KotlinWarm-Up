

object DirectionReduction {
    fun dirReduction(arr : Array<String>)  {
       val ans : MutableList<String> = arr.toMutableList()


        ans.forEachIndexed{index,dir ->
            if(index+1 < arr.size)
                while (checkIfAdjacentIsOpposite(dir,ans[index+1])) {
                    ans.remove(ans[index + 1])
                    ans.remove(dir)
                }
        }

        println(ans)
    }

    fun checkIfAdjacentIsOpposite(left: String,right : String) : Boolean {
        return if(left == "NORTH" && right == "SOUTH") true
        else if (left == "SOUTH" && right == "NORTH") true
        else if (left == "EAST" && right == "WEST") true
        else if (left== "WEST" && right== "EAST") true
        else false
    }


    fun getChunkedList(arr: Array<String>) : ArrayList<ArrayList<String>>{
      return arr.foldIndexed(ArrayList<ArrayList<String>>(arr.size / 2)) { index, acc, item ->
            if (index % 2 == 0) {
                acc.add(ArrayList(2))
            }
            acc.last().add(item)
            acc
        }
    }
    fun oppositeDirectionsTogether(list : ArrayList<String>) : Boolean {
      return if(list[0] == "NORTH" && list[1] == "SOUTH") true
        else if (list[0] == "SOUTH" && list[1] == "NORTH") true
        else if (list[0] == "EAST" && list[1] == "WEST") true
        else if (list[0] == "WEST" && list[1] == "EAST") true
        else false
    }
}