package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Caballo extends Pieza {

    // Constructor Vacio
    public Caballo() {
        super();
    }

    // Constructor Completo
    public Caballo(Color color, int x, int y, boolean capturada) {
        super("Caballo", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        List<Movimiento> movimientos = new ArrayList<>();

        // Revisa si el caballo fue capturado
        if (getCapturada()) {
            return movimientos;
        }

        Casilla origen = tablero.getCasilla(getX(), getY());

        int[][] desplazamientos = {
                { -2, -1 }, { -2, 1 },
                { -1, -2 }, { -1, 2 },
                { 1, -2 }, { 1, 2 },
                { 2, -1 }, { 2, 1 }
        };

        for (int[] desplazamiento : desplazamientos) {
            int nuevoX = getX() + desplazamiento[0];
            int nuevoY = getY() + desplazamiento[1];

            // Verificación de la posición este dentro del tablero
            if (tablero.estaDentroDelTablero(nuevoX, nuevoY)) {
                Casilla destino = tablero.getCasilla(nuevoX, nuevoY);

                // Si puede moverse a una casilla vacía
                if (puedeOcupar(destino)) {
                    movimientos.add(crearMovimiento(origen, destino));
                }
            }
        }
        return movimientos;
    }
}
