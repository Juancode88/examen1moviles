package com.example;

public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Aprueba de fuego", "Grupo Niche", 140);

        cancion.setGenero("Salsa");
        cancion.setAlbum("Cali del alma");

        cancion.mostrarInformacion();

        cancion.mostrarInformacion("Juan Carlos");
    }
}