fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }


    return strs.reduce { commonPrefix, currentString ->
        commonPrefix.zip(currentString).takeWhile { it.first == it.second }.unzip().first.joinToString("")
    }

}