package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LojaEstranha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ClienteController clienteController = new ClienteController();
        JogoController jogoController = new JogoController();

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Jogo> jogos = new ArrayList<>();

        clientes.add(new Cliente("Lucas", "lucas@email.com"));

        jogos.add(new Jogo("Super Mario", 150, 5));
        jogos.add(new Jogo("Zelda", 200, 3));






        while(true) {
            System.out.println("\n===== MENU ESTRANHO =====");
            jogoController.listarjogos(jogos);
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");

            int opcao = scan.nextInt();

            if (opcao == 0)break;

            if (jogos.contains(jogos.get(opcao+1))) {
                jogoController.vender(jogos, opcao);
            } else{
                    System.out.println("Opção inválida, tente novamente!");
                }
            }
        scan.close();
        }
    }