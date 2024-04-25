import java.time.LocalDateTime;

public class Vip extends Entrada{
    //Atributos
    static int contadorVip;
    //final String CODIGO_VIP; //VIP000
    static final Double SUPLEMENTO=100.00;
    static final int LIMITE_VIP=100;

    //Metodos
    public Vip() {
        super("VIP");
        //this.CODIGO_VIP = generarCodigoVip();
    }

    public static double calculaPrecio() {return Entrada.calculaPrecio() + SUPLEMENTO;}
    public static String generarCodigoVip(){
        String finalStr = String.format("%03d",contadorVip);
        String inicioStr = "VIP";

        return inicioStr + finalStr;
    }
    }
