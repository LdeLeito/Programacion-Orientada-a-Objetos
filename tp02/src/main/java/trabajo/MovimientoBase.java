package trabajo;

public abstract class MovimientoBase implements Movimiento {
    
    protected final Casilla origen;
    protected final Casilla destino;
    protected final Pieza piezaMovida;

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

    public boolean esCapturada() {
        return destino.getPieza() != null;
    }
}
