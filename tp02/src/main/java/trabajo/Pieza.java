package trabajo;

import java.util.List;

public abstract class Pieza {

    private String tipo;
    private Color color;
    private int x;
    private int y;
    private boolean capturada;

    // Constructor vacio
    protected Pieza() {
        this.tipo = null;
        this.color = null;
        this.x = 0;
        this.y = 0;
        this.capturada = false;
    }

    // Constructor completo
    protected Pieza(String tipo, Color color, int x, int y, boolean capturada) {
        this.tipo = tipo;
        this.color = color;
        this.x = x;
        this.y = y;
        this.capturada = capturada;
    }

    // getters

    public String getTipo() {
        return tipo;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getCapturada() {
        return capturada;
    }

    // setters

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCapturada(boolean capturada) {
        this.capturada = capturada;
    }

    // Genera movimientos candidatos sin validar jaque; Tablero hará la validación
    // final
    public abstract List<Movimiento> generarMovimientos(Tablero tablero);

    // Método auxiliar interno para actualizar posición (package/protected)
    protected void actualizarPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
}