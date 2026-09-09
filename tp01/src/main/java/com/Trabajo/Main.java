package com.Trabajo;



public class Main {
    public static void main(String [] args) {
        // crear la flor rosa usando el constructor vacío
        Flor Flor1 = new Flor();
        
        // Pasando atributos por setters
        Flor1.setNombre("Rosa");
        Flor1.setSentimiento("Agradecida");
        Flor1.setCualidad("Vanidosa pero hermosa");
        Flor1.setEstado("Cuidada");

        // Crear la flor rosa usando el constructor completo
        Flor Flor2 = new Flor("Rosa completa", "Agradecida", "Vanidosa pero hermosa", "Cuidada");

        // Flor distinta

        Flor Flor3 = new Flor("Tulipán", "Alegre", "Elegante y colorido", "Feliz");

        
    // Crear Principito con la flor1
        Principito p1 = new Principito();
        p1.setNombre("Principito");
        p1.setRosa(Flor1);

        // Mostrar acciones
        System.out.println(p1);
        p1.cuidar();
        p1.regar();
        p1.quitarOrugas();
        p1.getRosa().agradecer();

        // Instancia distinta del texto
        System.out.println("Flor valores distintos del texto literario: " + Flor3);

        // Mostrar otra instancia
        Principito p2 = new Principito("Explorador", Flor2);
        System.out.println(p2);
        p2.getRosa().agradecer();
    }
}