class Room (
    val numroom: Int,
    val type: String,
    val capacity: String ,
    val price: Double ,
    val isAvailable: Boolean)
{
    fun getdata(): String {
        return "Numero de habitacion:$numroom Precio por noche$price Capacidad:$capacity Tipo:$type Disponible:${if (isAvailable) "Si" else "No"}"
    }





}



