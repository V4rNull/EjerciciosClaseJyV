object Ejercicio522:

    abstract class Vehiculo(
        val marca: String,
        val velocidadMaxima: Double
    ):
        def descripcion(): String

    trait Electrico:
        def tipoMotor(): String =
            "Motor eléctrico"

    trait Recargable:
        def recargar(): String =
            "Recargando batería"

    class Automovil(
        marca: String,
        velocidadMaxima: Double,
        val puertas: Int
    ) extends Vehiculo(
        marca,
        velocidadMaxima
    ):

        def descripcion(): String =
            "Automóvil " + marca + " - " + velocidadMaxima + " km/h"

    class Motocicleta(
        marca: String,
        velocidadMaxima: Double,
        val cilindrada: Int
    ) extends Vehiculo(
        marca,
        velocidadMaxima
    ):

        def descripcion(): String =
            "Motocicleta " + marca + " - " + velocidadMaxima + " km/h"

    class AutoElectrico(
        marca: String,
        velocidadMaxima: Double,
        val autonomia: Double
    ) extends Vehiculo(
        marca,
        velocidadMaxima
    ) with Electrico with Recargable:

        def descripcion(): String =
            "Auto eléctrico " + marca + " - " + velocidadMaxima + " km/h"

    def main(args: Array[String]): Unit =
        val auto = new Automovil("Toyota", 180, 4)
        val moto = new Motocicleta("Honda", 200, 600)
        val autoElectrico = new AutoElectrico("Tesla", 250, 500)

        println(auto.descripcion())
        println(moto.descripcion())
        println(autoElectrico.descripcion())
        println(autoElectrico.tipoMotor())
        println(autoElectrico.recargar())