package arrays_medium

fun leastBricks(wall: List<List<Int>>): Int {
    val edgeCounts = mutableMapOf<Int, Int>()

    // Calculate the positions of the edges and count them
    wall.forEach { row ->
        var sum = 0
        // Skip the last brick's edge as it's the wall edge
        for (i in 0 until row.size - 1) {
            sum += row[i]
            edgeCounts[sum] = edgeCounts.getOrDefault(sum, 0) + 1
        }
    }

    // Find the maximum number of times an edge appears (i.e., the most aligned edge)
    val maxEdgeAlignment = edgeCounts.maxOfOrNull { it.value } ?: 0

    // The answer is the number of rows minus the maximum number of times an edge appears
    return wall.size - maxEdgeAlignment
}