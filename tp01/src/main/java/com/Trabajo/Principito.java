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
    public void imprimirFlorPrincipito(Flor f) {
        if (f == null) {
            System.out.println("El Principito no tiene una flor asignada.");
            return;
        }
        System.out.println("----- Flor del Principito -----");
        System.out.println("Nombre: " + (f.getNombre().isEmpty() ? "sin nombre" : f.getNombre()));
        System.out.println("Sentimiento: " + (f.getSentimiento().isEmpty() ? "desconocido" : f.getSentimiento()));
        System.out.println("Cualidad: " + (f.getCualidad().isEmpty() ? "desconocida" : f.getCualidad()));
        System.out.println("Estado: " + (f.getEstado().isEmpty() ? "desconocido" : f.getEstado()));
        System.out.println("--------------------------------");
    }

    // indica que el método siguiente (en este caso toString()) sobrescribe un método de la superclase (Object.toString()).
    @Override
    public String toString() {
        return "Principito{nombre='" + nombre + "', rosa=" + (rosa == null ? "null" : rosa.toString()) + "}";
    }
}
