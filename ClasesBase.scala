abstract class Animal(val nombre: String)

class Perro(nombre: String) extends Animal(nombre)

class Gato(nombre: String) extends Animal(nombre)

abstract class Vehiculo(val marca: String)

class Automovil(marca: String) extends Vehiculo(marca)

class Motocicleta(marca: String) extends Vehiculo(marca)

class Persona(val nombre: String)