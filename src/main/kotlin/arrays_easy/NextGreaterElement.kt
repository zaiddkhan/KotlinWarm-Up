package arrays_easy

fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
    val res = mutableListOf<Int>()
    nums1.forEach {num ->
        nums2.find {
            it == num
        }?.let {
            val index = nums2.indexOf(it)
            if(index == nums2.size-1) res.add(-1) else {
               var max = 0
                for( i in index until nums2.size){
                    if(nums2[i] > it){
                        max = nums2[i]
                        break
                    }
                }
                if(max > it){
                    res.add(max)
                }else res.add(-1)
            }

        }
    }
    return res.toIntArray()
}

//stack alternative
//fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
//    // Create an array to store the result, initialized with -1
//    val res = IntArray(nums1.size){ -1 }
//
//    // Create a HashMap to store the indices of elements from nums1
//    val hm = HashMap<Int, Int>()
//    // Populate the HashMap with indices of elements from nums1
//    for(i in 0 until nums1.size)
//        hm[nums1[i]] = i
//
//    // Create a stack using ArrayDeque to keep track of elements from nums2
//    val stack = ArrayDeque<Int>()
//    // Traverse through each element in nums2
//    for(current in nums2){
//        // While the stack is not empty and the current element is greater than the top element of the stack
//        while(stack.isNotEmpty() && current > stack.last()){
//            // Remove the top element from the stack
//            val element = stack.removeLast()
//            // Find the index of the removed element in nums1 using the HashMap
//            val index = hm[element]!!
//            // Update the result array at the found index with the current element
//            res[index] = current
//        }
//        // If the current element exists in nums1 (meaning it's one of the elements we are looking for)
//        if(current in hm)
//        // Add it to the stack
//            stack.addLast(current)
//    }
//
//    // Return the resulting array
//    return res
//}
