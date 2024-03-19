import java.util.Scanner;

public class MainRectangulo {
    public static void main(String[] args) {
        int perimetroRectangulo, areaRectangulo;

        Rectangulo rectangulo1 = new Rectangulo("Primero",1,1,2,2);
        System.out.println(rectangulo1);

        areaRectangulo = rectangulo1.calcularSuperficie();
        System.out.println("Área: " + areaRectangulo);

        perimetroRectangulo = rectangulo1.calcularPerimetro();
        System.out.println("Perimetro: " + perimetroRectangulo);

        //int desplazoRectangulo = rectangulo1.desplazar();

        System.out.println("------------------------------------");

        Rectangulo rectangulo2 = new Rectangulo("Segundo",1,1,3,3);
        System.out.println(rectangulo2);

        areaRectangulo = rectangulo2.calcularSuperficie();
        System.out.println("Área: " + areaRectangulo);

        perimetroRectangulo = rectangulo2.calcularPerimetro();
        System.out.println("Perimetro: " + perimetroRectangulo);


    }
}
