import java.time.LocalDate;

public class Camion extends Vehiculo{
    //Atributos
    private double precioDia;
    private int diaAlquiler;
    private int diaDevolucion;

    //Constructores

    public Camion(String matricula, double precioDia, int diaAlquiler, int diaDevolucion) {
        super(matricula);
        this.precioDia = precioDia;
        this.diaAlquiler = diaAlquiler;
        this.diaDevolucion = diaDevolucion;
    }

    //Metodos
    @Override
    public void alquilar(int dato) {
        diaAlquiler = dato;
    }

    @Override
    public void devolver(int dato) {
        diaDevolucion = dato;
    }
    double devolverPrecio(){
        return (diaDevolucion-diaAlquiler)*precioDia;
    }
    void mostar(){
        System.out.println("El precio es de: " + devolverPrecio());
    }
}
