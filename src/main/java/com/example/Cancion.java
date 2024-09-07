package com.example;

public class Cancion {
    // Atributos privados
    private String titulo;
    private String artista;
    private int duracion; 
    private String genero;
    private String album;

    public static final int SEGUNDOS_POR_MINUTO = 60;

    public Cancion() {
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getAlbum() {
        return this.album;
    }

    private int calcularDuracionMinutos() {
        return this.duracion / SEGUNDOS_POR_MINUTO;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duración: " + this.duracion + " segundos(" + calcularDuracionMinutos() + " minutos)");
        System.out.println("Género: " + this.genero);
        System.out.println("Álbum: " + this.album);
    }

    
    public void mostrarInformacion(String usuario) {
        System.out.println("Título: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Duración: " + this.duracion + " segundos (" + calcularDuracionMinutos() + " minutos)");
        System.out.println("Género: " + this.genero);
        System.out.println("Álbum: " + this.album);
        System.out.println("Escuchado en la playlist: " + usuario);
    }
}