package stack_medium


class MinStack() {

    val arr = ArrayDeque<Int>()
    val minStack = ArrayDeque<Int>()


    fun push(`val`: Int) {

        arr.add(`val`)
        val min = minOf(if(minStack.isNotEmpty()) minStack.last() else `val`, `val`)
        minStack.add(min)

    }

    fun pop() {


        arr.removeLast()
        minStack.removeLast()

    }

    fun top(): Int {

        return arr.last()


    }

    fun getMin(): Int {

        return minStack.last()
    }


}