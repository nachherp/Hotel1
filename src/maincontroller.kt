class maincontroller {

    val customerController = CustomerController()
    val reservationController = ReservationController()
    val roomcontroller= RoomController()
    val printa = Printer()
    val dataread = DataReader()


    fun showmenu() {
        printa.apply {
            printmessage("Bienvenido a la administracion del hotel")
            printmessage("1.Registrar cliente")
            printmessage("2. Mostrar los clientes registrados")
            printmessage("3. Registrar una habitacion ")
            printmessage("4. Mostrar todas las habitaciones")
            printmessage("5. Hacer una reserva")
            printmessage("6. Mostrar todas las reservas ")
            val chosenoption = dataread.readint()

            when (chosenoption) {
                1 ->{
                    customerController.registercustomer()
                    showmenu()
                }

                2 ->{
                    customerController.showcustomer()
                    showmenu()
                }
                3 -> {
                    roomcontroller.registerroom()
                    showmenu()
                }
                4 -> {
                    roomcontroller.showrooms()
                    showmenu()
                }
                5-> {
                 selectClientandRoom()
                    showmenu()
                }
                6-> {
                    reservationController.showreservations()
                }

            }

        }
    }

    fun selectClientandRoom(){
        printa.printmessage("Selecciona un cliente")
        customerController.showcustomer()
        val selectedcustomer= readln().toInt()
        val customer=customerController.getCustomer(selectedcustomer-1)

        printa.printmessage("Seleccione una habitacion")
        roomcontroller.showrooms()
        val selectedroom= readln().toInt()
        val room=roomcontroller.getroom(selectedroom-1)
        reservationController.createreservation(customer,room)
    }
}

