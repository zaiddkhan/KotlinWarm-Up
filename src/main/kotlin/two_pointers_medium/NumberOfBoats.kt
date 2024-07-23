package two_pointers_medium

fun numRescueBoats(people: IntArray, limit: Int): Int {
    people.sort()
    var boatCount = 0
    var left= 0
    var right= people.size - 1
    while(left <= right){
        if(people[right] >= limit){
            boatCount++
            right--
        }else if(people[left] + people[right] <= limit){
            boatCount++
            right--
            left++
        }else{
            boatCount++
            right--
        }
    }
    return boatCount
}