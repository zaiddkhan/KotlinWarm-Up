package stack_medium


fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
    val ans = ArrayDeque<Int>()
    var r2 = 0
    for (r1 in pushed.indices){
        ans.addLast(pushed[r1])
        if(pushed[r1] == popped[r2]){
            ans.removeLast()
            var r = ans.size-1
            r2++
            while(ans.isNotEmpty() && ans[r] == popped[r2]){
                ans.removeLast()
                r--
                r2++
            }
        }

    }
    return ans.isEmpty()

}