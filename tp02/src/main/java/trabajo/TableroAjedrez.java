package trabajo;

import java.util.ArrayList;
import java.util.List;

public class TableroAjedrez implements Tablero {
    private Casilla[][] casillas;

    // Constructor Vacio
    public TableroAjedrez() {
        this.casillas = new Casilla[8][8];

        // Inicialización de cada casilla
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                this.casillas[fila][columna] = new Casilla(fila, columna, null);
            }
        }
    }

    // Constructor Completo
    public TableroAjedrez(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    // Getters
    @Override
    public Casilla getCasilla(int fila, int columna) {
        if (fila < 0 || fila >= 8 || columna < 0 || columna >= 8) {
            throw new IllegalArgumentException(
                    "La posición está fuera del tablero");
        }
        return casillas[fila][columna];
    }

    // setters
    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    // Metodos

    @Override 
    public boolean estaDentroDelTablero(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }
    @Override
    public void aplicarMovimiento(Movimiento movimiento) {

    }

    @Override
    public void deshacerMovimiento(Movimiento movimiento) {

    }

    @Override
    public List<Movimiento> obtenerMovimientosLegales(Pieza pieza) {
        return new ArrayList<>();
    }

}
