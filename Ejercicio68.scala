class Persona(val nombre: String)

class Resultado[A](
    val valor: A,
    val exitoso: Boolean,
    val mensaje: String
)

object Ejercicio68:

    def main(args: Array[String]): Unit =
        val resultadoInt: Resultado[Int] =
            new Resultado(25, true, "Operación completada")

        val resultadoTexto: Resultado[String] =
            new Resultado("Scala", true, "Texto obtenido")

        val resultadoPersona: Resultado[Persona] =
            new Resultado(new Persona("Ana"), true, "Persona encontrada")

        println("Resultado[Int]: " + resultadoInt.valor + " - " + resultadoInt.mensaje)
        println("Resultado[String]: " + resultadoTexto.valor + " - " + resultadoTexto.mensaje)
        println("Resultado[Persona]: " + resultadoPersona.valor.nombre + " - " + resultadoPersona.mensaje)