package stack_medium

fun removeDuplicates(s: String, k: Int): String {
    val stackk = ArrayDeque<Pair<Char,Int>>()
    stackk.add(Pair(s[0],1))
    for(i in 1..s.lastIndex ){
        if(stackk.isNotEmpty() && s[i] == stackk.last().first){
            val count =stackk.removeLast()
            stackk.addLast(Pair(count.first,count.second+1))
        }else{
            stackk.addLast(Pair(s[i],1))
        }

        if(stackk.last().second == k){
            stackk.removeLast()
        }
    }
    var ans = ""
    stackk.forEach {  a ->
        repeat(a.second){
            ans += a.first
        }
    }
    return ans
}
