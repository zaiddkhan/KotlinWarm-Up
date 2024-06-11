package arrays_easy

fun countStudents(students: IntArray, sandwiches: IntArray): Int {
    val count = mutableMapOf<Int,Int>()
    students.forEach {
        if(count[it] == null){
            count[it] = 1
        }else{
            count[it] = count[it]!! + 1
        }
    }
    sandwiches.forEach {
        if(count[it] != null && count[it]!! > 0 ){
            count[it] = count[it]!! - 1
        }else{
            return count.values.sum()
        }
    }
    return count.values.sum()
}