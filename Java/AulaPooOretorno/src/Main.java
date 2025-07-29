import Exemplo2.Peixe;
import Exemplo1.Pessoa;
public class Main {
    public static void main(String[] args) {
//            Pessoa pessoa = new Pessoa();
//            pessoa.id = 1;
//            pessoa.nome = "Joel";
//            pessoa.idade = 22;
//            pessoa.altura = 1.89;

//            Pessoa pessoa2 = new Pessoa(2, "Nicolas", 17, 1.74);
//            System.out.println("id: "+ pessoa2.id);
        Peixe peixe1 = new Peixe();
        peixe1.id = 1;
        peixe1.especie = "POPO";
        peixe1.peso = 34;
        peixe1.tamanho = 9875;

        Peixe peixe2 = new Peixe(2, "tilapia", 20, 80);
                                                                                
        System.out.println();

        }
    }
