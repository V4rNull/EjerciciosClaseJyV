def transformar[A, B](valor: A, funcion: A => B): B =
    funcion(valor)

object Ejercicio63:

    def main(args: Array[String]): Unit =
        val textoDeInt: String = transformar(10, numero => numero.toString)
        val largo: Int = transformar("Scala", texto => texto.length)
        val esMayor: Boolean = transformar(7.5, numero => numero > 5.0)

        println("Int a String: " + textoDeInt)
        println("String a Int (longitud): " + largo)
        println("Double a Boolean: " + esMayor)