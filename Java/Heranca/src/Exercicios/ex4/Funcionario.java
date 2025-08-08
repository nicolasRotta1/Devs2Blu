package Exercicios.ex4;

import java.util.Random;

public abstract class Funcionario {
  private int id;
  private String nome;
  private double salario_hora;
  private int carga_horaria;

  public Funcionario(String nome, double salario, int carga_horaria) {
    this.id = new Random().nextInt(1000);
    this.nome = nome;
    this.salario_hora = salario;
    this.carga_horaria = carga_horaria;
  }

  public double calcular_salario_mensal(){
   return  salario_hora * carga_horaria;
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario_hora;
  }

  public void setSalario(double salario_hora) {
    this.salario_hora = salario_hora;
  }

  public int getCarga_horaria() {
    return carga_horaria;
  }

  public void setCarga_horaria(int carga_horaria) {
    this.carga_horaria = carga_horaria;
  }
}
