package codewars
fun formatDuration(seconds: Int): String {
    if (seconds == 0) {
        return "now"
    }

    val years = seconds / (60 * 60 * 24 * 365)
    val days = (seconds % (60 * 60 * 24 * 365)) / (60 * 60 * 24)
    val hours = (seconds % (60 * 60 * 24)) / (60 * 60)
    val minutes = (seconds % (60 * 60)) / 60
    val remainingSeconds = seconds % 60

    val durationList = mutableListOf<String>()
    if (years > 0) {
        durationList.add(if (years == 1) "1 year" else "$years years")
    }
    if (days > 0) {
        durationList.add(if (days == 1) "1 day" else "$days days")
    }
    if (hours > 0) {
        durationList.add(if (hours == 1) "1 hour" else "$hours hours")
    }
    if (minutes > 0) {
        durationList.add(if (minutes == 1) "1 minute" else "$minutes minutes")
    }
    if (remainingSeconds > 0) {
        durationList.add(if (remainingSeconds == 1) "1 second" else "$remainingSeconds seconds")
    }

    return durationList.joinToString(", ").let {
        val lastIndex = it.lastIndexOf(", ")
        if (lastIndex >= 0) {
            it.substring(0, lastIndex) + " and " + it.substring(lastIndex + 2)
        } else {
            it
        }
    }
}



