trait Productor[+A]:

    def producir: A

trait Consumidor[-A]:

    def consumir(valor: A): String

class CriadorPerros extends Productor[Perro]:

    def producir: Perro =
        new Perro("Rocky")

class CriadorGatos extends Productor[Gato]:

    def producir: Gato =
        new Gato("Michi")

class ConsumidorAnimal extends Consumidor[Animal]:

    def consumir(valor: Animal): String =
        "Consumiendo " + valor.nombre

object Ejercicio67:

    def main(args: Array[String]): Unit =
        // Productor[Perro] <: Productor[Animal]
        val productorAnimal1: Productor[Animal] = new CriadorPerros()
        val productorAnimal2: Productor[Animal] = new CriadorGatos()

        // Consumidor[Animal] <: Consumidor[Perro] y Consumidor[Gato]
        val consumidorPerros: Consumidor[Perro] = new ConsumidorAnimal()
        val consumidorGatos: Consumidor[Gato] = new ConsumidorAnimal()

        println("Productor 1: " + productorAnimal1.producir.nombre)
        println("Productor 2: " + productorAnimal2.producir.nombre)
        println(consumidorPerros.consumir(new Perro("Max")))
        println(consumidorGatos.consumir(new Gato("Luna")))