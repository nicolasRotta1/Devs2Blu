package Exercicios.ex4;

public class Gerente extends Funcionario{
  private double bonus;

  public Gerente(String nome, double salario, int carga_horaria, double bonus) {
    super(nome, salario, carga_horaria);
    this.bonus = bonus;
  }

  @Override
  public double calcular_salario_mensal() {
    double salario_m = super.calcular_salario_mensal();
    salario_m += bonus;
    return salario_m;
  }

  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }
}
