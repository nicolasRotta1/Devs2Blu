package org.example;

public class Service {

        public void processarCartao(Cliente cliente, double valor) {
            System.out.println("Pagamento de R$" + valor + " processado para " + cliente.getNome());
        }

        public void enviarEmailConfirmacao(Cliente cliente) {
            System.out.println("Email de confirmação enviado para " + cliente.getNome());
        }




}
