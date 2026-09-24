package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Peon extends Pieza {

    // Constructor Vacio
   public Peon() {
        super();
   }

   // Constructor Completo
    public Peon(Color color, int x, int y, boolean capturada) {
        super("Peón", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        return new ArrayList<>();
    }
}
