fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }

    val og = listOf(1,3,4,5,6)
    og.reduce { acc, i ->
        println(acc)
        println(i)
        i+1
    }
    return strs.reduce { commonPrefix, currentString ->
        commonPrefix.zip(currentString).takeWhile { it.first == it.second }.unzip().first.joinToString("")
    }

}