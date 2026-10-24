trait Procesador[-A]:

    def procesar(valor: A): String

class ProcesadorAnimal extends Procesador[Animal]:

    def procesar(valor: Animal): String =
        "Procesando " + valor.nombre

object Ejercicio66:

    def main(args: Array[String]): Unit =
        val procesadorPerro: Procesador[Perro] = new ProcesadorAnimal()

        println(procesadorPerro.procesar(new Perro("Rocky")))