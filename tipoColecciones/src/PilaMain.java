import java.util.LinkedList;

public class PilaMain {
    public static void main(String[] args) {

        LinkedList<Pila> pilas = new LinkedList<>();

        for (int i=0;i<10;i++){
            Pila pila = new Pila();
            pilas.add(pila);
        }
        System.out.println(pilas);
        Pila pila = quienToca(pilas);
    }
    private static Pila quienToca(LinkedList<Pila> pilas){
        return pilas.pop();
    }

}
