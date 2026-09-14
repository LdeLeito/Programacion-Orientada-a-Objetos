package trabajo;

public @interface Tablero {
    Casilla getCasilla(int x, int y);
    
    void aplicarMovimiento(Movimiento movimiento);
    void deshacerMovimiento(Movimiento movimiento);
    
    Lista<Movimiento> obtenerMovimientosLegales(Pieza pieza);
    
    Tablero clonar();
}
