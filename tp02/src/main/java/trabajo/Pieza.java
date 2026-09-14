package trabajo;

import java.util.List;

public abstract class Pieza {
    private String tipodePieza;
    private String Color;
    private int valor;
    private int posicionx;
    private int posiciony;
    private boolean esCapturado;
    private List movimientos;


    // Constructor vacio
    public Pieza() {
        this.Color = "";
        this.esCapturado = false;
        this.valor = 0;
        this.posicionx = 0;
        this.posiciony = 0;
        this.movimientos = null;
    }


    // metodos 
    public String obtenerMovimientosLegales() {
        return "";
    }

    public void mover(int x, int y) {
        this.posicionx = x;
        this.posiciony = y;
    }
}