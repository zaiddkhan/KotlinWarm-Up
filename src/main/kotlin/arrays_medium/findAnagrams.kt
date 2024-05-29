package arrays_medium

import hackerrank.pageCount

fun findAnagrams(s: String, p: String): List<Int> {
    if(p.length > s.length) return emptyList()
    val pMap = mutableMapOf<Char,Int>()
    val sCount = mutableMapOf<Char,Int>()
    val result = mutableListOf<Int>()
    p.forEachIndexed { index, c ->
        pMap[p[index]] = 1 + pMap.getOrDefault(p[index],0)
        sCount[s[index]] = 1 + sCount.getOrDefault(s[index],0)

    }
    if(sCount == pMap) result.add(0)

    var l =0
    for(r in p.length until s.length){
        sCount[s[r]] = 1 + sCount.getOrDefault(s[r],0)
        sCount[s[l]] = sCount[s[l]]!! - 1


        if(sCount[s[l]] == 0){
            sCount.remove(s[l])
        }


        l +=1

        if(sCount == pMap)
            result.add(l)

    }
    return result

}