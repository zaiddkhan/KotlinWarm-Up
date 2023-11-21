package hackerrank

fun gameWithCells(n: Int, m: Int): Int {
    var steps = 0
    val graph = Array(n) { Array(m) { 1 } }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if(graph[i][j]==0){
                continue
            }
            println("$i $j")
            if(i < n-1 && j < m-1){
                graph[i][j] = 0
                graph[i][j+1] = 0
                graph[i+1][j] = 0
                graph[i+1][j+1] = 0
                steps++
            }

            if(i == n-1 && j!= m-1){
                graph[i][j+1] = 0
                steps++
            }
            if(j == m-1 && i != n-1){
                graph[i+1][j] = 0
                steps++
            }
            else if(i == n-1 && j == m-1){
                graph[i][j] = 0
                steps++
            }

        }
    }
    return steps
}