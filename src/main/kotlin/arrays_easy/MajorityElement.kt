package arrays_easy

fun majorityElement(nums: IntArray): Int {
    val ocurrence = mutableMapOf<Int,Int>()
    nums.forEach {
        if(ocurrence[it] == null) ocurrence[it] = 1 else ocurrence[it] = ocurrence[it]!! + 1

    }
    ocurrence.entries.forEach {
        if(it.value > nums.size /2){
            return it.key
        }
    }
    return 0
}