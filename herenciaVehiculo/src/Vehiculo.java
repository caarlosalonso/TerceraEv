public abstract class Vehiculo {
    //Atributos
    protected String matricula;
    private boolean alquilado;

    //Constructores
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.alquilado = estaAlquilado();
    }

    //Metodos
    public abstract void alquilar(int dato);
    public abstract void devolver(int dato);
    boolean estaAlquilado(){
        return alquilado;

    }
    void mostrar(){
        System.out.println(estaAlquilado());
    }
}
