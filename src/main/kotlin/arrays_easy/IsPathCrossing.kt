package arrays_easy

fun isPathCrossing(path: String): Boolean {
    val crossedPaths = mutableSetOf<Pair<Int,Int>>()
    crossedPaths.add(Pair(0,0))
    path.forEach {
        val prev = crossedPaths.last()
        when(it){

            'E' -> {
                val new = Pair(prev.first+1, prev.second)
                if(!crossedPaths.add(new)) return true
            }
            'W' -> {
                val new = Pair(prev.first-1, prev.second)
                if(!crossedPaths.add(new)) return true
            }
            'N' -> {
                val new = Pair(prev.first, prev.second+1)
                if(!crossedPaths.add(new)) return true
            }
            'S' -> {
                val new = Pair(prev.first, prev.second-1)
                if(!crossedPaths.add(new)) return true
            }
        }

    }
    return false
}