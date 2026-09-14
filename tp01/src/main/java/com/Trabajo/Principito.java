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

    // Metodo que imprime los atributos de la flor que pertenece al Principito, con manejo de valores nulos o vacíos
    public void imprimirFlorPrincipito() {
        if (rosa == null) {
            System.out.println("El Principito no tiene una flor asignada.");
            return;
        }
        System.out.println("----- Flor del Principito -----");
        System.out.println("Nombre: " + (rosa.getNombre().isEmpty() ? "sin nombre" : rosa.getNombre()));
        System.out.println("Sentimiento: " + (rosa.getSentimiento().isEmpty() ? "desconocido" : rosa.getSentimiento()));
        System.out.println("Cualidad: " + (rosa.getCualidad().isEmpty() ? "desconocida" : rosa.getCualidad()));
        System.out.println("Estado: " + (rosa.getEstado().isEmpty() ? "desconocido" : rosa.getEstado()));
        System.out.println("--------------------------------");
    }
}
