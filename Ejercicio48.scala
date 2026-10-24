object Ejercicio48:

    case class Inventario(
        producto: String,
        cantidad: Int
    )

    def agregar(
        inventario: Inventario,
        cantidad: Int
    ): Inventario =
        inventario.copy(
            cantidad =
                inventario.cantidad + cantidad
        )

    def main(args: Array[String]): Unit =
        val inventario1 =
            Inventario("Teclado", 10)

        val inventario2 =
            agregar(inventario1, 5)

        println(inventario1)
        println(inventario2)