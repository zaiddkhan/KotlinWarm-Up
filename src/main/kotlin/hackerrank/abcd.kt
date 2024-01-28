package hackerrank


    fun duplicateZeros(arr: IntArray): IntArray {
        val ans = IntArray(arr.size)
        for(i in 0 until arr.size-1){
            ans[i] = arr[i]
            if(arr[i] == 0 && i < arr.size-1 && arr[i-1] != 0){
                arr[i+1] = 0
                continue
            }
        }

        return arr
    }
