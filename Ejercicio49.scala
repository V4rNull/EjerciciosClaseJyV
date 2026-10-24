object Ejercicio49:

    case class Direccion(
        ciudad: String,
        pais: String
    )

    case class Cliente(
        nombre: String,
        direccion: Direccion
    )

    def ubicacion(
        cliente: Cliente
    ): String =
        cliente match
            case Cliente(
                _,
                Direccion(_, "Bolivia")
            ) =>
                "Cliente boliviano"

            case _ =>
                "Cliente extranjero"

    def main(args: Array[String]): Unit =
        val cliente1 =
            Cliente("Ana", Direccion("La Paz", "Bolivia"))

        val cliente2 =
            Cliente("Pedro", Direccion("Lima", "Perú"))

        println(ubicacion(cliente1))
        println(ubicacion(cliente2))