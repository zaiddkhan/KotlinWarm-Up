package stacks_easy

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    s.forEach { i ->
        if(i == '(' || i == '[' || i == '{'){
            stack.addLast(i)
        }else if(i == ')' && stack.isNotEmpty() && stack.last() == '('){
            stack.removeLast()
        }else if(i == '}' && stack.isNotEmpty() && stack.last() == '{'){
            stack.removeLast()
        }else if(i == ']' && stack.isNotEmpty() && stack.last() == '['){
            stack.removeLast()
        }else{
            return false
        }
    }
    return true
}