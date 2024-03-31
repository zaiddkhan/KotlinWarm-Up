package codewars
fun bouncingBall(h:Double, bounce:Double, window:Double):Int {
    if(h<=0 || bounce<0 || bounce>=1 || window>h ){
        return -1
    }else{
        var newBouncedHeight = h*bounce
        var ocurrence = 1
        while (newBouncedHeight > window){
            newBouncedHeight *= bounce
            ocurrence += 2

        }
        return ocurrence
    }
}