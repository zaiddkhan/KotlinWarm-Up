package stack_medium

fun simplifyPath(path: String): String {


    val list = path.split("/")
    val stack = ArrayDeque<String>()
    println(list)

    list.forEachIndexed { index, s ->

        if(s == "." || s.isEmpty()) {

        }else if(s ==  ".." ){
            if(stack.isNotEmpty())
                stack.removeLast()
        }else {
            stack.add("$s")
        }
    }

    return  "/" + stack.joinToString("/")
}
