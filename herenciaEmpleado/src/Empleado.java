import java.util.Scanner;

public class Empleado {
    //Atributos
    private String nombre;
    private int sueldo;
    private int codigoEmpleado;
    private static int numeroEmpleados=1;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.codigoEmpleado=Empleado.numeroEmpleados++;
    }

    void subirSueldo(int aumento){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cifra a aumentar: ");
        aumento = teclado.nextInt();
        int salarioFinal = sueldo + aumento;
    }
    void mostrar() {
        System.out.println("Codigo= " + codigoEmpleado + ", Nombre= " +nombre+ ", Sueldo= " +sueldo);
    }
}
