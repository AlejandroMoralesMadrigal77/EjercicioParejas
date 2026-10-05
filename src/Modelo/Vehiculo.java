package Modelo;

public class Vehiculo {
String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void arrancar() {
        System.out.println("El vehículo ha arrancado.");
    }
        public void parar() {
        System.out.println("El vehículo ha parado.");
    }

}
