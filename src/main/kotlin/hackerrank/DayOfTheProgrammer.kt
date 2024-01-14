package hackerrank


fun dayOfProgrammer(year: Int): String {
    val ans = StringBuilder()

    if(year == 1918){
        var totalDays = 46
        for(i in 3..8){
            if(i % 2== 0 && i != 8){
                totalDays += 30
            }else {
                totalDays += 31
            }
        }
        val remainingDays = 256 - totalDays;
        ans.append("$remainingDays.")
        ans.append("09")
        ans.append(".$year")
    }
    else if(year < 1918){
        var totalDays =0
        for(i in 1..8){
            if(year % 4 == 0){
                if(i == 2){
                    totalDays += 29
                }else if(i % 2== 0 && i != 8){
                    totalDays += 30
                }else {
                    totalDays += 31
                }
            }else{
                if(i == 2){
                    totalDays += 28
                }else if(i % 2== 0 && i != 8){
                    totalDays += 30
                }else {
                    totalDays += 31
                }
            }
        }
        val remainingDays = 256 - totalDays;
        ans.append("$remainingDays.")
        ans.append("09")
        ans.append(".$year")

    }else if(year > 1918){
        var totalDays =0
        for(i in 1..8){
            if(year % 4 == 0 || (year % 400 == 0 && year %100 != 0)){
                if(i == 2){
                    totalDays += 29
                }else if(i % 2== 0 && i != 8){
                    totalDays += 30
                }else {
                    totalDays += 31
                }
            }else{
                if(i == 2){
                    totalDays += 28
                }else if(i % 2== 0 && i != 8){
                    totalDays += 30
                }else {
                    totalDays += 31
                }
            }
        }
        val remainingDays = 256 - totalDays;
        ans.append("$remainingDays.")
        ans.append("09")
        ans.append(".$year")
    }
    return ans.toString()
}