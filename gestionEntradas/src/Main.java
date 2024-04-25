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

    public static void comprarEntradas(ArrayList<Entrada> listaEntradas,ArrayList<Entrada> listaEntradasVendidas,ArrayList<Entrada> listaEntradasVip,ArrayList<Entrada> listaEntradasPista,ArrayList<Entrada> listaEntradasGrada) {
        Scanner tecladoLetras = new Scanner(System.in);
        Scanner tecladoNumeros = new Scanner(System.in);

        int numeroEntradas;

        String entradaGenerada;
        String entradaRegex = "VIP|PISTA|GRADA";
        String zonaGrada = null;
        String zonaGradaRegex = "ESTE|SUR|OESTE";

        do {
            System.out.println("Que tipo de entrada quieres comprar?: ");
            entradaGenerada = tecladoLetras.nextLine().toUpperCase();


            do {
                System.out.println("Cuantas entradas quieres comprar?: ");
                numeroEntradas = tecladoNumeros.nextInt();
                
                if (entradaGenerada.equals("GRADA")) {
                    do {
                        System.out.println("Que zona de la grada quieres?(ESTE,SUR,OESTE): ");
                        zonaGrada = tecladoLetras.nextLine().toUpperCase();
                    } while (Pattern.matches(zonaGrada, zonaGradaRegex));
                }

                //Función que calcula el precio total de las entradas en base al tipo de entrada y el número de ellas.
                calculaPrecioEntradas(entradaGenerada,numeroEntradas);

            } while (numeroEntradas > 20);

            String correo = introducirCorreo();

            if (!Pattern.matches(entradaRegex, entradaGenerada)) {
                System.out.println("Tipo de entrada NO VALIDO!");
            }
            switch (entradaGenerada) {
                case "VIP":
                    for (int i = 0; i < numeroEntradas; i++) { //Bucle que itera tantas veces como entradas se requieran
                        Entrada entradaAux = listaEntradasVip.get(0); //Creamos una entrada auxiliar que coge la entrada de la listaVip en la posicion 0.
                        listaEntradasVendidas.add(entradaAux); //Añadimos la entradaAuxiliar a la lista de entradas vendidas.
                        listaEntradasVip.remove(entradaAux); //Quitamos la entrada de la lista de entradas Vip, para no volver a asignarla
                        entradaAux.setEstaVendida(); //Marcamos al entrada como vendida con un booleano
                        entradaAux.setCorreo(correo); //Añadimos el correo al que se va a enviar la entrada
                        entradaAux.setFechaHoraCompra(); //Añadimos tambien la fecha de compra de la entrada.
                    }

                    System.out.println("Vendidas");
                    System.out.println(listaEntradasVendidas); //Mostramos las entradas vendidas
                    System.out.println("Quedan: " + listaEntradasVip.size() + " entradas vip.");
                    break;
                case "PISTA":
                    for (int i = 0; i < numeroEntradas; i++) {
                        Entrada entradaAux = listaEntradasPista.get(0);
                        listaEntradasVendidas.add(entradaAux);
                        listaEntradasVip.remove(entradaAux);
                        entradaAux.setEstaVendida();
                        entradaAux.setCorreo(correo);
                        entradaAux.setFechaHoraCompra();
                    }
                    System.out.println("Vendidas");
                    System.out.println(listaEntradasVendidas); //Mostramos las entradas vendidas
                    System.out.println("Quedan: " + listaEntradasPista.size() + " entradas de pista.");
                    break;
                case "GRADA":
                    
                        switch (zonaGrada) {
                            case "ESTE":
                                for (int i = 0; i < numeroEntradas; i++){
                                    Entrada entradaAux = listaEntradasGrada.get(0);
                                    listaEntradasVendidas.add(entradaAux);
                                    listaEntradasGrada.remove(entradaAux);
                                    entradaAux.setEstaVendida();
                                    entradaAux.setCorreo(correo);
                                    entradaAux.setFechaHoraCompra();
                                }
                                System.out.println("Vendidas");
                                System.out.println(listaEntradasVendidas); //Mostramos las entradas vendidas
                                System.out.println("Quedan: " + listaEntradasGrada.size() + " entradas de grada."); //Añadir lista que especifique en que zona de la grada esta cada entrada y una lista grada general que recoja todas las zonas de la grada.
                                break;
                            case "OESTE":
                                for (int i = 0; i < numeroEntradas; i++){
                                    Entrada entradaAux = listaEntradasGrada.get(0);
                                    listaEntradasVendidas.add(entradaAux);
                                    listaEntradasGrada.remove(entradaAux);
                                    entradaAux.setEstaVendida();
                                    entradaAux.setCorreo(correo);
                                    entradaAux.setFechaHoraCompra();
                                }
                                System.out.println("Vendidas");
                                System.out.println(listaEntradasVendidas); //Mostramos las entradas vendidas
                                System.out.println("Quedan: " + listaEntradasGrada.size() + " entradas de grada.");
                                break;
                            case "SUR":
                                for (int i = 0; i < numeroEntradas; i++){
                                    Entrada entradaAux = listaEntradasGrada.get(0);
                                    listaEntradasVendidas.add(entradaAux);
                                    listaEntradasGrada.remove(entradaAux);
                                    entradaAux.setEstaVendida();
                                    entradaAux.setCorreo(correo);
                                    entradaAux.setFechaHoraCompra();
                                }
                                System.out.println("Vendidas");
                                System.out.println(listaEntradasVendidas); //Mostramos las entradas vendidas
                                System.out.println("Quedan: " + listaEntradasGrada.size() + " entradas de grada.");
                                break;
                        }
                        break;
                    

            }
        }while (!Pattern.matches(entradaRegex, entradaGenerada));
    }
    public static String introducirCorreo(){
        Scanner teclado = new Scanner(System.in);

        String correo;
        //String correoRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        //do {
            System.out.println("Introduce tu correo electronico para confirmar la compra: ");
            correo = teclado.nextLine().toLowerCase();
        //}while (!Pattern.matches(correo,correoRegex));
        return correo;
    }
    public static void calculaPrecioEntradas(String entradaGenerada, double numeroEntradas) {
        double total;

        if (entradaGenerada.equals("VIP")) {
            total = numeroEntradas * Vip.calculaPrecio();

        } else if (entradaGenerada.equals("GRADA")) {
            total = numeroEntradas * Grada.calculaPrecio();
        }else {
            total = numeroEntradas * Pista.calculaPrecio();
        }
        System.out.println("El precio total serían: " + total);
    }
}
