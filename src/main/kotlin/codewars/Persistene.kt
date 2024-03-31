package codewars

fun persistence(num: Int) : Int {
    var newNum = multiplyDigits(num)
    var numberOfTimes = 0
    generateSequence {  }

    while (newNum >= 10){
        newNum = multiplyDigits(newNum)
        numberOfTimes++
    }
    return numberOfTimes+1

}

fun multiplyDigits(num : Int) : Int{
    var multiplicationOfDigits = 1
    var newNum = num
    while(newNum>0){
        multiplicationOfDigits *= newNum%10
        newNum /= 10
    }
    return multiplicationOfDigits
}