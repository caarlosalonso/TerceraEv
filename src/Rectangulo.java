public class Rectangulo {

    private static final String NOMBRE_FIGURA ="Rectángulo";
    private static int numRectangulos = 0;
    public static final float pi = 3.1415F;
    private int x1,y1;
    private int x2,y2;
    private String nombreRectangulo;

    public Rectangulo(String nombreRectangulo, int x1, int y1, int x2, int y2) {
        this.nombreRectangulo = nombreRectangulo;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        Rectangulo.numRectangulos++;
    }
    @Override
    public String toString() {
        return "Figura= " + Rectangulo.NOMBRE_FIGURA +
                ", NºRectangulos= " + Rectangulo.numRectangulos +
                ", PI= " + Rectangulo.pi +
                ", nombre= " + nombreRectangulo +
                ", x1= " + x1 +
                ", y1= " + y1 +
                ", x2= " + x2 +
                ", y2= " + y2;
    }

    public String getNombreRectangulo() {
        return nombreRectangulo;
    }

    public void setNombreRectangulo(String nombreRectangulo) {
        this.nombreRectangulo = nombreRectangulo;
    }

    public int calcularSuperficie(){
        int base = Math.abs(x1-x2);
        int altura = Math.abs(y1-y2);
        int area = base * altura;
        return area;
    }
    public int calcularPerimetro(){
        int base = Math.abs(x1-x2);
        int altura = Math.abs(y1-y2);
        int perimetro = 2*base + 2*altura;
        return perimetro;
    }

    public void desplazar(int x, int y){
        x = 5;
        y = 5;

        x1+=x;
        x2+=x;
        y1+=y;
        y2+=y;
    }
}

