public class Cuadrado implements figuraGeometrica{
    //Atributos
    private int lado;

    //Constructores
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    //Metodos
    @Override
    public void mostrarArea() {
        double area = lado*lado;
        System.out.println("El área del cuadrado es: "+area);
    }
    @Override
    public void mostrarPerimetro() {
        double permietro = lado*4;
        System.out.println("El permímetro del cuadrado es: " +permietro);
    }
}
