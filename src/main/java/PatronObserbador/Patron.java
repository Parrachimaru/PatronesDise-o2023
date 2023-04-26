package PatronObserbador;

public class Patron implements PatronObservador {

    private String nombreCliente;

    public Patron(String name) {
        this.nombreCliente = name;
    }

    @Override
    public void actualizar(String bookTitle) {
        System.out.println("Hola " + nombreCliente + ", el libro " + bookTitle + " ya está disponible para su préstamo.");
    }

    public static void main(String[] args) {
        ReservaLibro libro = new ReservaLibro("El Quijote");

        Patron juan = new Patron("Juan");
        Patron maria = new Patron("Maria");

        libro.registrarObservador(juan);
        libro.registrarObservador(maria);

        libro.devolverLibro(); // Se devuelve el libro

        libro.quitarObserbador(juan); // Juan cancela la reserva

        libro.devolverLibro(); // Se devuelve el libro nuevamente
    }
}
