package ajedrez_sql;

import ajedrez_sql.Logica.TableroAjedrez;
import ajedrez_sql.Modelo.Alfil;
import ajedrez_sql.Modelo.Caballo;
import ajedrez_sql.Modelo.Color;
import ajedrez_sql.Modelo.Peon;
import ajedrez_sql.Modelo.Pieza;
import ajedrez_sql.Modelo.Reina;
import ajedrez_sql.Modelo.Rey;
import ajedrez_sql.Modelo.Torre;
import ajedrez_sql.Persistencia.PiezaDAO;

public class Main {
        public static void main(String[] args) {

                TableroAjedrez tablero = new TableroAjedrez();

                // Colocar piezas en el tablero
                colocarPiezasBlancas(tablero);
                colocarPiezasNegras(tablero);

                // Imprimir las piezas indivuales de cada color
                imprimirPiezas(tablero, Color.BLANCO);
                imprimirPiezas(tablero, Color.NEGRO);

                // Imprimir el tablero
                tablero.imprimirTablero();

                // Guardar las piezas en la base de datos

                try {
                        PiezaDAO DAO = new PiezaDAO();
                        for (int fila = 0; fila < 8; fila++) {
                                for (int columna = 0; columna < 8; columna++) {

                                        Pieza pieza = tablero
                                                        .getCasilla(fila, columna)
                                                        .getPiezaOcupante();

                                        if (pieza != null) {
                                                DAO.insertarPieza(pieza);
                                                System.out.println("Insertando: " + pieza.getTipo());
                                        }
                                }
                        }
                } catch (Exception e) {
                        e.printStackTrace();
                }
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