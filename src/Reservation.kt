class Reservation(
    private var startdate: String,
    private var enddate: String,
    private var totalnights:Int,
    private  val room: Room,
    private val customer: Customer,
    private var isCancelled:Boolean,
) {
    private var totalprice = 0.0
    fun calculateprice() {
        totalprice = room.price * totalnights
    }
        fun cancelreservation(){
            isCancelled=true

    }
    fun updatenights(totalnights: Int){
        this.totalnights= totalnights

    }
    fun gettotalprice():Double=totalprice

    fun getbookingdata(): String {
        return "Nombre del cliente${customer.getcustomerdata()} " + "Total de noches:$totalnights" +
                "Fecha de Inicio:$startdate" +
                "Fecha Final:$enddate" + "Total:$totalprice"


    }
}










