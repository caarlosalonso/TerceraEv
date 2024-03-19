public class CuentaMain {
    public static void main(String[] args) {

        //Creamos varias personas
        Persona persona1 = new Persona ("54898622Z", "Carlos", 21);
        Persona persona2 = new Persona ("54898623S", "Alvaro", 16);
        Persona persona3 = new Persona ("50460448N", "María Isabel", 50);

        //Creamos varias cuentas
        Cuenta cuenta1 = new Cuenta(11111,persona1,25000f);
        Cuenta cuenta2 = new Cuenta(22222, persona2,50000f);
        Cuenta cuenta3 = new Cuenta(33333,persona3,5000f);

        //Mostraremos la información de cada uno (usamos el método toString)
        System.out.println("Mostramos todas las cuentas:");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);


    }
}
