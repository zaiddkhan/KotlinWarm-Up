package stack_medium

import java.util.*

fun decodeString(s: String): String {

    val stack = LinkedList<String>()

    for(char in s){
        if(char == ']'){
            val sb = StringBuilder()
            while (stack.isNotEmpty() && stack.peekLast() != "[")
                sb.insert(0, stack.removeLast())
            stack.removeLast()

            val k = StringBuilder()
            while (stack.isNotEmpty() && stack.peekLast().all { char -> char.isDigit() })
                k.insert(0, stack.removeLast())

            val times = k.toString().toInt()
            stack.addLast(sb.toString().repeat(times))
        }else{
            stack.add(char.toString())
        }

    }
    return stack.joinToString("")

}
