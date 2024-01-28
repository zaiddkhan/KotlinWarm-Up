package hackerrank


fun towerBreakers(n: Int, m: Int): Int {
    // Write your code here
    var xorResult = 0
    val heights = Array(n){
        m
    }

    // Calculate XOR of all tower heights
    for (height in heights) {
        xorResult = xorResult xor height
    }

    // If XOR result is 0, second player wins; otherwise, first player wins
    return if (xorResult == 0)  2 else 1
}