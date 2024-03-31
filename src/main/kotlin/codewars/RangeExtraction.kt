package codewars

import java.lang.StringBuilder

fun rangeExtraction(arr: IntArray): String {
    val ans = StringBuilder("")
    var startPointer = 0
    var endPointer = 0
    for(i in 0 until  arr.size-1){
        if(arr[i]+1 == arr[i+1]){
            endPointer++
        }else{
            if(endPointer == startPointer){
                ans.append("${arr[startPointer]},")
            }else if(endPointer > startPointer){
                if(arr[endPointer] - arr[startPointer] >= 2){
                    ans.append("${arr[startPointer]}-${arr[endPointer]},")
                }else{
                    ans.append("${arr[startPointer]},${arr[endPointer]},")
                }
            }
            startPointer = i+1
            endPointer = i+1
        }
    }

    if(endPointer > startPointer){
        if(arr[endPointer] - arr[startPointer] >= 2){
            ans.append("${arr[startPointer]}-${arr[endPointer]}")
        }else{
            ans.append("${arr[startPointer]},${arr[endPointer]}")
        }
    }else{
        ans.append("${arr[startPointer]}")
    }
    return ans.toString()
}

