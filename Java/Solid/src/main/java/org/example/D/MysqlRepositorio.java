package org.example.D;

public class MysqlRepositorio implements RepositorioBaixoNivel{

    @Override
    public void salvar(String nome) {
        System.out.println("Salvando no mysql" +nome);
    }
}
