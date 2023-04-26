package PatronDecorador;

public class DecoradorCorreoElectronico extends DecoradorMensaje {

    public DecoradorCorreoElectronico(Mensaje mensaje) {
        super(mensaje);
    }

    public void enviar(String destinatario, String mensaje) {
        // Enviar mensaje de recordatorio por correo electrónico un día antes del vencimiento
        // Utilizar la implementación de enviar correo electrónico en el objeto "mensaje"
    }
}
