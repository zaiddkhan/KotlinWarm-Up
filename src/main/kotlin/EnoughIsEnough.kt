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