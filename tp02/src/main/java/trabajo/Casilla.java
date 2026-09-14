package trabajo;

public class Casilla {

    // Private final es para que no se pueda cambiar la posición de la casilla una
    // vez creada
    private final int x;
    private final int y;
    private Pieza piezaOcupante;

    public Casilla(int x, int y) {
        this.x = x;
        this.y = y;
        this.piezaOcupante = null;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Pieza getPieza() {
        return piezaOcupante;
    }

    // setters
    public void setPieza(Pieza pieza) {
        this.piezaOcupante = pieza;
    }

    // Metodo para saber si la casilla esta vacia o no
    public boolean estaVacia() {
        return piezaOcupante == null;
    }

    @Override
    public String toString() {
        return String.format("Casilla[%d,%d]=%s", x, y, piezaOcupante);
    }
}
