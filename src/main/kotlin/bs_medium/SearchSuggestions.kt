package bs_medium

fun suggestedProducts(products: Array<String>, searchWord: String): List<List<String>> {
    products.sort()

    val res = mutableListOf<List<String>>()

    var l = 0
    var r=  products.lastIndex
    for(i in searchWord.indices){
        val c = searchWord[i]
        while (l <= r && (products[l].length <= i || products[l][i] != c)){
            l++
        }
        while (l <= r && (products[r].length <= i || products[r][i] != c)){
            r--
        }
        val list= mutableListOf<String>()
        val remain = r - l + 1
        for(i in 0 until  minOf(3,remain)){
            list.add(products[i+l])
        }

        res.add(list)

    }
    return res
}