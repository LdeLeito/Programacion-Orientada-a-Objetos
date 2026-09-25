package trabajo;

import java.util.List;

// permite enunciar un conjunto de constantes y de cabeceras de métodos abstractos; éstos 
// deben implementarse en las clases y constituyen la interfaz de la clase.
// con ello se especifica el comportamiento común de todas las clases que implementen la 
// interfaz; su declaración es similar a la de una clase

public interface Tablero {
    Casilla getCasilla(int x, int y);

    boolean estaDentroDelTablero(int x, int y);

    void aplicarMovimiento(Movimiento movimiento);

    void deshacerMovimiento(Movimiento movimiento);

    List<Movimiento> obtenerMovimientosLegales(Pieza pieza);
    
    public void colocarPieza(Pieza pieza);
}
