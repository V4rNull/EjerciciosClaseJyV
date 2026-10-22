trait Notificacion {

    def enviar(mensaje: String): String
}

class Email extends Notificacion {

    def enviar(mensaje: String): String =
        "Enviando Email: " + mensaje
}

class SMS extends Notificacion {

    def enviar(mensaje: String): String =
        "Enviando SMS: " + mensaje
}

class NotificacionPush extends Notificacion {

    def enviar(mensaje: String): String =
        "Enviando Push: " + mensaje
}

def notificar(
    notificacion: Notificacion,
    mensaje: String
): String =
    notificacion.enviar(mensaje)


object Ejercicio5 {
    def main(args: Array[String]): Unit = {   
         val email: Notificacion = new Email()
         val sms: Notificacion = new SMS()
         val push: Notificacion = new NotificacionPush()
         println(notificar(email, "Hola"))
         println(notificar(sms, "Hola"))
         println(notificar(push, "Hola"))
    
    }
}