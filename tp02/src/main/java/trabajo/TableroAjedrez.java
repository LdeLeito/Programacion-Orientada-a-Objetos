package trabajo;

import java.util.ArrayList;
import java.util.List;

public class TableroAjedrez implements Tablero {
    private Casilla[][] casillas;

    // Constructor Vacio
    public TableroAjedrez() {
        this.casillas = new Casilla[8][8];
    }

    // Constructor Completo
    public TableroAjedrez(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    // Getters
    public Casilla[][] getCasillas() {
        return casillas;
    }

    // setters
    public void setCasillas(Casilla[][] casillas) {
        this.casillas = casillas;
    }

    // Metodos

    @Override
    public Casilla getCasilla(int fila, int columna) {
        return casillas[fila][columna];
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
