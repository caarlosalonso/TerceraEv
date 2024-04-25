import java.time.LocalDateTime;

public class Entrada {
    //Atributos
    private final String CODIGO_ENTRADA; //ENT00000
    private static final Double PRECIO_ENTRADA=50.0;
    private static LocalDateTime fechaHoraInicio;
    private static LocalDateTime fechaHoraCompra = null;
    private static int contadorEntrada=0;
    private static final String GRUPO="Melendi";
    private String correo=null;
    private boolean estaVendida=false;
    private final String TIPO_ENTRADA;

    //Metodos
    public Entrada(String TIPO_ENTRADA) {
        Entrada.contadorEntrada++;
        this.CODIGO_ENTRADA = generarCodigo();
        Entrada.fechaHoraCompra = null;
        this.correo = null;
        this.TIPO_ENTRADA = TIPO_ENTRADA;
    }


    @Override
    public String toString() {
        return  "**********Entrada**********: \n" +
                "CodigoEntrada= " + CODIGO_ENTRADA + "\n" +
                "Grupo= " + Entrada.GRUPO + "\n" +
                "Precio = " + Entrada.PRECIO_ENTRADA + "\n" +
                "estaVendida?= " + estaVendida + "\n" +
                "fechaHoraInicio= " + Entrada.fechaHoraInicio + "\n" +
                "fechaHoraCompra= " + fechaHoraCompra + "\n" +
                "correo= " + correo + "\n" +
                "TipoEntrada= " + TIPO_ENTRADA + "\n" ;
    }

    public static double calculaPrecio(){
        return PRECIO_ENTRADA;
    }
    public static String generarCodigo(){
        String finalStr = String.format("%05d",contadorEntrada);
        String inicioStr = "ENT";

        return inicioStr + finalStr;
    }

    //Getters y Setters

    public void setFechaHoraCompra() {
        Entrada.fechaHoraCompra = LocalDateTime.now();
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void setEstaVendida() {
        this.estaVendida = true;
    }
    public boolean isEstaVendida() {
        return estaVendida;
    }
    //equals
}
