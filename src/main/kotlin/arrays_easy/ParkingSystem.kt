package arrays_easy

class ParkingSystem(big: Int, medium: Int, small: Int) {

    private var bigSpace = big
    private var mediumSpace = medium
    private var smallSpace = small
    fun addCar(carType: Int): Boolean {
       return when(carType){
            1 -> {
                if(bigSpace == 0)  false else {
                    bigSpace--
                    true
                }
            }
            2 -> {
                if(mediumSpace == 0)  false else {
                    mediumSpace--
                    true
                }

            }
            3 -> {
                if(smallSpace == 0 ) false else{
                    smallSpace--
                    true
                }
            }
           else -> {
               false
           }
        }
    }

}