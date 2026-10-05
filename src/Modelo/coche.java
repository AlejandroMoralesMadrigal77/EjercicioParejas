package Modelo;

import Modelo.Reparable;
import Modelo.Vehiculo;

public class coche extends Vehiculo implements Reparable {
  int edad;

  public coche(String marca, int edad) {
    super(marca);
    this.edad = edad;
  }


  @Override
  public void pasarItv() {

  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}
