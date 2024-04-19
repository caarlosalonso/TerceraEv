import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entrada> listaEntradas = new ArrayList<>();
        ArrayList<Entrada> listaEntradasVip = new ArrayList<>();
        ArrayList<Entrada> listaEntradasPista = new ArrayList<>();
        ArrayList<Entrada> listaEntradasGrada = new ArrayList<>();
        ArrayList<Entrada> listaEntradasVendidas = new ArrayList<>();

        generarEntrada(listaEntradas,listaEntradasVendidas,listaEntradasVip,listaEntradasPista,listaEntradasGrada);
        comprarEntradas(listaEntradas,listaEntradasVendidas,listaEntradasVip,listaEntradasPista,listaEntradasGrada);
    }

    //Esta funcion genera todas las entradas máximas por cada tipo de entrada
    public static void generarEntrada(ArrayList<Entrada> listaEntradas,ArrayList<Entrada> listaEntradasVendidas,ArrayList<Entrada> listaEntradasVip,ArrayList<Entrada> listaEntradasPista,ArrayList<Entrada> listaEntradasGrada) {

                    for (int i = 0; i < Vip.LIMITE_VIP; i++) {
                        Entrada entrada = new Vip();
                        listaEntradas.add(entrada);
                        listaEntradasVip.add(entrada);
                        System.out.println(entrada);
                    }
                    for (int i = 0; i < Pista.LIMITE_PISTA; i++) {
                        Entrada entrada = new Pista();
                        listaEntradas.add(entrada);
                        listaEntradasPista.add(entrada);
                    }
                    for (int i = 0; i < Grada.LIMITE_ESTE;i++){
                        Entrada entrada = new Grada();
                        listaEntradas.add(entrada);
                        listaEntradasGrada.add(entrada);
                    }
                    for (int i = 0; i < Grada.LIMITE_OESTE;i++){
                        Entrada entrada = new Grada();
                        listaEntradas.add(entrada);
                        listaEntradasGrada.add(entrada);
                    }
                    for (int i = 0; i < Grada.LIMITE_SUR;i++){
                        Entrada entrada = new Grada();
                        listaEntradas.add(entrada);
                        listaEntradasGrada.add(entrada);
                    }
    }
    /*
    public static void comprarEntradas(ArrayList<Entrada> listaEntradas,ArrayList<Entrada> listaEntradasVendidas){

        Scanner tecladoNumeros = new Scanner(System.in);

        System.out.println("Cuantas entradas quieres comprar?: ");
        int numeroEntradas = tecladoNumeros.nextInt();

        for (int i=0;i< numeroEntradas;i++){
            Entrada entradaAux = listaEntradas.get(0);

            listaEntradasVendidas.add(entradaAux);
            listaEntradas.remove(entradaAux);
            entradaAux.setEstaVendida();
            entradaAux.setCorreo("lkjkjk");
            entradaAux.setFechaHoraCompra();
        }


        System.out.println("Disponibles");
        System.out.println(listaEntradas);
        System.out.println("Vendidas");
        System.out.println(listaEntradasVendidas);

        //System.out.println(Entrada.calculaPrecio(numeroEntradas));
        double total = numeroEntradas * Entrada.calculaPrecio();
    }
     */
    public static void comprarEntradas(ArrayList<Entrada> listaEntradas,ArrayList<Entrada> listaEntradasVendidas,ArrayList<Entrada> listaEntradasVip,ArrayList<Entrada> listaEntradasPista,ArrayList<Entrada> listaEntradasGrada){
        Scanner tecladoLetras = new Scanner(System.in);
        Scanner tecladoNumeros = new Scanner(System.in);

        String entradaGenerada;
        String entradaRegex = "VIP|PISTA|GRADA";

        do {
            System.out.println("Que tipo de entrada quieres comprar?: ");
            entradaGenerada= tecladoLetras.nextLine().toUpperCase();

            System.out.println("Cuantas entradas quieres comprar?: ");
            int numeroEntradas = tecladoNumeros.nextInt();

            if (!Pattern.matches(entradaRegex, entradaGenerada)) {
                System.out.println("Tipo de entrada NO VALIDO!");
            }
            switch (entradaGenerada) {
                case "VIP":
                    for (int i=0;i< numeroEntradas;i++){ //Bucle que itera tantas veces como entradas se requieran
                        Entrada entradaAux = listaEntradasVip.get(0); //Creamos una entrada auxiliar que coge la entrada de la listaVip en la posicion 0.
                        listaEntradasVendidas.add(entradaAux); //Añadimos la entradaAuxiliar a la lista de entradas vendidas.
                        listaEntradasVip.remove(entradaAux); //Quitamos la entrada de la lista de entradas Vip, para no volver a asignarla
                        entradaAux.setEstaVendida(); //Marcamos al entrada como vendida con un booleano
                        entradaAux.setCorreo(introducirCorreo()); //Añadimos el correo al que se va a enviar la entrada
                        entradaAux.setFechaHoraCompra(); //Añadimos tambien la fecha de compra de la entrada.

                        System.out.println("Vendidas");
                        System.out.println(listaEntradasVendidas);
                    }
                    break;
                case "PISTA":

                    break;
                case "GRADA":



                    break;
            }
        }while (!Pattern.matches(entradaRegex, entradaGenerada));
    }
    public static String introducirCorreo(){
        Scanner teclado = new Scanner(System.in);

        String correo;
        //String correoRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        //do {
            System.out.println("Introduce tu correo electronico: ");
            correo = teclado.nextLine().toLowerCase();
        //}while (!Pattern.matches(correo,correoRegex));
        return correo;
    }
}
