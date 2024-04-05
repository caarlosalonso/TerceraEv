public class Jefe extends Empleado{
    private int presupuesto;

    public Jefe(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    void asignarPpto (int ppto){
        presupuesto = ppto;
    }

    @Override
    void mostrar() {
        System.out.print("Jefe: ");
        super.mostrar();
        System.out.println("Presupuesto: " +presupuesto);
    }
}
