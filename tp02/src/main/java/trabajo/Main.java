package trabajo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TableroAjedrez tablero = new TableroAjedrez();
        
        colocarPiezasBlancas(tablero);
        colocarPiezasNegras(tablero);
        imprimirPiezas(tablero, Color.BLANCO);
        imprimirPiezas(tablero, Color.NEGRO);
        tablero.imprimirTablero();
        // Prueba del caballo blanco izquierdo.
        Pieza caballo = tablero
                .getCasilla(0, 1)
                .getPiezaOcupante();
        List<Movimiento> movimientos = caballo.generarMovimientos(tablero);
        System.out.println(
                "\nMovimientos disponibles del caballo: "
                        + movimientos.size());
    }

    private static void colocarPiezasBlancas(
            TableroAjedrez tablero) {
        tablero.colocarPieza(
                new Torre(Color.BLANCO, 0, 0, false));
        tablero.colocarPieza(
                new Caballo(Color.BLANCO, 0, 1, false));
        tablero.colocarPieza(
                new Alfil(Color.BLANCO, 0, 2, false));
        tablero.colocarPieza(
                new Reina(Color.BLANCO, 0, 3, false));
        tablero.colocarPieza(
                new Rey(Color.BLANCO, 0, 4, false));
        tablero.colocarPieza(
                new Alfil(Color.BLANCO, 0, 5, false));
        tablero.colocarPieza(
                new Caballo(Color.BLANCO, 0, 6, false));
        tablero.colocarPieza(
                new Torre(Color.BLANCO, 0, 7, false));
        for (int columna = 0; columna < 8; columna++) {
            tablero.colocarPieza(
                    new Peon(
                            Color.BLANCO,
                            1,
                            columna,
                            false));
        }
    }

    private static void colocarPiezasNegras(
            TableroAjedrez tablero) {
        tablero.colocarPieza(
                new Torre(Color.NEGRO, 7, 0, false));
        tablero.colocarPieza(
                new Caballo(Color.NEGRO, 7, 1, false));
        tablero.colocarPieza(
                new Alfil(Color.NEGRO, 7, 2, false));
        tablero.colocarPieza(
                new Reina(Color.NEGRO, 7, 3, false));
        tablero.colocarPieza(
                new Rey(Color.NEGRO, 7, 4, false));
        tablero.colocarPieza(
                new Alfil(Color.NEGRO, 7, 5, false));
        tablero.colocarPieza(
                new Caballo(Color.NEGRO, 7, 6, false));
        tablero.colocarPieza(
                new Torre(Color.NEGRO, 7, 7, false));
        for (int columna = 0; columna < 8; columna++) {
            tablero.colocarPieza(
                    new Peon(
                            Color.NEGRO,
                            6,
                            columna,
                            false));
        }
    }

    private static void imprimirPiezas(
            TableroAjedrez tablero,
            Color color) {
        System.out.println(
                "Piezas de color " + color + ":");
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                Pieza pieza = tablero
                        .getCasilla(fila, columna)
                        .getPiezaOcupante();
                if (pieza != null
                        && pieza.getColor() == color) {
                    System.out.println(pieza);
                }
            }
        }
    }
}