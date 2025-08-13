package Exercicios.ex4;

public class Vendedor extends Funcionario{
  private int total_vendas;

  public Vendedor(String nome, double salario, int carga_horaria, int total_vendas) {
    super(nome, salario, carga_horaria);
    this.total_vendas = total_vendas;
  }

  @Override
  public double calcular_salario_mensal() {
    double salario_m =  super.calcular_salario_mensal();
    salario_m = salario_m + (total_vendas * 5);
    return salario_m;
  }

  public int getTotal_vendas() {
    return total_vendas;
  }

  public void setTotal_vendas(int total_vendas) {
    this.total_vendas = total_vendas;
  }
}
