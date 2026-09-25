package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Reina extends Pieza {

    // Constructor Vacio
    public Reina() {
        super();
    }

    // Constructor Completo
    public Reina(Color color, int x, int y, boolean capturada) {
        super("Reina", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        List<Movimiento> movimientos = new ArrayList<>();

        if (getCapturada()) {
            return movimientos;
        }

        Casilla origen = tablero.getCasilla(getX(), getY());

        int[][] direcciones = {
                { -1, -1 },
                { -1, 1 },
                { 1, -1 },
                { 1, 1 }
        };

        for (int[] direccion : direcciones) {
            int nuevoX = getX() + direccion[0];
            int nuevoY = getY() + direccion[1];
            while (tablero.estaDentroDelTablero(nuevoX, nuevoY)) {
                Casilla destino = tablero.getCasilla(nuevoX, nuevoY);
                if (destino.estaVacia()) {
                    movimientos.add(crearMovimiento(origen, destino));
                } else {
                    // Si es rival, puede capturarla.
                    if (puedeOcupar(destino)) {
                        movimientos.add(
                                crearMovimiento(origen, destino));
                    }
                    // Cualquier pieza bloquea la diagonal.
                    break;
                }
                nuevoX += direccion[0];
                nuevoY += direccion[1];
            }
        }
        return movimientos;
    }
}
