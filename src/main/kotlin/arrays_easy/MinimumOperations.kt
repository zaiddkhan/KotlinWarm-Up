package arrays_easy


fun minOperations(s: String): Int {
    var expected = ""
    var res = 0
    s.forEach {
        if(expected.isEmpty()){
            if(it == '1')
                expected = "0"
            else expected = "1"
        }else{
            if(it.toString() != expected){
                res++
                expected = it.toString()
            }else{
                if(it == '1')
                    expected = "0"
                else expected = "1"
            }
        }
    }

    return res
}