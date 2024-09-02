package stack_medium

import java.util.*


fun removeKdigits(num: String, k: Int): String {
    if(num.length == k) return "0"
    val stack = LinkedList<Char>()
    var count = k
    for(i in 0 until num.length){
        while(count > 0 && !stack.isEmpty() && num[i] < stack.peek()){
            stack.pop() //remove the larger int
            count--
        }
        stack.push(num[i])
    }
    repeat(count){ //pop the last k integers (largest integers)
        stack.pop()
    }
    if(stack.isEmpty()){
        return "0"
    }else{
        val sum = stack.joinToString("").reversed()
        return if(sum == "") "0" else sum.toBigInteger().toString()
    }
}