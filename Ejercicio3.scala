trait Transporte {

    def costo(distancia: Double): Double
}

class Taxi extends Transporte {

    def costo(distancia: Double): Double =
        5 + distancia * 2.5
}

class Bus extends Transporte {

    def costo(distancia: Double): Double =
        distancia * 1.5
}

def calcularViaje(
    transporte: Transporte,
    distancia: Double
): Double =
    transporte.costo(distancia)


object Ejercicio3 {
    def main(args: Array[String]): Unit = {    
        val taxi: Transporte = new Taxi()
        val bus: Transporte = new Bus()
        println("Costo taxi (10 km): " + calcularViaje(taxi, 10))
        println("Costo bus (10 km): " + calcularViaje(bus, 10))
    }

}