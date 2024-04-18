import arrays_easy.*
import arrays_medium.*
import hackerrank.*
import java.util.Calendar


fun main(args : Array<String>){

    val codec = Codec()

    val encoded = codec.encode("https://leetcode.com/problems/design-tinyurl")
    val decode = codec.decode(encoded)
    println(decode)


}


