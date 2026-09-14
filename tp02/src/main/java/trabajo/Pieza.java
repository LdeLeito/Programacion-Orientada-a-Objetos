package trabajo;

import java.util.List;

public abstract class Pieza {

    private final String tipo;
    private final Color color;
    private int x;
    private int y;
    private boolean capturada;

    // Constructor vacio
    protected Pieza(String tipo, Color color, int x, int y) {
        this.tipo = tipo;
        this.color = color;
        this.x = x;
        this.y = y;
        this.capturada = false;
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

    public boolean esCapturada() {
        return capturada;
    }

    protected void aplicarCaptura(boolean capturado) {
        this.capturada = capturado;
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