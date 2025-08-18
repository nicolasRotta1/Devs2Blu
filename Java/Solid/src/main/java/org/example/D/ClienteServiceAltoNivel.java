package org.example.D;

public class ClienteServiceAltoNivel {
    private RepositorioBaixoNivel repositorio;

    public ClienteServiceAltoNivel(RepositorioBaixoNivel repositorio){
        this.repositorio =  repositorio;
    }

    public void salvarCliente(String nome){
        repositorio.salvar(nome);
    }
}
