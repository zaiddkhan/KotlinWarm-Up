import kotlin.concurrent.fixedRateTimer
import kotlin.math.pow
import kotlin.math.sqrt


object TourTest {
    fun tour(arrFriends: Array<String>, ftwns: Array<Array<String>>, h: Map<String, Double>): Int {

        println(arrFriends.toList())


        //the friends should be visited in the order of the arrFriends array
        val sortedArray = ftwns
            .filter{
                println(it[0])
               arrFriends.contains(it[0])
            }.sortedBy {
            arrFriends.indexOf(it[0]) }
            .toTypedArray()
        println(sortedArray[0].size)


        val g = h.keys
            .filter{ key ->
                sortedArray.any{
                    it[1].contains(key)
                }
            }.sortedBy {key ->
            sortedArray.indexOfFirst {
               it[1] == key
            }
        }
        println(g)

        val distances = g.map {
            h[it]
        }
        println(distances)



        var totalDistance = 0.0


        distances.forEachIndexed { index, d ->
            if(index < distances.size-1) {
                totalDistance += (sqrt((distances[index+1]?.pow(2) ?: 0.0) - (d?.pow(2) ?: 0.0)))
            }
        }


        totalDistance += distances.first() ?: 0.0
        totalDistance += distances.last() ?: 0.0

        return totalDistance.toInt()
    }

    /**
     * Best solutions
     * 1. object Tour {
     *
     *     fun tour(arrFriends: Array<String>, ftwns: Array<Array<String>>, h: Map<String, Double>): Int {
     *
     *         val towns = ftwns.map{Pair(it[0],it[1])}.toMap()
     *         val visits = arrFriends.mapNotNull{towns.get(it)}
     *         val distances = visits.mapNotNull{h.get(it)}.toMutableList().apply{add(last())}
     *         val circuit = mutableListOf<Double>().apply{addAll(distances)}
     *
     *         if(distances.size>1) (1..distances.size-2).forEach {ind->
     *                 val a = distances[ind-1]
     *                 val c = distances[ind]
     *                 val b = Math.sqrt(c*c-a*a)
     *                 circuit[ind] = b
     *         }
     *         return circuit.sum().toInt()
     *      }
     * }
     *
     *
     * 2. object Tour {
     *     fun tour(arrFriends: Array<String>, ftwns: Array<Array<String>>, h: Map<String, Double>)=ftwns.filter {it.first() in arrFriends}.map{it.last()}.let{ft->
     *         (ft.windowed(2).map{(h[it.last()]!!.sqr()-h[it.first()]!!.sqr()).sqrt()}.sum()+h[ft.first()]!!+h[ft.last()]!!).toInt()}
     * }
     *
     * fun Double.sqr() = this*this
     * fun Double.sqrt() = Math.sqrt(this)
     */
}