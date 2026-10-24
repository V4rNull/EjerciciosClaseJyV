object Ejercicio499:

    abstract class Animal(
        val nombre: String
    ):
        def sonido(): String

    trait Volador:
        def volar(): String =
            "Estoy volando"

    trait Nadador:
        def nadar(): String =
            "Estoy nadando"

    class Perro(
        nombre: String
    ) extends Animal(nombre):

        def sonido(): String =
            "Guau"

    class Pato(
        nombre: String
    ) extends Animal(nombre) with Volador with Nadador:

        def sonido(): String =
            "Cuac"

    class Pez(
        nombre: String
    ) extends Animal(nombre) with Nadador:

        def sonido(): String =
            "Blub"

    def main(args: Array[String]): Unit =
        val perro = new Perro("Firulais")
        val pato = new Pato("Donald")
        val pez = new Pez("Nemo")

        println(perro.nombre + ": " + perro.sonido())

        println(pato.nombre + ": " + pato.sonido())
        println(pato.nombre + ": " + pato.volar())
        println(pato.nombre + ": " + pato.nadar())

        println(pez.nombre + ": " + pez.sonido())
        println(pez.nombre + ": " + pez.nadar())