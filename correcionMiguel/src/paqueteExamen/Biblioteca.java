package paqueteExamen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class  Biblioteca {
    private String codigo;
    private String titulo;
    private boolean alquilado;
    private String autor;
    private LocalDate fechaPublicacion;
    private LocalDate fechaAlquiler = null;
    private LocalDate fechaDevolucion = null;
    private static int numeroEjemplares;

    public Biblioteca(String titulo, String autor, LocalDate fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.codigo = "Bib" + String.format("%06d", numeroEjemplares++);
    }



    abstract void alquilar();


    abstract void mostrar();

    public void mostrarAmpliado() {
        System.out.println("Codigo = " + codigo + '\n' +
                "Fecha de Alquiler = " + fechaAlquiler + '\n' +
                "Fecha de Devolucion = " + fechaDevolucion + '\n' +
                "Esta Alquilado? = " + comprobarAlquilado() + '\n');
                mostrar();
    }

    public long generaYears(){
        LocalDate tiempoAhora = LocalDate.now();
        return ChronoUnit.YEARS.between(fechaPublicacion, tiempoAhora);
    }

    public String comprobarAlquilado(){
        if (!alquilado){
            return "Esta Disponible para Alquilar";
        } else {
            return "Ejemplar Alquilado";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Biblioteca that)) return false;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public static int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public static void setNumeroEjemplares(int numeroEjemplares) {
        Biblioteca.numeroEjemplares = numeroEjemplares;
    }
}