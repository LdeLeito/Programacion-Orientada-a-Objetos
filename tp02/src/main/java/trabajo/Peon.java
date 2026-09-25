package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Peon extends Pieza {

    // Constructor Vacio
    public Peon() {
        super();
    }

    // Constructor Completo
    public Peon(Color color, int x, int y, boolean capturada) {
        super("Peón", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        List<Movimiento> movimientos = new ArrayList<>();

        if (getCapturada()) {
            return movimientos;
        }

        Casilla origen = tablero.getCasilla(getX(), getY());

        int direccion;
        int filaInicial;

        if (getColor() == Color.BLANCO) {
            direccion = 1;
            filaInicial = 1;
        } else {
            direccion = -1;
            filaInicial = 6;
        }
        agregarAvanceSimple(tablero, movimientos, origen, direccion);
        agregarAvanceDoble(tablero, movimientos, origen, direccion, filaInicial);
        agregarCapturas(tablero, movimientos, origen, direccion);
        return movimientos;
    }

    private void agregarAvanceSimple(Tablero tablero, List<Movimiento> movimientos, Casilla origen, int direccion) {
        int nuevoX = getX() + direccion;
        int nuevoY = getY();

        if (tablero.estaDentroDelTablero(nuevoX, nuevoY)) {
            Casilla destino = tablero.getCasilla(nuevoX, nuevoY);

            if (destino.estaVacia()) {
                movimientos.add(crearMovimiento(origen, destino));
            }
        }
    }

    private void agregarAvanceDoble(Tablero tablero, List<Movimiento> movimientos, Casilla origen, int direccion,
            int filaInicial) {

        if (getX() != filaInicial) {
            return;
        }
        int xIntermedia = getX() + direccion;
        int xDestino = getX() + 2 * direccion;

        Casilla intermedia = tablero.getCasilla(xIntermedia, getY());
        Casilla destino = tablero.getCasilla(xDestino, getY());

        if (intermedia.estaVacia() && destino.estaVacia()) {
            movimientos.add(crearMovimiento(origen, destino));
        }
    }

    private void agregarCapturas (Tablero tablero, List<Movimiento> movimientos, Casilla origen, int direccion) {
        int nuevoX = getX() + direccion;
        int[] desplazamientosY = {-1, 1};

        for(int desplazamientoY : desplazamientosY) {
            int nuevoY = getY() + desplazamientoY;

            if (tablero.estaDentroDelTablero(nuevoX, nuevoY)) {
                Casilla destino = tablero.getCasilla(nuevoX, nuevoY);
                if (!destino.estaVacia() && puedeOcupar(destino)) {
                    movimientos.add(crearMovimiento(origen, destino));
            }
        }
    }
}
}
