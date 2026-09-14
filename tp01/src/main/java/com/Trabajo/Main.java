package com.Trabajo;



public class Main {
    public static void main(String [] args) {
        // crear la flor rosa usando el constructor vacío
        Flor FlorLiteraria = new Flor();
        
        // Pasando atributos por setters
        FlorLiteraria.setNombre("Rosa");
        FlorLiteraria.setSentimiento("Agradecida");
        FlorLiteraria.setCualidad("Vanidosa pero hermosa");
        FlorLiteraria.setEstado("Cuidada");

        // Crear la flor rosa usando el constructor completo
        Flor florPersonal = new Flor("Tulipán", "Alegre", "Elegante y colorido", "Feliz");

        // Imprimir usando la función modular dentro de Main
        System.out.println("----- Texto dinámico: flor del texto literario -----");
        imprimirTextoLiterario(FlorLiteraria);

        System.out.println("\n----- Texto dinámico: flor hecha a medida -----");
        imprimirTextoLiterario(florPersonal);
        
    // Crear Principito con la flor1
        Principito principito = new Principito();
        principito.setNombre("Principito");
        principito.setRosa(FlorLiteraria);

        System.out.println();
        imprimirTextoLiterario(FlorLiteraria);
        // Mostrar acciones
        System.out.println(principito);
        principito.cuidar();
        principito.regar();
        principito.quitarOrugas();
        principito.getRosa().agradecer();
    }

    // Función que genera el texto literario como String a partir de una Flor
    public static String generarTextoLiterario(Flor f) {
        if (f == null) {
            return "El principito no tiene una flor asignada.";
        }

        String nombre = (f.getNombre() == null || f.getNombre().isEmpty()) ? "una flor" : f.getNombre();
        String cualidad = (f.getCualidad() == null || f.getCualidad().isEmpty()) ? "sin cualidad conocida" : f.getCualidad();
        String sentimiento = (f.getSentimiento() == null || f.getSentimiento().isEmpty()) ? "indiferente" : f.getSentimiento().toLowerCase();
        String estado = (f.getEstado() == null || f.getEstado().isEmpty()) ? "en un estado desconocido" : f.getEstado();

        StringBuilder sb = new StringBuilder();
        sb.append("El principito tenía ").append(nombre).append(" que amaba mucho. ");
        sb.append("Cuidaba de ella todos los días, la regaba y le quitaba las orugas. ");
        sb.append("La flor, aunque ").append(cualidad).append(", era muy hermosa y ").append(sentimiento);
        sb.append(" al principito por su dedicación. ");
        sb.append("Estado de la flor: ").append(estado).append(".");

        // sb.toString() devuelve el texto completo generado
        return sb.toString();
    }

    // Función que imprime directamente el texto literario generado
    public static void imprimirTextoLiterario(Flor f) {
        System.out.println(generarTextoLiterario(f));
    }
}