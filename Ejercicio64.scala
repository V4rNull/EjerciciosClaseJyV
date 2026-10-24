class RegistroVehiculo[A <: Vehiculo](val vehiculo: A)

object Ejercicio64:

    def main(args: Array[String]): Unit =
        val registroAuto = new RegistroVehiculo(new Automovil("Toyota"))
        val registroMoto = new RegistroVehiculo(new Motocicleta("Honda"))

        println("Auto: " + registroAuto.vehiculo.marca)
        println("Moto: " + registroMoto.vehiculo.marca)
