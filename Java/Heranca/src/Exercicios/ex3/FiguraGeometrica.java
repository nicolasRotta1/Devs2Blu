package Exercicios.ex3;

import java.util.Random;

public abstract class FiguraGeometrica {
  private int id;
  public abstract void calcularArea();

  public FiguraGeometrica() {
    this.id = new Random().nextInt(1000);
  }

  public int getId() {
    return id;
  }

}
