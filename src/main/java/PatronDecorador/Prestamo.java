package PatronDecorador;

import java.util.Calendar;
import java.util.Date;

public class Prestamo {

    private String titulo;
    private Date fechaVencimiento;
    private Mensaje medioEnvio;

    public Prestamo(String titulo, Date fechaVencimiento, Mensaje medioEnvio) {
        this.titulo = titulo;
        this.fechaVencimiento = fechaVencimiento;
        this.medioEnvio = medioEnvio;
    }

    public void enviarRecordatorio() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaVencimiento);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date fechaRecordatorio = cal.getTime();

        // Crear un decorador de mensaje apropiado para el medio de envío seleccionado
        DecoradorMensaje decoradorMensaje = null;
        if (medioEnvio instanceof CorreoElectronico) {
            decoradorMensaje = new DecoradorCorreoElectronico(medioEnvio);
        } else if (medioEnvio instanceof MensajeTexto) {
            decoradorMensaje = new DecoradorMensajeTexto(medioEnvio);
        } else if (medioEnvio instanceof NotificacionPush) {
            decoradorMensaje = new DecoradorNotificacionPush(medioEnvio);
        }

        // Enviar mensaje de recordatorio usando el decorador apropiado
        decoradorMensaje.enviar("Destinatario", "Recordatorio de devolución de " + titulo + " el día " + fechaRecordatorio.toString());
    }
    
    public static void main(String[] args) {
        // Crear objeto de medio de envío de correo electrónico
        Mensaje correoElectronico = new CorreoElectronico("ejemplo@biblioteca.com");

        // Crear objeto de préstamo de libro o revista
        String titulo = "Harry Potter y la piedra filosofal";
        Date fechaVencimiento = new Date(); // hoy en día
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaVencimiento);
        cal.add(Calendar.DAY_OF_MONTH, 7); // agregar 7 días a partir de hoy
        fechaVencimiento = cal.getTime();
        Prestamo prestamo = new Prestamo(titulo, fechaVencimiento, correoElectronico);

        // Enviar recordatorio de devolución del préstamo
        prestamo.enviarRecordatorio();
    }
}
