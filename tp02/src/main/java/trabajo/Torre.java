package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Torre extends Pieza {

    // Constructor Vacio
    public Torre() {
        super();
    }

    // Constructor Completo
    public Torre(Color color, int x, int y, boolean capturada) {
        super("Torre", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        return new ArrayList<>();
    }
}