import java.time.LocalDateTime;

public class Entrada {
    //Atributos
    private final String CODIGO_ENTRADA ="ENT"; //ENT00000
    private static final Double PRECIO_ENTRADA=50.00;
    private static final LocalDateTime FECHA_HORA_INICIO =LocalDateTime.of(2024,10,21,12,30);
    private static LocalDateTime fechaHoraCompra = null;
    private static int contadorEntrada=0;
    private static final String GRUPO="Melendi";
    private String correo=null;
    private boolean estaVendida=false;
    private final String TIPO_ENTRADA;

    //Metodos
    public Entrada(String TIPO_ENTRADA) {
        Entrada.fechaHoraCompra = null;
        this.correo = null;
        Entrada.contadorEntrada++;
        this.TIPO_ENTRADA = TIPO_ENTRADA;
    }

    @Override
    public String toString() {
        return "*****************************" + "\n" +
                "Entrada: \n" +
                "CodigoEntrada= " + CODIGO_ENTRADA + contadorEntrada + "\n" +
                "Grupo= " + Entrada.GRUPO + "\n" +
                "Precio = " + Entrada.PRECIO_ENTRADA + "\n" +
                "fechaHoraInicio= " + Entrada.FECHA_HORA_INICIO + "\n" +
                "esta vendida?= " + estaVendida + "\n" +
                "fechaHoraCompra= " + fechaHoraCompra + "\n" +
                "correo= " + correo + "\n" +
                "TipoEntrada= " + TIPO_ENTRADA + "\n" +
                "*****************************";
    }

    public static double calculaPrecio(int contadorEntrada){
        return contadorEntrada*PRECIO_ENTRADA;
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

    //equals
}
