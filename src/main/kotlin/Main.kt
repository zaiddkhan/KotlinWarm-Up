import java.util.Calendar


fun main(args : Array<String>){


    println(setAlarmAtTheNextRepeatDay(4,listOf(
        4
    ))?.get(Calendar.DAY_OF_WEEK) ?: "null")

}


