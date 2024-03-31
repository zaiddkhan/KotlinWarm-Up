package arrays_easy
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res : HashMap<String,MutableList<String>> = HashMap()
    for(s in strs){
        val count = IntArray(26)
        for(c in s){
            val index = c - 'a'
            count[index] += 1
        }
        res[count.joinToString ()] = res.getOrDefault(count.joinToString(), mutableListOf()).also {
            it.add(s)
        }
    }
    return res.values.toList()
 }
