package arrays_easy


fun makeEqual(words: Array<String>): Boolean {
    val mapp = mutableMapOf<String,Int>()
    var totalChars = 0
    if(words.size == 1) return true
    words.forEach {

        it.forEach {
            if(mapp[it.toString()] != null){
                mapp[it.toString()] = mapp[it.toString()]!! + 1
            }else{
                mapp[it.toString()] = 1
            }
            totalChars++
        }

    }

    mapp.values.forEach{
        if( (it % (words.size)) != 0 ){
            return false
        }
    }
    return true
}