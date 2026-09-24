package trabajo;

public abstract class MovimientoBase implements Movimiento {

    protected Casilla origen;
    protected Casilla destino;
    protected Pieza piezaMovida;

    // Constructor vacío
    protected MovimientoBase() {
        this.origen = null;
        this.destino = null;
        this.piezaMovida = null;
    }

    // Constructor completo
    protected MovimientoBase(Casilla origen, Casilla destino, Pieza piezaMovida) {
        this.origen = origen;
        this.destino = destino;
        this.piezaMovida = piezaMovida;
    }

    // getters
    @Override
    public Casilla getOrigen() {
        return origen;
    }

    @Override
    public Casilla getDestino() {
        return destino;
    }

    public Pieza getpiezaMovida() {
        return piezaMovida;
    }

    public boolean esCaptura() {
        return destino.getPiezaOcupante() != null && !destino.estaVacia();
    }

    // setters
    public void setOrigen(Casilla origen) {
        this.origen = origen;
    }

    public void setDestino(Casilla destino) {
        this.destino = destino;
    }

}
