package com.Trabajo;

public class Flor {
    private String nombre;
    private String sentimiento;
    private String cualidad;
    private String estado;

    // Constructor vacío
    public Flor() {
        this.nombre = "";
        this.sentimiento = "";
        this.cualidad = "";
        this.estado = "";
    }

    // Constructor completo
    public Flor(String nombre, String sentimiento, String cualidad, String estado) {
        this.nombre = nombre;
        this.sentimiento = sentimiento;
        this.cualidad = cualidad;
        this.estado = estado;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getSentimiento() {
        return sentimiento;
    }

    public String getCualidad() {
        return cualidad;
    }

    public String getEstado() {
        return estado;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSentimiento(String sentimiento) {
        this.sentimiento = sentimiento;
    }

    public void setCualidad(String cualidad) {
        this.cualidad = cualidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método público para mostrar el estado de la flor
    public void agradecer() {
        System.out.println(
                "La flor " + (nombre.isEmpty() ? "sin nombre" : nombre) + " agradece al Principito por su dedicación.");
    }
}