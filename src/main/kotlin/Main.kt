import hackerrank.*
import java.util.Calendar


fun main(args : Array<String>){


    val map1 = mapOf(
            "1" to  listOf(1,2,3),
            "2" to listOf(2,3,3)
    )
    val map2 = mapOf(
            "1" to  listOf(1,2,3),
            "3" to listOf(2,3,3)
    )
   println(
          addMaps(map1,map2)
   )

}


