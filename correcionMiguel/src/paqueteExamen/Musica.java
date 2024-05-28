package paqueteExamen;

import java.time.LocalDate;

public class Musica extends Biblioteca{
    private int numeroCanciones;
    public Musica(String titulo, String autor, LocalDate fechaPublicacion, int numeroCanciones) {
        super(titulo, autor, fechaPublicacion);
        this.numeroCanciones = numeroCanciones;
    }

    @Override
    void alquilar() {
        LocalDate ahora = LocalDate.now();
        setFechaAlquiler(ahora);
        setFechaDevolucion(ahora.plusDays(5));
    }

    @Override
    void mostrar() {
        System.out.println("Tipo de Ejemplar: Musica");
        System.out.println("Titulo de la Cancion : " + getTitulo());
        System.out.println("Autor de la Cancion : " + getAutor());
        System.out.println("Años desde Publicacion: " + generaYears());
        System.out.println("Numero de Canciones: " + numeroCanciones);
    }
}
