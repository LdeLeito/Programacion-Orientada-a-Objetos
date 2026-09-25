package trabajo;

public class MovimientoNormal extends MovimientoBase {

    private Pieza piezaCapturada;

    // Constructor Vacio
    public MovimientoNormal() {
        super();
        this.piezaCapturada = null;
    }

    // Constructor Completo
    public MovimientoNormal(Casilla origen, Casilla destino, Pieza piezaMovida) {
        super(origen, destino, piezaMovida);
        this.piezaCapturada = null;
    }

    // Metodos
    @Override
    public void aplicar(Tablero tablero) {
        // Comprobacion de poder hacer el movimiento
        piezaCapturada = destino.getPiezaOcupante();
        if (piezaCapturada != null) {
            piezaCapturada.setCapturada(true);
        }

        origen.setPiezaOcupante(null);
        destino.setPiezaOcupante(piezaMovida);

        piezaMovida.setX(destino.getX());
        piezaMovida.setY(destino.getY());
    }

    @Override
    public void deshacer(Tablero tablero) {
        destino.setPiezaOcupante(piezaCapturada);
        origen.setPiezaOcupante(piezaMovida);

        piezaMovida.setX(origen.getX());
        piezaMovida.setY(origen.getY());

        // Comprobacion de si esta capturada
        if (piezaCapturada != null) {
            piezaCapturada.setCapturada(false);
        }
    }

    // Metodo compun a todas las subclases de clase abstracta Pieza
    @Override
    public boolean esLegal(Tablero tablero) {
        return origen != null
                && destino != null
                && piezaMovida != null;
    }
}
