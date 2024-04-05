import java.util.Scanner;

public class Currito extends Empleado{
    private String nombreJefe;

    public Currito(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    void asginarJefe(String nombreJefe){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce nombre del jefe: ");
        nombreJefe = teclado.nextLine();
    }
    @Override
    void mostrar() {
        System.out.print("Currito: ");
        super.mostrar();
        System.out.println("Nombre Jefe: " + nombreJefe);
    }
}
