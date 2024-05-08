import java.util.LinkedList;
import java.util.Scanner;

public class MainFila {
    public static void main(String[] args) {

        LinkedList <Persona> personas = new LinkedList<>();

        for (int i=0; i < 10; i++){
            Persona persona = new Persona();
            personas.add(persona);
            System.out.println(persona);
        }

        Persona persona = consultaQuienToca(personas);
        System.out.println("Le toca a la persona con código: " + persona);
        persona = sacarDeLaLista(personas);
        System.out.println("Se va la persona con código: " + persona);
        addPersona(personas);

        boolean esta = buscarPersona(personas);
        System.out.println(esta);
    }

    private static Persona sacarDeLaLista(LinkedList<Persona> personas){
        return personas.poll();
    }

    private static Persona consultaQuienToca(LinkedList<Persona> personas){
        return personas.peek();
    }
    private static void addPersona(LinkedList<Persona> personas){
        personas.offer(new Persona());
    }
    private static boolean buscarPersona(LinkedList<Persona> personas){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el código que estás buscando: ");
        String codigo = teclado.nextLine();
        Persona personaAux = new Persona(codigo);

        return personas.contains(personaAux);
    }
}