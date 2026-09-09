package com.Trabajo;


public class Principito {

    private String nombre;
    private Flor rosa;

    // Según lecutura, conviene tener un constructor vacío permite instanciar y
    // luego configurar setters,
    // el constructor completo inicializa todos los atributos de una vez, evitando
    // llamadas repetidas a setters

    // Constructor vacío
    public Principito() {
        this.nombre = "";
        this.rosa = new Flor();
    }

    // Constructor completo
    public Principito(String nombre, Flor rosa) {
        this.nombre = nombre;
        this.rosa = rosa;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public Flor getRosa() {
        return rosa;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRosa(Flor rosa) {
        this.rosa = rosa;
    }

    // Métodos de comportamiento
    public void cuidar() {
        System.out.println("El Principito cuida de su rosa.");
    }

    public void regar() {
        System.out.println("El Principito riega su rosa.");
    }

    public void quitarOrugas() {
        System.out.println("El Principito quita las orugas de su rosa.");
    }
}
