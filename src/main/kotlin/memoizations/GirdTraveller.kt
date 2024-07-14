package memoizations

        fun gridTraveller(n : Int,m:Int,map : MutableMap<String,Int>) : Int{
            val key = "$n,$m"
            if(map[key] != null) return map[key]!!
            if(n == 1 && m == 1) return  1
            if(n == 0 || m == 0 ) return 0
            map[key] =  gridTraveller(n-1,m,map) + gridTraveller(n,m-1,map)
            return map[key]!!
        }