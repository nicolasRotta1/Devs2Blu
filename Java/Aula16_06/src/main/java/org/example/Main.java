package org.example;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        exemploFor(scan);
    }
    public static void exemploLoop(Scanner scan){
        int contador = 0;
        while(contador <= 10){
            contador++;
            System.out.println(contador);
        }
        do{

        }while(contador <= 10);{
            contador++;
            System.out.println(contador);
        }
        while(true){
            System.out.println("1-0i\n2-Tchau\n0-Sair\nOpção: ");
            int op = scan.nextInt();

            switch(op){
                case 1:
                    System.out.println("Oi");
                    break;
                case 2:
                    System.out.println("Tchau");
                    break;
                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }

    }

    public static void exemploFor(Scanner scan){
        System.out.println("Quantas vezes deseja rodar: ");
        int qtd = scan.nextInt();
        int[] numeros = new int [qtd];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = new Random().nextInt(11);
            for (int j = 0; j < numeros.length; j++){
                System.out.println(numeros[j]);
            }
        }
    }
    public static void exMedia(Scanner scan){
        double [] notas = new double [4];
        System.out.println("Digite 4 notas: ");
        notas[0] = scan.nextDouble();
        notas[1] = scan.nextDouble();
        notas[2] = scan.nextDouble();
        notas[3] = scan.nextDouble();

        ArrayList<Double> listaNotas = new ArrayList<>();
        listaNotas.add(9.2);
        listaNotas.add(6.5);
        listaNotas.add(7.3);
        listaNotas.add(4.5);
        listaNotas.add(5.4);
        listaNotas.add(6.8);

        double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println("Média Final: "+media);

        if(media>=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println(media >= 7? "Aprovado":"Reprovado");


    }
    public static void verificarIdade(Scanner scan){
        System.out.println("Digite o idade: ");
        System.out.println(scan.nextInt()>=18 ? "Pode" : "Não pode");
    }

        public static void exemplos(Scanner scan){

        System.out.print("Qual seu nome: ");
        String nome = scan.next();
        System.out.println("Bem vindo(a), "+ nome);

        System.out.print("Qual sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Você tem "+idade+" anos");

        System.out.print("Digite um número: ");
        double num1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        double num2 = scan.nextInt();
        double soma = num1 + num2;
        double sub = num1 - num2;
        double multi = num1 * num2;
        double div = num1 / num2;

        System.out.println("Resultado da soma: "+soma);
        System.out.println("Resultado da subtração: "+sub);
        System.out.println("Resultado da multiplicação: "+multi);
        System.out.println("Resultado da divisão: "+div);

        System.out.println("Calculadora de aréa de circulo");
        System.out.print("Digite o raio do circulo: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Area: "+area+"²");

        System.out.print("Calculo de média");
        System.out.print("Insira a primeira nota: ");
        double nota1= scan.nextInt();
        System.out.print("Insira a segunda nota: ");
        double nota2= scan.nextInt();
        System.out.print("Insira a terceira nota: ");
        double nota3= scan.nextInt();
        System.out.print("Insira a quarta nota: ");
        double nota4= scan.nextInt();

        double media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("Media: "+media);

    }
}