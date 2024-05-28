import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 */
public class EmpleadoMain {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        EmpleadoFunciones.anadirDatos(listaEmpleados);

        String opcionRegex = "[0-7]";
        int opcionNumero;
        String opcion;

        do {
            do {
                EmpleadoFunciones.menu();
                opcion = teclado.nextLine();
            }while(!Pattern.matches(opcionRegex,opcion));

            opcionNumero= Integer.parseInt(opcion);

            switch (opcionNumero) {
                case 1:
                    EmpleadoFunciones.mostrarLista(listaEmpleados);
                    break;
                case 2:
                    EmpleadoFunciones.altaEmpleado(listaEmpleados);
                    break;
                case 3:
                    EmpleadoFunciones.buscarEmpleado(listaEmpleados);
                    break;
                case 4:
                    EmpleadoFunciones.buscarDepartamento(listaEmpleados);
                    break;
                case 5:
                    EmpleadoFunciones.borrarEmpleado(listaEmpleados);
                    break;
                case 6:
                    EmpleadoFunciones.subirSueldo(listaEmpleados);
                    break;
                case 7:
                    EmpleadoFunciones.mostrarSalarioMesActual(listaEmpleados);
                    break;
            }
        }while (opcionNumero!=8);
    }
}