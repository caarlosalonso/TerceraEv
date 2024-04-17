import java.time.LocalDateTime;

public class Vip extends Entrada{
    //Atributos
    static int contadorVip;
    final String CODIGO_VIP=""; //VIP000
    static final Double SUPLEMENTO=100.00;
    static final int LIMITE_VIP=100;

    //Metodos
    public Vip(LocalDateTime fechaHoraCompra, String correo, boolean estaVendida) {
        super(fechaHoraCompra, correo, estaVendida);
    }
}
