import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Lista normal, acepta repetidos
        ArrayList<String> Lista = new ArrayList<>();
        ArrayList<String> ListaRepetidos = new ArrayList<>();
        //Set List, no acepta repetidos (los detecta con equals)
        //HashSet <String> Lista = new HashSet<>();

        Lista.add("Madrid");
        Lista.add("Barcelona");
        Lista.add("Málaga");
        Lista.add("Sevilla");
        Lista.add("Madrid");

        //Lista.forEach(arg -> System.out.println("Ciudad: "+arg));

        for (int i=0; i<Lista.size();i++){
            int contadorCiudad=0;

            for (String s : Lista) {
                if (Lista.get(i).equals(s)) {
                    contadorCiudad++;
                    System.out.println("Has visitado: " +s+ " " +contadorCiudad+ " veces.");
                }

            }
        }
    }
}