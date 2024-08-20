package stacks_easy

fun calPoints(operations: Array<String>): Int {
    val stack = ArrayDeque<String>()
    operations.forEach {
        if(it == "C" && stack.isNotEmpty()){
            stack.removeLast()
        }
        else if(it == "D" && stack.isNotEmpty()){
            stack.addLast((stack.last().toInt()*2).toString())
        }
        else if(it == "+" && stack.size >= 2){
            val sum = stack.last().toInt() + stack[stack.size-2].toInt()
            stack.addLast(sum.toString())
        }else{
            stack.add(it)
        }
    }
    return stack.sumOf {
        it.toInt()
    }
}