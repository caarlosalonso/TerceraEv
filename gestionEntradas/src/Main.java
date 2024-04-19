import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entrada> listaEntradas = new ArrayList<>();
        ArrayList<Entrada> listaEntradasVendidas = new ArrayList<>();

        comprarEntrada(listaEntradas,listaEntradasVendidas);
        numeroEntradas(listaEntradas,listaEntradasVendidas);
    }

    public static void comprarEntrada(ArrayList<Entrada> listaEntradas,ArrayList<Entrada> listaEntradasVendidas) {
        Scanner tecladoLetras = new Scanner(System.in);
        Scanner tecladoNumeros = new Scanner(System.in);

        String entradaGenerada;
        String entradaRegex = "VIP|PISTA|GRADA";

        do {
            System.out.println("Que tipo de entrada quieres comprar?: ");
            entradaGenerada= tecladoLetras.nextLine().toUpperCase();

            if (!Pattern.matches(entradaRegex, entradaGenerada)) {
                System.out.println("Tipo de entrada NO VALIDO!");
            }
            switch (entradaGenerada) {
                case "VIP":
                    for (int i = 0; i < 3; i++) {
                        Entrada entrada = new Vip("VIP");
                        listaEntradas.add(entrada);
                        System.out.println(entrada);
                    }
                    break;
                case "PISTA":
                    for (int i = 0; i < Pista.LIMITE_PISTA; i++) {
                        Pista pista = new Pista("PISTA");
                        listaEntradas.add(pista);
                    }
                    break;
                case "GRADA":
                    for (int i = 0; i < Grada.LIMITE_ESTE;i++){
                        Grada grada = new Grada("GRADA");
                        listaEntradas.add(grada);
                    }
                    for (int i = 0; i < Grada.LIMITE_OESTE;i++){
                        Grada grada = new Grada("GRADA");
                        listaEntradas.add(grada);
                    }
                    for (int i = 0; i < Grada.LIMITE_SUR;i++){
                        Grada grada = new Grada("GRADA");
                        listaEntradas.add(grada);
                    }
                    break;
            }
        }while (!Pattern.matches(entradaRegex, entradaGenerada));

    }
    public static void numeroEntradas(ArrayList<Entrada> listaEntradas,ArrayList<Entrada> listaEntradasVendidas){

        Scanner tecladoNumeros = new Scanner(System.in);

        System.out.println("Cuantas entradas quieres comprar?: ");
        int numeroEntradas = tecladoNumeros.nextInt();

        for (int i=0;i< numeroEntradas;i++){
            Entrada entradaAux = listaEntradas.get(0);

            listaEntradasVendidas.add(entradaAux);
            listaEntradas.remove(entradaAux);
            entradaAux.setEstaVendida();
            entradaAux.setCorreo("lkjkjk");
            entradaAux.setFechaHoraCompra(LocalDateTime.now());


        }


        System.out.println("Disponibles");
        System.out.println(listaEntradas);
        System.out.println("Vendidas");
        System.out.println(listaEntradasVendidas);

/*
        for (Entrada entrada : listaEntradas) {

            if (!entrada.isEstaVendida()) {
                entrada.setEstaVendida();

                listaEntradasVendidas.add(entrada);
            }
        }
        for (Entrada entrada : listaEntradasVendidas){
            System.out.println(entrada);
        }
*/

        //System.out.println(Entrada.calculaPrecio(numeroEntradas));
        double total = numeroEntradas * Entrada.calculaPrecio();


    }
}
