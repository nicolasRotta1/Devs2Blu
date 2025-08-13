import Ex1.Entrega;
import Ex1.EntregaExpressa;
import Ex1.EntregaInternacional;
import Ex1.EntregaNormal;
import Ex2.Acao;
import Ex2.Investimento;
import Ex2.Poupanca;
import Ex2.TesouroDireto;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    ArrayList<Entrega> entregas = new ArrayList<>();
    ArrayList<Investimento> investimentos = new ArrayList<>();
    entregas.add( new EntregaNormal(50, 40));
    entregas.add(new EntregaExpressa(50, 40));
    entregas.add(new EntregaInternacional(50, 40));

    for (var entrega : entregas){
      System.out.println("Peso: "+entrega.getPeso()+" Distancia: "+entrega.getDistancia()+" Custo: "+entrega.calcularFrete());

    }

    investimentos.add(new Poupanca(12000, 12));
    investimentos.add(new TesouroDireto(12000, 12));
    investimentos.add(new Acao(12000, 12));

    for (var investimento : investimentos){
      System.out.println("Valor inicial: "+investimento.getValorInicial()+" Meses: "+investimento.getMeses()+ " Valor Final: "+investimento.);

    }

    }
  }
