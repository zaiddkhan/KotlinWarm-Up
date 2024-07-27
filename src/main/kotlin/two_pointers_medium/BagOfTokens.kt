package two_pointers_medium

    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        tokens.sort()
        var l = 0
        var r = tokens.size - 1
        var pow = power
        var score = 0
        var res = 0
        if(tokens.size == 1){
            if(power >= tokens.first()){
                score++
            }
            return score
        }

        while (l <= r) {
            if(pow >= tokens[l]){
                pow -= tokens[l]
                score++
                res = maxOf(score,res)
                l++

            }else if(score > 0 ){
                pow += tokens[r]
                score--
                res = maxOf(res,score)
                r--
            } else{
                break
            }



        }
        return res
    }


