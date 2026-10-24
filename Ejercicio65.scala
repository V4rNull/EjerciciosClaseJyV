class Contenedor[+A](val valor: A)

object Ejercicio65:

    def main(args: Array[String]): Unit =
        val contenedorPerro: Contenedor[Perro] = new Contenedor(new Perro("Rocky"))
        val contenedorAnimal: Contenedor[Animal] = contenedorPerro

        println("Animal en el contenedor: " + contenedorAnimal.valor.nombre)