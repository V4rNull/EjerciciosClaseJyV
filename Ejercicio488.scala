object Ejercicio488:

    trait Figura:
        def area: Double

    class Rectangulo(
        val base: Double,
        val altura: Double
    ) extends Figura:

        def area: Double =
            base * altura

    class Circulo(
        val radio: Double
    ) extends Figura:

        def area: Double =
            Math.PI * radio * radio

    class Triangulo(
        val base: Double,
        val altura: Double
    ) extends Figura:

        def area: Double =
            base * altura / 2

    def mostrarArea(
        figura: Figura
    ): Double =
        figura.area

    def main(args: Array[String]): Unit =
        val rectangulo = new Rectangulo(4, 5)
        val circulo = new Circulo(3)
        val triangulo = new Triangulo(6, 2)

        println("Rectángulo: " + mostrarArea(rectangulo))
        println("Círculo: " + mostrarArea(circulo))
        println("Triángulo: " + mostrarArea(triangulo))