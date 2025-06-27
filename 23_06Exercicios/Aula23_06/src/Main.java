import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>();
        produtos.put("Pacote de Arroz",7.80);
        produtos.put("Feijoada Congelada", 18.99);
        produtos.put("Porco inteiro", 120.50);
        System.out.println(produtos.get("Porco inteiro"));

        HashMap<Integer, Integer> tamanhoCalcado = new HashMap<>();
        tamanhoCalcado.put(7,36);
        tamanhoCalcado.put(8,37);
        tamanhoCalcado.put(8,39);
        tamanhoCalcado.put(9,41);
        System.out.println(tamanhoCalcado.get(7));
        }
    }