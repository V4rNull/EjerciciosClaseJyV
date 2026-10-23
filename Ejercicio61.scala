class Caja[A](val contenido: A):

    def obtener: A =
        contenido

    def combinar[B](otro: B): (A, B) =
        (contenido, otro)

object Ejercicio61:

    def main(args: Array[String]): Unit =
        val cajaInt: Caja[Int] = new Caja(10)
        val cajaTexto: Caja[String] = new Caja("Scala")
        val cajaBoolean: Caja[Boolean] = new Caja(true)

        println("Caja[Int] obtener: " + cajaInt.obtener)
        println("Caja[Int] combinar: " + cajaInt.combinar("Hola"))

        println("Caja[String] obtener: " + cajaTexto.obtener)
        println("Caja[String] combinar: " + cajaTexto.combinar(2026))

        println("Caja[Boolean] obtener: " + cajaBoolean.obtener)
        println("Caja[Boolean] combinar: " + cajaBoolean.combinar(3.5))