package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Alfil extends Pieza {

    // Constructor Vacio
    public Alfil() {
        super();
    }

    // Constructor Completo
    public Alfil(Color color, int x, int y, boolean capturada) {
        super("Alfil", color, x, y, capturada);
    }

    @Override
    public List<Movimiento> generarMovimientos(Tablero tablero) {
        List<Movimiento> movimientos = new ArrayList<>();

        if (getCapturada()) {
            return movimientos;
        }

        Casilla origen = tablero.getCasilla(getX(), getY());
        

        }
    }
}
