package PatronObserbador;

public interface Subject {

    void registerObserver(PatronObservador Observador);

    void removeObserver(PatronObservador Observador);

    void actualizarEstado(String bookTitle);
}
