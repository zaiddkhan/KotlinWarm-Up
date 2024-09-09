package stack_hard

class FreqStack() {

    val listt = mutableMapOf<Int,Int>()
    val stackk = ArrayDeque<Triple<Int,Int,Int>>()
    fun push(`val`: Int) {
        val freq = if(listt[`val`] == null) {
            listt[`val`] = 1
            1
        }else {
            listt[`val`] = listt.getOrDefault(`val`, 0) + 1
            listt.getOrDefault(`val`, 0)
        }
        val triple = Triple(`val`,freq,stackk.size)
        stackk.add(triple)
    }


    fun pop(): Int {

        val ele =  stackk.reversed().maxBy {
            it.second
        }
        stackk.remove(ele)
        listt[ele.first] = listt.getOrDefault(ele.first, 0) - 1
        return ele.first
    }

}