package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Rey extends Pieza {

    // Constructor Vacio
    public Rey() {
        super();
    }

    // Constructor Completo
    public Rey(Color color, int x, int y, boolean capturada) {
        super("Rey", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        return new ArrayList<>();
    }
}
