class ReservationController {
    val printer = Printer()
    val dataread = DataReader()
    val reservationlist = mutableListOf<Reservation>()


    fun createreservation(customer: Customer, room: Room) {

        printer.apply {
            printmessage("Ingrese la fecha de inicio")
            val fechaInicio = readln()
            printmessage("Ingrese la fecha final")
            val fechaFinal = readln()
            printmessage("Ingrese el numero total de noches")
            val totalnights = readln().toInt()

            val newreservation = Reservation(fechaInicio, fechaFinal, totalnights, room, customer, false)

            reservationlist.add(newreservation)
            customer.addreservation(newreservation)
            newreservation.calculateprice()
        }

        }
        fun showreservations() {

            for (reservation in reservationlist) {
                printer.printmessage(reservation.getbookingdata())
                if (reservationlist.isEmpty()) {

                printer.printmessage("No hay habitaciones registradas")
            }else{
                var counter=1
                    for (reservation in reservationlist){
                        printer.printmessage("$counter"+ reservation.getbookingdata())
                        counter++
                    }
                }
                fun roomsarenotregistered(): Boolean= reservationlist.isEmpty()





            }
        }

}









