package Tarefa;

import java.util.Scanner;

public class Pedido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("==========================");
        System.out.println("        MENU");
        System.out.println("==========================");
        System.out.println("CODIGO | PRODUTO           | PREÇO");
        System.out.println("-------|-------------------|-------");
        System.out.println("   1   | Cachorro Quente   | R$ 20.00");
        System.out.println("   2   | X - Salada        | R$ 35.50");
        System.out.println("   3   | X - Bacon         | R$ 40.00");
        System.out.println("   4   | Torrada Simples   | R$  5.00");
        System.out.println("   5   | Refrigerante      | R$  7.50");
        System.out.println("==========================");

        int opcaoEscolhida = 0; 

        while (true) {
            System.out.print("Escolha o código do produto desejado (1-5): ");
            String inputOpcao = scanner.nextLine();
            try {
                opcaoEscolhida = Integer.parseInt(inputOpcao);
                if (opcaoEscolhida >= 1 && opcaoEscolhida <= 5) {
                    break;
                } else {
                    System.out.println("Erro: Por favor, escolha uma opção entre 1 e 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            }
        }

        System.out.println("Você escolheu a opção: " + opcaoEscolhida);

        int quantidade = 0; 
        while (true) {
            System.out.print("Digite a quantidade desejada: ");
            String inputQuantidade = scanner.nextLine();
            try {
                quantidade = Integer.parseInt(inputQuantidade);
                if (quantidade > 0) {
                    break;
                } else {
                    System.out.println("Erro: A quantidade deve ser maior que zero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
            }
        }

        double precoProduto = 0.0;
        String nomeProduto = "";

        switch (opcaoEscolhida) {
            case 1:
                nomeProduto = "Cachorro Quente";
                precoProduto = 20.00;
                break;
            case 2:
                nomeProduto = "X - Salada";
                precoProduto = 35.50;
                break;
            case 3:
                nomeProduto = "X - Bacon";
                precoProduto = 40.00;
                break;
            case 4:
                nomeProduto = "Torrada Simples";
                precoProduto = 5.00;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                precoProduto = 7.50;
                break;
        }

        double valorTotal = precoProduto * quantidade;

        System.out.println("Você pediu " + quantidade + " unidade(s) de " + nomeProduto + ".");
        System.out.printf("O valor total do seu pedido é: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}