def seleccionarPrimero[A](primero: A, segundo: A): A =
    primero

object Ejercicio62:

    def main(args: Array[String]): Unit =
        println("Int: " + seleccionarPrimero(10, 20))
        println("String: " + seleccionarPrimero("Scala", "Java"))
        println("Double: " + seleccionarPrimero(3.5, 7.2))