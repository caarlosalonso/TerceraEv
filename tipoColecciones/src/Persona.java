import java.util.Objects;

public class Persona {
    //Atributos
    private final String Codigo;
    private static int contadorCodigo=1;

    //Constructor
    public Persona() {
        this.Codigo = generarCodigo();
    }

    public Persona(String codigo) {
        Codigo = codigo;
    }

    //Metodos
    @Override
    public String toString() {
        return Codigo + "\n";
    }
    public static String generarCodigo(){
        return String.format("%02d",contadorCodigo++);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(Codigo, persona.Codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Codigo);
    }
}
