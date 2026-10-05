package Modelo;

public class Moto extends Vehiculo implements  Reparable{

    private int cilindrada;

    public Moto(String marca, int cilindrada) {
        super(marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void pasarItv() {

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
