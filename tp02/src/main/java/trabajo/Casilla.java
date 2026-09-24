package trabajo;

public class Casilla {
    private int x;
    private int y;
    private Pieza piezaOcupante;

    // Constructor vacio
    public Casilla() {
        this.x = 0;
        this.y = 0;
        this.piezaOcupante = null;
    }

    // Constructor completo
    public Casilla(int x, int y, Pieza piezaOcupante) {
        this.x = x;
        this.y = y;
        this.piezaOcupante = piezaOcupante;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Pieza getPiezaOcupante() {
        return piezaOcupante;
    }

    // setters
    public void setPiezaOcupante(Pieza pieza) {
        this.piezaOcupante = pieza;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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
