package PatronObserbador;

import java.util.ArrayList;
import java.util.List;

public class ReservaLibro implements Subject {

    private String Libro;
    private List<PatronObservador> ListaLibros;

    public ReservaLibro(String nombreLibro) {
        this.Libro = nombreLibro;
        this.ListaLibros = new ArrayList<>();
    }

    public void registrarObservador(PatronObservador observer) {
        ListaLibros.add(observer);
    }

    public void quitarObserbador(PatronObservador observer) {
        ListaLibros.remove(observer);
    }

    public void actualizarEstado(String nombreLibro) {
        for (PatronObservador observer : ListaLibros) {
            observer.actualizar(nombreLibro);
        }
    }

    public void devolverLibro() {
        // lógica para devolver el libro a la biblioteca
        actualizarEstado(Libro);
    }

    @Override
    public void registerObserver(PatronObservador Observador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeObserver(PatronObservador Observador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
