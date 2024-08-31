package stack_medium

fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
    val pairs = mutableListOf<Pair<Int,Int>>()
    position.zip(speed).forEach {
        pairs.add(Pair(it.first,it.second))
    }
    val stack = ArrayDeque<Float>()

    for (p in pairs.sortedBy {
        it.first
    }.reversed()){

       stack.addLast ((target - p.first).toFloat() / p.second.toFloat())

        if(stack.size >= 2 && stack.last() <=  stack[stack.lastIndex-1]){
            stack.removeLast()
        }


    }

    return stack.size



}