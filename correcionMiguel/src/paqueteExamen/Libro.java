package paqueteExamen;

import java.time.LocalDate;

public class Libro extends Biblioteca{
    private int numeroPaginas;
    public Libro(String titulo, String autor, LocalDate fechaPublicacion, int numeroPaginas) {
        super(titulo, autor, fechaPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    void alquilar() {
        LocalDate ahora = LocalDate.now();
        setFechaAlquiler(ahora);
        setFechaDevolucion(ahora.plusMonths(1));
        setAlquilado(true);
    }

    @Override
    void mostrar() {
        System.out.println("Tipo de Ejemplar: Libro");
        System.out.println("Titulo del Libro: " + getTitulo());
        System.out.println("Autor del Libro: " + getAutor());
        System.out.println("Años de Publicacion: " + generaYears());
        System.out.println("Numero de Paginas: " + numeroPaginas);
    }


}
