package PatronDecorador;

public class DecoradorMensajeTexto extends DecoradorMensaje {

    public DecoradorMensajeTexto(Mensaje mensaje) {
        super(mensaje);
    }

    public void enviar(String destinatario, String mensaje) {
        // Enviar mensaje de recordatorio por mensaje de texto un día antes del vencimiento
        // Utilizar la implementación de enviar mensaje de texto en el objeto "mensaje"
    }
}
