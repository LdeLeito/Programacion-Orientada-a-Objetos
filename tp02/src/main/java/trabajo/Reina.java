package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Reina extends Pieza {

    // Constructor Vacio
    public Reina() {
        super();
    }

    // Constructor Completo
    public Reina(Color color, int x, int y, boolean capturada) {
        super("Reina", color, x, y, capturada);
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
