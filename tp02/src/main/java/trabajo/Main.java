package trabajo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TableroAjedrez tablero = new TableroAjedrez();

        // Prueba de movimientos bloqueado por Torre enemiga
        Reina reina = new Reina( Color.BLANCO, 4, 4, false);
        Torre rival = new Torre(Color.NEGRO, 4, 6, false);
        tablero.colocarPieza(reina);
        tablero.colocarPieza(rival);
        List<Movimiento> movimientos = reina.generarMovimientos(tablero);
        System.out.println("Movimientos: " + movimientos.size());
        for (Movimiento movimiento : movimientos) {
            System.out.println(
                    movimiento.getDestino().getX()
                            + ", "
                            + movimiento.getDestino().getY());
        }
    }
}