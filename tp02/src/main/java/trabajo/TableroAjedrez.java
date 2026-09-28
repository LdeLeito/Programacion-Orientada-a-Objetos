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

    @Override 
    public void colocarPieza(Pieza pieza) {
        Casilla casilla = getCasilla(pieza.getX(), pieza.getY());
        if (!casilla.estaVacia()) {
            throw new IllegalStateException("La casilla está ocupada");
        }
        casilla.setPiezaOcupante(pieza);
    }

    // Metodo de impresion del tablero representando con letras
    
    @Override 
    public void imprimirTablero() {
    System.out.println("\nTablero:");

    for (int fila = 7; fila >= 0; fila--) {
        System.out.print(fila + " | ");

        for (int columna = 0; columna < 8; columna++) {
            Pieza pieza =
                    casillas[fila][columna].getPiezaOcupante();

            System.out.print(obtenerSimbolo(pieza) + " ");
        }

        System.out.println();
    }

    System.out.println("  +-----------------");
    System.out.println("    0 1 2 3 4 5 6 7");
}

private String obtenerSimbolo(Pieza pieza) {
    if (pieza == null) {
        return ".";
    }

    String simbolo = switch (pieza.getTipo()) {
        case "Rey" -> "R";
        case "Reina" -> "D";
        case "Torre" -> "T";
        case "Alfil" -> "A";
        case "Caballo" -> "C";
        case "Peón" -> "P";
        default -> "?";
    };

    return pieza.getColor() == Color.BLANCO
            ? simbolo
            : simbolo.toLowerCase();
}

}
