public class Turismo extends Vehiculo{
    //Atributos
    private double precioKm;
    private int kmAlquiler;
    private int kmDevolucion;

    //Constructores


    public Turismo(String matricula, double precioKm, int kmAlquiler) {
        super(matricula);
        this.precioKm = precioKm;
        this.kmAlquiler = kmAlquiler;
    }

    //Metodos
    double devolverPrecio(){
        return (kmDevolucion-kmAlquiler)*precioKm;
    }

    @Override
    public void alquilar(int dato) {
        kmAlquiler = dato;
    }
    @Override
    public void devolver(int dato){

    }

    @Override
    void mostrar(){
        System.out.println("El coste es de: " +devolverPrecio());
    }

}
