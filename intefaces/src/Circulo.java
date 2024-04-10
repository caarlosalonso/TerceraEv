public class Circulo implements figuraGeometrica{
    //Atributos
    private int radio;
    //Constructor

    public Circulo(int radio) {
        this.radio = radio;
    }

    //Metodos
    @Override
    public void mostrarArea() {
        double area = radio*radio*Math.PI;
        System.out.println("El área del circulo es: " +area);
    }
    @Override
    public void mostrarPerimetro() {
        double perimetro = 2*Math.PI*radio;
        System.out.println("El permímetro del circulo es: " +perimetro);
    }
}
