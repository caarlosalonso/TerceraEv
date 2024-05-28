package Vehiculos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class VehiculoTransporte {
    //Atributos
    private String codigoVehiculo;
    private String modelo;
    private LocalDate fechaVenta;
    private Double precioVenta;
    private static int contadorVehiculos=0;
    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yyyy");

    //Constructor
    public VehiculoTransporte(String modelo){
        this.modelo=modelo;
        this.codigoVehiculo= "VEH" + String.format("%05d",++contadorVehiculos);
        this.fechaVenta=null;
        this.precioVenta=null;
    }
    //Metodos
    @Override
    public String toString() {
        if (fechaVenta==null){
            return "codigoVehiculo='" + codigoVehiculo + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", TODAVIA NO SE HA VENDIDO";
        }else{
            return "codigoVehiculo='" + codigoVehiculo + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", precio Venta=" + precioVenta + '\'' +
                    ", fechaVenta=" + fechaVenta.format(formato);

        }
    }

    public void vender(){
        this.fechaVenta=LocalDate.now();
    }

    //Setter
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    //Getter
    public Double getPrecioVenta() {
        return precioVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehiculoTransporte that)) return false;
        return Objects.equals(codigoVehiculo, that.codigoVehiculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoVehiculo);
    }
}


