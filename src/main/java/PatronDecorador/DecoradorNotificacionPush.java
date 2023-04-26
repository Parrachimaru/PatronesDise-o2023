package PatronDecorador;

public class DecoradorNotificacionPush extends DecoradorMensaje {

    public DecoradorNotificacionPush(Mensaje mensaje) {
        super(mensaje);
    }

    public void enviar(String destinatario, String mensaje) {
        // Enviar mensaje de recordatorio por notificación push un día antes del vencimiento
        // Utilizar la implementación de enviar notificación push en el objeto "mensaje"
    }
}
