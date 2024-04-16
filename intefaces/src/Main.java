import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        circulo.mostrarArea();
        circulo.mostrarPerimetro();
        Cuadrado cuadrado = new Cuadrado(4);
        cuadrado.mostrarArea();
        cuadrado.mostrarPerimetro();
        Triangulo triangulo = new Triangulo(2,4);
        triangulo.mostrarArea();
        triangulo.mostrarPerimetro();


        ArrayList <FiguraGeometrica> figuras = new ArrayList<>();
        ArrayList <Circulo> circulos = new ArrayList<>();
        ArrayList <Cuadrado> cuadrados = new ArrayList<>();
        ArrayList <Triangulo> triangulos = new ArrayList<>();

        Circulo circulo1 = new Circulo(20);
        figuras.add(circulo1);

        //Bucle for in que muestre las figuras
        for (FiguraGeometrica figura : figuras){
            figura.mostrarArea();
            figura.mostrarPerimetro();
        }
    }
}