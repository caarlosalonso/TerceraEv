import java.time.LocalDateTime;

public class Pista extends Entrada{
    //Atributos
    static final int LIMITE_PISTA=2900;

    //Metodos
    public Pista(LocalDateTime fechaHoraCompra, String correo, boolean estaVendida) {
        super(fechaHoraCompra, correo, estaVendida);
    }
}
