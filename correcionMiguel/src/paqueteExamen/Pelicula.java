package paqueteExamen;

import java.time.LocalDate;

public class Pelicula extends Biblioteca{
    private int duracionPelicula;
    public Pelicula(String titulo, String autor, LocalDate fechaPublicacion, int duracionPelicula) {
        super(titulo, autor, fechaPublicacion);
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    void alquilar() {
        LocalDate ahora = LocalDate.now();
        setFechaAlquiler(ahora);
        setFechaDevolucion(ahora.plusWeeks(2));
    }

    @Override
    void mostrar() {
        System.out.println("Tipo de Ejemplar: Pelicula");
        System.out.println("Titulo de la Pelicula : " + getTitulo());
        System.out.println("Autor de la Pelicula : " + getAutor());
        System.out.println("Años desde Publicacion: " + generaYears());
        System.out.println("Duracion de Pelicula: " + duracionPelicula);
    }
}

