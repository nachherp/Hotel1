class CustomerController {
    private val customerlist = mutableListOf<Customer>()
    private val dataReader = DataReader()
    private val printer = Printer()

    fun registercustomer() {
        dataReader.apply {
            printer.printmessage("Ingrese el nombre")
            val name = readln()
            printer.printmessage("Ingrese la direccion")
            val address = readstring()
            printer.printmessage("Ingrese su Telefono ")
            val number = readln().toInt()
            printer.printmessage("Ingrese su RFC")
            val rfc = readln()
            val addcustomer = Customer(name, address, rfc, number)

            customerlist.add(addcustomer)
            println("Usuario sregistrado con exito")
        }

    }

    fun showcustomer() {
        var counter = 1
        for (customer in customerlist) {
            printer.printmessage("$counter" + customer.getcustomerdata())
            counter++
        }
    }


    fun getCustomer(index: Int): Customer {
        return customerlist[index]

        fun clientsarenotregistered(): Boolean = customerlist.isEmpty()
    }
}
