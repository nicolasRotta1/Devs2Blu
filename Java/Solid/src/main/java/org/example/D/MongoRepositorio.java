package org.example.D;

public class MongoRepositorio implements RepositorioBaixoNivel{

    @Override
    public void salvar(String nome) {
        System.out.println("Salvando no mongo "+nome);
    }
}
