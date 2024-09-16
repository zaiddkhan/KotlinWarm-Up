package bs_easy

fun isPerfectSquare(num: Int): Boolean {
    var l = 0L
    var r = (num/2).toLong()
    var mid = l + (r-l)/2
    if(num == 1) return true
    while(l <= r){
        if(mid*mid == num.toLong()){
            return true
        }
        if(mid*mid < num){
            l = mid + 1
        }

        if(mid * mid > num ){
            r = mid - 1

        }
        mid = l + (r-l)/2
    }
    return false
}