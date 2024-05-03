package arrays_medium


fun minSwaps(s: String): Int {

    val stack = ArrayDeque<Char>()
    s.forEach {
        if(it == ']' &&  stack.size >= 1 && stack.last() == '[')
            stack.removeLast()
        else
            stack.addLast(it)
    }
    if(stack.isEmpty()){
        return  0
    }
    var iters = 0
    while(stack.isNotEmpty()){
        if(stack[0] == ']' && stack.contains('[')){
            stack.remove('[')
            stack.remove(']')
            iters++
        }
    }


    println(stack.toString())
    return iters
}