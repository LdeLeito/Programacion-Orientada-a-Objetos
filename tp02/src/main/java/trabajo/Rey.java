package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Rey extends Pieza {

    // Constructor Vacio
    public Rey() {
        super();
    }

    // Constructor Completo
    public Rey(Color color, int x, int y, boolean capturada) {
        super("Rey", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        List<Movimiento> movimientos = new ArrayList<>();

        if (getCapturada()) {
            return movimientos;
        }

        Casilla origen = tablero.getCasilla(getX(), getY());

        int[][] desplazamientos = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };

        for (int[] desplazamiento : desplazamientos) {
            int nuevoX = getX() + desplazamiento[0];
            int nuevoY = getY() + desplazamiento[1];

            if (tablero.estaDentroDelTablero(nuevoX, nuevoY)) {
                Casilla destino = tablero.getCasilla(nuevoX, nuevoY);

                if (puedeOcupar(destino)) {
                    movimientos.add(crearMovimiento(origen, destino));
                }
            }
        }
        return movimientos;
    }
}
