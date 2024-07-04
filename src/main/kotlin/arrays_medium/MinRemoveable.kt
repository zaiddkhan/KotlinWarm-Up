package arrays_medium

import java.util.*

fun minRemoveToMakeValid(s: String): String {
    val ans = s.toCharArray().toMutableList()
    val pairs= mutableListOf<Pair<Char,Int>>()
    val stack = Stack<Pair<Char,Int>>()

    s.forEachIndexed { index,i ->
        if(i == '(' || i== ')'){
            val pair = Pair(i,index)
            pairs.add(pair)
        }
    }
    pairs.forEachIndexed { index,i  ->
        if(index > 0){
            if(i.first == ')' && stack.last().first == '('){
                stack.pop()
            }else
                stack.push(i)
        }else
            stack.push(i)

    }

    val seconds = stack.map {
        it.second
    }
    val filteredList = ans.filterIndexed { index, _ -> index !in seconds }


    return  filteredList.joinToString("")
}