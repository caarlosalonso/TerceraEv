public class Pila {
    //Atributos
    private final String CODIGO;
    private static int contadorCodigo=1;

    //Constructor
    public Pila() {
        this.CODIGO = generarCodigo();
    }
    //Metodos

    @Override
    public String toString() {
        return CODIGO;
    }

    private static String generarCodigo(){
        return String.format("%02d",contadorCodigo++);
    }
}
