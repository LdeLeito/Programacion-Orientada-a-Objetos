package trabajo;

public @interface Movimiento {
    Casilla getCasillaOrigen();
    Casilla getCasillaDestino();

    void aplicar(Tablero tablero);
    void deshacer(Tablero tablero);
    
}
