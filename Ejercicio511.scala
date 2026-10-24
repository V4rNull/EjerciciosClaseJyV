object Ejercicio511:

    trait Notificacion:
        def enviar(
            mensaje: String
        ): String

    class Email extends Notificacion:

        def enviar(
            mensaje: String
        ): String =
            "Enviando correo: " + mensaje

    class SMS extends Notificacion:

        def enviar(
            mensaje: String
        ): String =
            "Enviando SMS: " + mensaje

    class Push extends Notificacion:

        def enviar(
            mensaje: String
        ): String =
            "Enviando notificación: " + mensaje

    def procesarNotificacion(
        notificacion: Notificacion,
        mensaje: String
    ): String =
        notificacion.enviar(mensaje)

    def main(args: Array[String]): Unit =
        val email = new Email()
        val sms = new SMS()
        val push = new Push()

        println(procesarNotificacion(email, "Hola"))
        println(procesarNotificacion(sms, "Hola"))
        println(procesarNotificacion(push, "Hola"))