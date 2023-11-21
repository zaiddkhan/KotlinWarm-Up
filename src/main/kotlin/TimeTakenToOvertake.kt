
fun race(v1:Int, v2:Int, g:Int) {

    val relativeSpeed = v2.toFloat()-v1.toFloat()
    val overtakeTime = g/relativeSpeed
    val hours = overtakeTime.toString().substringBefore('.').toInt()
    val minutes = (overtakeTime * 60).toInt() % 60
    val seconds = (overtakeTime * 3600).toInt() % 60



    print("$hours $minutes $seconds")
}