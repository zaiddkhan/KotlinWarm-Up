package stacks_easy


fun makeGood(s: String): String {
    val res = ArrayDeque<Char>()
    s.forEach {
        res.add(it)
        while(!res.isEmpty() && res.size > 1 && res[res.lastIndex-1] != res.last()  && (res[res.lastIndex-1] == res.last().uppercaseChar() || res[res.lastIndex-1].uppercaseChar() == res.last())){

            res.removeLast()
            res.removeLast()

        }
    }
    return res.joinToString("")
}