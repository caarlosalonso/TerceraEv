import java.util.Objects;

public class Cuenta {

    //Atributos
    private static String nombreBanco = "BBVA";
    private Integer Codigo;
    private Persona Titular;
    private Float Cantidad;

    //Constructores
    public Cuenta (Integer Codigo, Persona Titular, Float Cantidad){
        this.Codigo = Codigo;
        this.Titular = Titular;
        this.Cantidad = Cantidad;
    }

    //Metodos
    public String toString(){
        String mostrar = "Nombre banco= " + Cuenta.nombreBanco;
        mostrar = mostrar + ", Codigo= " + Codigo;
        mostrar = mostrar + ", Titular= " + Titular;
        mostrar = mostrar + ", Cantidad= " + Cantidad;
        return mostrar;
    }

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Objects.equals(Codigo, cuenta.Codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Codigo);
    }

    public void ingresarDinero (float variacion){this.Cantidad+=variacion;}
    public void retirarDinero (float variacion){this.Cantidad-=variacion;}
}
