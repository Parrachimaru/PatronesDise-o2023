package PatronDecorador;

public abstract class DecoradorMensaje implements Mensaje {

    protected Mensaje mensaje;

    public DecoradorMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
}
