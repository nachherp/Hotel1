class RoomController {
   private val customerlist = mutableListOf<Room>()
    val dataReader= DataReader()
    val printer= Printer()

    fun registerroom(){
        dataReader.apply {
            printer.printmessage("Inserte el numero de habitacion")
            val numroom= readint()
            printer.printmessage("Inserte el tipo de habitacion")
            val type= readstring()
            printer.printmessage("Inserte la capacidad de  la habitacion")
            val capacity= readstring()
            printer.printmessage("Inserte el precio de la habitacion")
            val price= readdouble()
            printer.printmessage("Disponibilidad de la habitacion")
            val isAvailable=true
            val addroom= Room(numroom,type,capacity,price,isAvailable)
            customerlist.add(addroom)
            println("Habitacion registrada con exito")

        }
    }
    fun getroom(index:Int):Room{
        return customerlist[index]
    }
    fun showrooms(){
        for (Room in customerlist){
            printer.printmessage("")
            }

        }
    }
