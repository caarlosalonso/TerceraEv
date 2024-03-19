import java.util.Scanner;
import java.util.regex.Pattern;

public class dni {

    //Atributos
    private int numeroDNI;

    //Constructores
    public dni(int numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    //toString
    @Override
    public String toString() {
        return "numeroDNI= " + numeroDNI + getNIF(numeroDNI);
    }

    //Getters
    public int getNumeroDNI() {
        return numeroDNI;
    }
    public String getNIF(int numeroDNI){
        String nifCompleto = String.valueOf(calcularLetraNIF(numeroDNI));
        return nifCompleto;
    }

    //Setters
    public void setNIF(String nif) {
        Scanner teclado = new Scanner(System.in);
        String nifRegex = "[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]";

        System.out.println("Introduce tu NIF: ");

            nif = teclado.nextLine().toUpperCase();

        if (!Pattern.matches(nif,nifRegex)){
            throw new nifException("Error. El nif introducido no es correcto");
        }else{
            System.out.println(nif);
        }
    }

    public void setDNI(int dni){
        Scanner teclado = new Scanner(System.in);
        String dniRegex = "[0-9]{8}";

        System.out.println("Introduce tu DNI: ");

            numeroDNI = teclado.nextInt();

        if (!Pattern.matches(String.valueOf(numeroDNI),dniRegex)){
            throw new dniException("Error. El DNI introducido no es correcto.");
        }else{
            this.numeroDNI = numeroDNI;
            System.out.println(dni);
        }
    }

    private static char calcularLetraNIF(int numeroDNI){
        final String stringLetraDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        int restoDivision = numeroDNI%23;
        char letraDNI = stringLetraDNI.charAt(restoDivision);
        return letraDNI;
    }
}
