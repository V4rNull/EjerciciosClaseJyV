object Ejercicio500:

    abstract class Empleado(
        val nombre: String,
        val salarioBase: Double
    ):
        def salarioTotal: Double

    class Desarrollador(
        nombre: String,
        salarioBase: Double,
        val bono: Double
    ) extends Empleado(
        nombre,
        salarioBase
    ):

        def salarioTotal: Double =
            salarioBase + bono

    class Vendedor(
        nombre: String,
        salarioBase: Double,
        val ventas: Double
    ) extends Empleado(
        nombre,
        salarioBase
    ):

        def salarioTotal: Double =
            salarioBase + ventas * 0.05

    class Gerente(
        nombre: String,
        salarioBase: Double,
        val porcentajeBono: Double
    ) extends Empleado(
        nombre,
        salarioBase
    ):

        def salarioTotal: Double =
            salarioBase + salarioBase * porcentajeBono

    def main(args: Array[String]): Unit =
        val desarrollador = new Desarrollador("Ana", 5000, 800)
        val vendedor = new Vendedor("Luis", 3000, 20000)
        val gerente = new Gerente("Laura", 8000, 0.20)

        println(desarrollador.nombre + ": " + desarrollador.salarioTotal)
        println(vendedor.nombre + ": " + vendedor.salarioTotal)
        println(gerente.nombre + ": " + gerente.salarioTotal)