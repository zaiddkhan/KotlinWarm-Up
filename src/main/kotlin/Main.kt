

fun main(args : Array<String>){

    val friends2 = arrayOf("B1", "B2")

    val fTowns2 = arrayOf(arrayOf("B1", "Y1"), arrayOf("B2", "Y2"), arrayOf("B3", "Y3"), arrayOf("B4", "Y4"), arrayOf("B5", "Y5"))
    val distTable2: MutableMap<String, Double> = HashMap()
    distTable2["Y1"] = 50.0
    distTable2["Y2"] = 70.0
    distTable2["Y3"] = 90.0
    distTable2["Y4"] = 110.0
    distTable2["Y5"] = 150.0

    println(TourTest.tour(friends2, fTowns2, distTable2))

   // longToIP(2154959208u)

}


object EnoughIsEnough {
    fun deleteNth(elements:IntArray, maxOcurrences:Int):IntArray {
        val ansList = mutableListOf<Int>()
        val elementsMap = mutableMapOf<Int,Int>()
        for(i in 0 until elements.size){
            if(elementsMap.containsKey(elements[i])){
                val ocurrence = elementsMap.getValue(elements[i])
                if(ocurrence+1 > maxOcurrences){

                }else{
                    elementsMap[elements[i]] = ocurrence+1
                    ansList.add(elements[i])
                }
            }else{
                elementsMap[elements[i]] = 1
                ansList.add(elements[i])
                println(elementsMap.toString())
            }
        }
        println(ansList.toString())
        return ansList.toIntArray()
    }
}