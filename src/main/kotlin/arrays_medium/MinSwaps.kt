package arrays_medium

import java.util.*


fun minSwaps(s: String): Int {
    val stack = Stack<Char>()
    var mismatches = 0
    for(c in s){
        if(c == ']')
            if(!stack.isEmpty())
                stack.pop()
            else
                mismatches++
        else{
            stack.push(c)
        }
    }
    return (mismatches + 1) / 2
}