package org.example;


import java.util.ArrayList;

public class JogoController implements  ServiceEmailJogo {

    public void listarjogos(ArrayList<Jogo> jogos) {

        for (var jogo : jogos) {
            System.out.println();

        }
    }

    public void vender(ArrayList<Jogo> jogos, int id) {
        id++;
        if (id >= 0 && id < jogos.size()) {
            Jogo jogo = jogos.get(id);

            if (jogo.getEstoque() > 0) {
                jogo.setEstoque(jogo.getEstoque() - 1);
                System.out.println(jogo.getNome() + " vendido!");
                enviarEmailCliente();
            } else {
                System.out.println("Jogo esgotado!");
            }
        } else {
            System.out.println("ID inválido!");
        }
    }


    @Override
    public void enviarEmailCliente(Cliente cliente) {
        System.out.println("Email enviado sobre a compra do jogo " + cliente.getNome());
    }
}

