package bs_medium

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var ind = 0
    for(i in matrix.indices) {
        if(target in matrix[i]) {
            ind = i
        }
    }
    var l = 0
    var r = matrix[ind].size - 1
    while(l <= r) {
        val mid = l + (r - l) / 2
        if(matrix[ind][mid] == target) {
            return true
        }else if(matrix[ind][mid ] > target) {
            r = mid - 1
        }else {
            l = mid + 1
        }
    }
    return false
}