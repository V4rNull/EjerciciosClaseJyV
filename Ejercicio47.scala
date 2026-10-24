object Ejercicio47:

    case class Estudiante(
        nombre: String,
        nota: Double
    )

    def resultado(
        estudiante: Estudiante
    ): String =
        estudiante match
            case Estudiante(nombre, nota)
                if nota >= 90 =>
                s"$nombre: Excelente"

            case Estudiante(nombre, nota)
                if nota >= 70 =>
                s"$nombre: Aprobado"

            case Estudiante(nombre, nota)
                if nota >= 51 =>
                s"$nombre: Regular"

            case Estudiante(nombre, _) =>
                s"$nombre: Reprobado"

    def main(args: Array[String]): Unit =
        println(resultado(Estudiante("Ana", 95)))
        println(resultado(Estudiante("Luis", 75)))
        println(resultado(Estudiante("Rosa", 55)))
        println(resultado(Estudiante("Juan", 30)))