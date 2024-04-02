package arrays_easy

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var placed = 0
    for(i in flowerbed.indices){
        if(flowerbed[i] == 0){
            val prev = if(i == 0) 0 else flowerbed[i-1]
            val next = if(i == flowerbed.size - 1) 0 else flowerbed[i+1]
            if(prev ==0 && next == 0){
                placed++
                flowerbed[i] = 1
            }
            if(placed == n) return true
        }
    }
    return placed >= n
}