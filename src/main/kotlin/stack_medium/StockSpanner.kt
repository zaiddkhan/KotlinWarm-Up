package stack_medium

class StockSpanner() {

    val stack = ArrayDeque<Pair<Int,Int>>()

    fun next(price: Int): Int {
        if(stack.isEmpty() || stack.last().first > price){
            stack.addLast(Pair(price,1))
            return 1
        }else{
            var temp =  0
            while(stack.isNotEmpty() && stack.last().first <= price){
                temp += stack.removeLast().second
            }
            stack.addLast(Pair(price,temp+1))
            return temp+1
        }
    }

}
