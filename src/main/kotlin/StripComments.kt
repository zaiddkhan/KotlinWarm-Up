

fun solution(input: String, markers: CharArray): String {


        val lines = input.lines()
        val strippedLines = lines.map { line ->
            val commentIndex = markers.map { marker ->
                line.indexOf(marker)
            }.filter { index ->
                index != -1
            }.minOrNull()

            if (commentIndex != null && commentIndex >= 0) {
                line.substring(0, commentIndex).trimEnd()
            } else {
                line
            }
        }

        val result = strippedLines.joinToString("\n")
        return (result)
    }

