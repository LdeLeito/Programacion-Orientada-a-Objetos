package trabajo;

public class MovimientoNormal extends MovimientoBase {

    // Constructor Vacio
    public MovimientoNormal() {
        super();
    }

    // Constructor Completo
    public MovimientoNormal(Casilla origen, Casilla destino, Pieza piezaMovida) {
        super(origen, destino, piezaMovida);
    }

    // Metodos
    @Override
    public void aplicar(Tablero tablero) {
        destino.setPiezaOcupante(piezaMovida);
        origen.setPiezaOcupante(null);

        piezaMovida.setX(destino.getX());
        piezaMovida.setY(destino.getY());
    }

    @Override
    public void deshacer(Tablero tablero) {
        origen.setPiezaOcupante(piezaMovida);
        destino.setPiezaOcupante(null);

        piezaMovida.setX(origen.getX());
        piezaMovida.setY(origen.getY());
    }

    @Override
    public boolean esLegal(Tablero tablero) {
        return origen != null
                && destino != null
                && piezaMovida != null;
    }
}
