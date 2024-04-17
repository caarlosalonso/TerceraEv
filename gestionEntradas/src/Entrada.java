import java.time.LocalDateTime;

public class Entrada {
    //Atributos
    final String CODIGO_ENTRADA =""; //ENT00000
    static final Double PRECIO_ENTRADA=50.00;
    static LocalDateTime fechaHoraInicio;
    LocalDateTime fechaHoraCompra=null;
    static int contadorEntrada=1;
    static final String GRUPO="Melendi";
    String correo=null;
    boolean estaVendida=false;
    final String TIPO_ENTRADA="";

    //Metodos
    public Entrada() {
        this.fechaHoraCompra = null;
        this.correo = null;
        Entrada.contadorEntrada++;
    }

    @Override
    public String toString() {
        return "Entrada: \n" +
                "CodigoEntrada= " + CODIGO_ENTRADA +"\n" +
                "Grupo= " + Entrada.GRUPO + "\n" +
                "Precio = " + Entrada.PRECIO_ENTRADA + "\n" +
                "fechaHoraInicio= " + Entrada.fechaHoraInicio + "\n" +
                "fechaHoraCompra= " + fechaHoraCompra + "\n" +
                "correo= " + correo + "\n" +
                "TipoEntrada= " + TIPO_ENTRADA
                ;
    }

    //public int calculaPrecio(){}
    //calculaPrecio()

    //toString()

    //Getters

    //set fechaHoraCompra , correo , estaVendida

    //equals
}
