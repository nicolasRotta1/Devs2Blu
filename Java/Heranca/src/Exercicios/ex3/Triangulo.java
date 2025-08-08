package Exercicios.ex3;

public class Triangulo extends FiguraGeometrica{
  private double altura;
  private double base;

  public Triangulo(double altura, double base) {
    this.altura = altura;
    this.base = base;
  }

  @Override
  public void calcularArea() {
    System.out.println("Area: "+(base * altura) / 2);
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }
}
