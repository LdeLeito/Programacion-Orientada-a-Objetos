package trabajo;

// permite enunciar un conjunto de constantes y de cabeceras de métodos abstractos; éstos 
// deben implementarse en las clases y constituyen la interfaz de la clase.
// con ello se especifica el comportamiento común de todas las clases que implementen la 
// interfaz; su declaración es similar a la de una clase

public interface Movimiento {
    Casilla getOrigen();

    Casilla getDestino();

    void aplicar(Tablero tablero);

    void deshacer(Tablero tablero);

    boolean esLegal(Tablero tablero);

}