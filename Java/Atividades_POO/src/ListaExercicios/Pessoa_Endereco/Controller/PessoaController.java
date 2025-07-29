package ListaExercicios.Pessoa_Endereco.Controller;

import ListaExercicios.Pessoa_Endereco.Models.Endereco;
import ListaExercicios.Pessoa_Endereco.Models.Pessoa;


public class PessoaController {

    public Pessoa criarPessoa(String nome, String cpf, Endereco endereco) {
        return new Pessoa(nome, cpf, endereco);
    }

    public void exibirDados(Pessoa pessoa){
        System.out.println(pessoa.getId()+" pessoa");
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("CPF: "+pessoa.getCpf());
        System.out.println("Endereço: "+pessoa.getEndereco().getCep());
    }
}
