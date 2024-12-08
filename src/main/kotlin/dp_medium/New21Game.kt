package dp_medium

fun new21Game(n: Int, k: Int, maxPts: Int): Double {
    if(k == 0 ) return 1.0
    var window = 0.0
    for(i in k..k+maxPts){
        window += if(i <= n) 1 else 0

    }

    val cache = mutableMapOf<Int, Double>()
    for(i in k-1 downTo 0){
        cache[i] = window / maxPts
        var remove = 0.0
        if(i + maxPts <= n){
            remove = cache.getOrDefault(i+maxPts,1.0)
        }
        window += cache[i]!! - remove

    }
    return cache[0]!!
}