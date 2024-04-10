public class Triangulo implements figuraGeometrica{
    //Atributos
    private int base;
    private int altura;

    //Constructores
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodos
    @Override
    public void mostrarArea() {
        double area = (double) (base * altura) /2;
        System.out.println("El área del triangulo es: " +area);
    }
    @Override
    public void mostrarPerimetro() {
        double perimetro = base*3;
        System.out.println("El permímetro del triangulo es: "+perimetro);
    }
}
