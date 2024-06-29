package arrays_medium

fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
        val glasses = Array(query_row + 1) { DoubleArray(query_row + 1) }
        glasses[0][0] = poured.toDouble()

        for (r in 0 until query_row) {
            for (c in 0..r) {
                if (glasses[r][c] > 1) {
                    val overflow = (glasses[r][c] - 1) / 2.0
                    glasses[r + 1][c] += overflow
                    glasses[r + 1][c + 1] += overflow
                    glasses[r][c] = 1.0
                }
            }
        }

        return if (glasses[query_row][query_glass] > 1) 1.0 else glasses[query_row][query_glass]


}