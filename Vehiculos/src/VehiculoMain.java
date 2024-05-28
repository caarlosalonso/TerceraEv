import Vehiculos.Avion;
import Vehiculos.VehiculoTransporte;

import java.util.ArrayList;

public class VehiculoMain {
    public static void main(String[] args) {
        ArrayList<VehiculoTransporte> listaVehiculos = new ArrayList<>();

        VehiculoTransporte v1 = new VehiculoTransporte("Boeing 747");
        VehiculoTransporte v2 = new Avion("Boeing 888",false);
        VehiculoTransporte v3 = new Avion("Boeing 747",true);

        listaVehiculos.add(v1);
        listaVehiculos.add(v2);
        listaVehiculos.add(v3);

        //Mostrar
        System.out.println("*************");
        System.out.println(listaVehiculos);
        System.out.println("*************");
        for (VehiculoTransporte v :listaVehiculos){
            System.out.println(v);
        }

        v2.vender();
        v3.vender();

        System.out.println(v2);
        System.out.println(v3);
    }
}
