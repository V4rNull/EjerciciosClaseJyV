object Ejercicio46:

    def posicion(
        punto: (Int, Int)
    ): String =
        punto match
            case (0, 0) =>
                "Origen"

            case (0, y) =>
                s"Eje Y: $y"

            case (x, 0) =>
                s"Eje X: $x"

            case (x, y) =>
                s"Punto ($x, $y)"

    def main(args: Array[String]): Unit =
        println(posicion((0, 0)))
        println(posicion((0, 7)))
        println(posicion((4, 0)))
        println(posicion((3, 5)))