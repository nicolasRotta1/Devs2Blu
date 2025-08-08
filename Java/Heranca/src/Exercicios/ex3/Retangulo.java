package Exercicios.ex3;

public class Retangulo extends FiguraGeometrica{
  private double base;
  private double altura;

  public Retangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }


  @Override
  public void calcularArea() {
    System.out.println("Area: "+this.altura * this.base);
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
}
