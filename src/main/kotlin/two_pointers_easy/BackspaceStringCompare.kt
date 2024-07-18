package two_pointers_easy

fun backspaceCompare(s: String, t: String): Boolean {
    var result = MutableList(s.length+1) { "" }
    var result2 = MutableList(t.length+1) { "" }
    s.forEachIndexed { index, c ->
        if(c == '#'){
            if(result.size > 0){
                result.removeLast()
            }
        }else{
            result.add(c.toString())
        }
    }
    t.forEachIndexed { index, c ->
        if(c == '#'){
            if(result2.size > 0){
                result2.removeLast()
            }
        }else{
            result2.add(c.toString())
        }
    }
    return (result.joinToString("")) == (result2.joinToString(""))
}