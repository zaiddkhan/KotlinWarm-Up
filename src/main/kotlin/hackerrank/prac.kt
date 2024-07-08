package hackerrank

fun addMaps(map1: Map<String, List<Int>>, map2: Map<String, List<Int>>): Map<String, List<Int>> {
    val result = mutableMapOf<String, MutableList<Int>>()
    // Merge the first map
    for ((key, value) in map1) {
        result[key] = value.toMutableList()
    }

    // Merge map2
    for ((key, value) in map2) {
        if (result.containsKey(key)) {
            // Key already exists, merge the lists
            result[key]?.addAll(value)
        } else {
            // Key doesn't exist, add it to the result
            result[key] = value.toMutableList()
        }
    }

    return result
}
