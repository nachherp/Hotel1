class Customer (
  private val name: String,
  private val address: String,
  private val rfc:String,
  private val number: Int,
 val reservationlist:MutableList<Reservation> = mutableListOf()
){

    fun getcustomerdata(): String{
        return "$name$address$number$rfc"
    }
    fun addreservation(reservation: Reservation){
        reservationlist.add(reservation)

    }
}

