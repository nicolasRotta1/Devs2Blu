import Exercicios.ex1.Aviao;
import Exercicios.ex1.Carro;
import Exercicios.ex1.Veiculo;
import Exercicios.ex2.ContaCorrente;
import Exercicios.ex2.ContaPoupanca;
import Exercicios.ex3.Retangulo;
import Exercicios.ex3.Triangulo;
import Exercicios.ex4.Gerente;
import Exercicios.ex4.Vendedor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    Carro carro = new Carro("Ferrari", 1999, "Ferrari 2342");
    Aviao aviao = new Aviao("Boing", 2002, "Azul");

    aviao.detalhes();
    carro.detalhes();

    ContaCorrente contaCorrente = new ContaCorrente("Nicolas", 1000, 2000);
    ContaPoupanca contaPoupanca = new ContaPoupanca("Nícolas", 1000, 10);

    contaPoupanca.depositar(1000000);
     contaPoupanca.aplicarJuros(5);
    contaPoupanca.consulta_saldo();

    Retangulo retangulo = new Retangulo(10, 10);
    Triangulo triangulo = new Triangulo(15, 15);

    retangulo.calcularArea();
    triangulo.calcularArea();

    Gerente gerente = new Gerente("Antonio", 5000, 40, 200);
    Vendedor vendedor = new Vendedor("Geraldo", 2500, 44, 20);

    gerente.calcular_salario_mensal();
    vendedor.calcular_salario_mensal();



  }
}