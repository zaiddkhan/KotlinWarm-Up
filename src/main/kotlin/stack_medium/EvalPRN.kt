package stack_medium

fun evalRPN(tokens: Array<String>): Int {
    val ans = ArrayDeque<Int>()
    tokens.forEach {
        if (it == "+" && tokens.size > 2) {
            val num1 = ans.removeLast()
            val num2 = ans.removeLast()
            ans.addLast(num2+num1)
        }else if (it == "-") {
            val num1 = ans.removeLast()
            val num2 = ans.removeLast()
            ans.addLast(num2-num1)
        }else if (it == "*") {
            val num1 = ans.removeLast()
            val num2 = ans.removeLast()
            ans.addLast(num2*num1)
        }else if(it == "/"){
            val num1 = ans.removeLast()
            val num2 = ans.removeLast()
            ans.addLast(num2/num1)

        }else{
            ans.addLast(it.toInt())
        }
    }
    return ans[0]
}