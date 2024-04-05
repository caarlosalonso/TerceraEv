public class EmpleadoMain {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pepe", 50000);
        empleado.mostrar();

        Jefe jefe = new Jefe("JoseJefe", 80000);
        jefe.mostrar();

        Currito currito = new Currito("CamiloCurrito", 60000);
        currito.mostrar();
    }
}