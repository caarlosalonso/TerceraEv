import java.util.Objects;

public class Persona {

    //Atributos
    private String DNI;
    private String Nombre;
    private Integer Edad;

    //Constructores
    public Persona (String DNI,String Nombre, Integer Edad){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Edad = Edad;
    }
    public Persona(String DNI,String Nombre){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Edad = null;
    }

    //Metodos getters y setters
    public String getNombre() {return Nombre;}
    public void setNombre(String Nombre){this.Nombre = Nombre;}

    public Integer getEdad(Integer Edad){return Edad;}
    public void setEdad(Integer Edad){this.Edad = Edad;}

    public String getDNI(){return DNI;}
    //public void setDNI(String DNI){this.DNI = DNI;}

    //Metodos
    public String toString(){
        String mostrar = "DNI= " + DNI;
        mostrar = mostrar + ", Nombre= " + Nombre;
        if(Edad!= null){
            mostrar = mostrar + ", Edad= " + Edad;
        }
        return mostrar;
    }

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(DNI, persona.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI, Nombre, Edad);
    }
    public boolean esMayorDeEdad(){
        return Edad <= 18;
    }
}