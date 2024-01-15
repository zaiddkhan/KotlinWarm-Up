package hackerrank

fun timeConversion(s: String): String {


    val hours = s.substring(0, 2).toInt()
    val isPM = s.contains("PM")

    val formattedHours = when {
        isPM && hours != 12 -> hours + 12
        !isPM && hours == 12 -> 0
        else -> hours
    }

    return String.format("%02d%s", formattedHours, s.substring(2, 8))


}
