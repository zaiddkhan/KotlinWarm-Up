package arrays_medium

import java.util.*


class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {

    val cuisiness = mutableMapOf<String,String>()
    val mapp = mutableMapOf<String, SortedSet<Pair<Int, String>>>()
    val ratingsss = mutableMapOf<String,Int>()

    init {

        for (i in foods.indices) {
            val cuisine = cuisines[i]
            val food = foods[i]
            val rating = ratings[i]

            if (mapp[cuisine] == null) {
                mapp[cuisine] = sortedSetOf(compareBy<Pair<Int, String>> { it.first }.thenBy { it.second })
            }
            mapp[cuisine]?.add(Pair(-rating, food))

            cuisiness[food] = cuisine
            ratingsss[food] = rating
        }
    }
    fun changeRating(food: String, newRating: Int) {
        val c = cuisiness[food] ?: ""
        val oldRating = ratingsss[food] ?: 1
        mapp[c]?.remove(Pair(-oldRating,food))
        mapp[c]?.add(Pair(-newRating,food))
        ratingsss[food] = newRating
    }

    fun highestRated(cuisine: String): String {
     val dd=  mapp[cuisine]
     return   dd?.first()?.second ?: ""

    }

}
