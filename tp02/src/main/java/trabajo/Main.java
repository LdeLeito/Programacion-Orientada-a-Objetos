package trabajo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
     
        TableroAjedrez tablero = new TableroAjedrez();

        Torre Torre = new Torre(Color.BLANCO,4,4,false);
            tablero.colocarPieza(Torre);
            List<Movimiento> movimientos =
            Torre.generarMovimientos(tablero);
            System.out.println("La pieza en el tablero es: "+ Torre);
            System.out.println(
            "Movimientos disponibles: " + movimientos.size()
            );
            }
}
