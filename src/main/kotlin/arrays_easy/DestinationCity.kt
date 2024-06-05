package arrays_easy


fun destCity(paths: List<List<String>>): String {
    var currDes = ""
    for(i in 0..paths.size - 1){
        if (currDes.isEmpty()) {
            currDes = paths[i][1]
        } else {
            val next = paths.firstOrNull {
                it[0] == currDes
            }
            if (next == null)
                break
            else
                currDes = paths[i][1]
        }
    }
    return currDes
}